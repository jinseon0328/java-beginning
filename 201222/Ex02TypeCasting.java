/*형변환(typecasting)
형변환이란 어떤 데이터타입의 값을
다른 데이터타입으로 바꾸는 것을 형변환(typecasting)이라고 한다.

형변환에는 2가지 종류가 있다.
1. 암시적 형변환(implicit typecasting)
   우리가 별다른 명령어를 적지 않아도 자바 내부적으로
   해당 자료형을 다른 자료형으로 바꿔주는 것을 암시적 형변환이라고 한다.
   암시적 형변환은 데이터 손실이 발생하지 않을 때 자동으로 발생한다.
   예를 들어 더 큰 데이터타입을 가진 공간에 더 작은 데이터타입의 값을 넣을 때에는 암시적 형변환이 발생한다.
   예시 : int 변수에 byte 변수값을 넣어줄 때
   또는 해당 데이터타입이 표현가능한 범위 안의 값을 넣어줄 때
   암시적 형변환이 발생한다.
   왜냐하면 자바에서는 정수의 기본 데이터타입이 int이기 때문에
          예시 byte myByte = 45;
          위 코드에서 45는 int 타입이다. ->2진법 바이트에 넣어줄 수 있겠네!
          하지만 byte가 표현가능한 범위 안에 속하기 때문에, 자바가 내부적으로
          45를 byte 로 바꿔서 myByte에 저장하게 된다!

2. 명시적 형변환(explicit typecasting)
   명시적 형변환의 경우, 데이터 손실이 발생할 수 있는 경우면
   암시적 형변환이 발생할 수 없으므로 우리가 직접 형변환을 지시해주어야 한다.
   명시적 형변환은
   변수 = (바꿀 데이터타입)값;
   으로 해줄 수 있다.
   
overflow와 underflow
overflow란 값이 해당 자료형의 최대값을 벗어나는 바람에 오히려 -값으로 변경되는 것을
오버플로우 라고 한다.
반대로 값이 해당 자료형의 최소값을 벗어나는 바람에 오히려 +값으로 변경되는 것을
언더플로우라고 한다.
기본적으로 오버플로우나 언더플로우는 에러가 발생하면 막혀지지만
우리가 명시적 형변환을 통해서 오버플로우 혹은 언더플로우를 강제로 발생시킬 수 있다!

*/
class Ex02TypeCasting {
    public static void main(String[] args){
        int myInt = 345;
        byte myByte = 35;
        System.out.println("myInt의 현재값: ");
        System.out.println(myInt);
        System.out.println("myByte의 현재값: ");
        System.out.println(myByte);

        

        //암시적 형변환을 실행시켜보자 
        myInt = myByte;
        //위 코드는 myInt 공간에 myByte의 현재값을 할당하라 
        //라는 의미가 된다
        System.out.println("암시적 형변환 실행");
       
        System.out.println("myInt의 현재값: ");
        System.out.println(myInt);
        System.out.println("myByte의 현재값: ");
        System.out.println(myByte);

        myInt = 10;
        /*myByte = myInt;
        myByte =myInt; 코드는 에러가 발생한다.
        왜냐하면, myInt에 10이 들어가있지만
        프로그램 내부적으론 마이인트는 32자리 2진법 숫자이고
        마이바이트는 8자리이기 때문에, 데이터 손실이 발생할 수도 있기 때문이다.
        따라서 우리가 인트의 값을 바이트에 넣어줄 때에는 
        명시적 형변환을 해야한다. 
        */
        myByte = (byte)myInt;
        System.out.println("명시적 형변환 실행");
       
        System.out.println("myInt의 현재값:");
        System.out.println(myInt);
        System.out.println("myByte의 현재값: ");
        System.out.println(myByte);

        /* 오버플로우와 언더프로우
        byte의 경우 -128~127까지가 가능한 값의 범위이다..
        그렇다면 그 이상 혹은 그 이하의 값을 넣게 되면 어떻게 될까?

        */
        myByte = 30;
        System.out.println("myByte의 현재값: ");
        System.out.println(myByte);
        myByte = (byte)128;
        System.out.println("오버플로우 발생");
        System.out.println("myByte의 현재값: ");
        System.out.println(myByte);

        /* 2진법 128은
        1000 0000이다..
        만약 byte가 아니라 short에 저장됐으면?
        0000 0000 1000 0000이 되므로
        128이라는 숫자가 그대로 나오게 된다.

        하지만 byte의 경우
        총 8자리이기 때문에
        1000 0000이 된다.
        하지만 컴퓨터의 숫자체계에서 
        맨 앞자리가 1이면 -이고
        나머지가 0이면
        -의 최소값, 즉 -128이 된다.
        이렇게 표현 가능 범위를 벗어나 음의 최소값으로 가서
        값이 깨지는 현상을 오버플로우라고 한다. 

        반대로 음의 최소값보다 작은값이 들어와서
        양의 정수로 빠지는 것을 언더플로우라고 한다
        
        */

        myByte = (byte)(-128 - 5);
        System.out.println("언더플로우 발생");
        /*-128 -5는 -133이지만
        언더플로우가 발생하여
          = --129 -4 -> 123이 myByte에 할당되게 된다. */
        System.out.println("myByte의 현재값: ");
        System.out.println(myByte);

        /* 그래서 우리가 자바에서
        정수형 변수를 만들 때에는
        기본적으로 인트를 사용하고
        만약 값의 범위가 +-20억을 초과하는 경우,
        데이터타입을 long으로 하면
        오버플로우 혹은 언더플로우 문제에서 비교적 자유롭다
        */


    }
    
}
