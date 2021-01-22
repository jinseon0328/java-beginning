/* 자바 파일 생성시 주의할 점
자바의 클래스 이름과 파일 이름은 일치해야 한다.

변수(Variable)
변수란 "변"하는 "수"라는 의미인데
우리가 특정 공간에 이름을 붙이고 해당 공간에 값을 변경 가능한 상태로 바꾸는 것이다.
상수 = 항"상" 같은 "수"

변수의 경우, 우리가 해당 공간에 어떠한 종류의 값이 들어갈 수 있는지 그리고
앞으로 그 공간을 뭐라고 부를지를 지정하고
그리고 그 공간에 값을 넣어줄 수 있게 된다.

변수의 경우, 해당 공간에 들어갈 수 있는 값의 종류와 공간의 이름을 지정하는 것을 "선언"이라고 하고
맨 처음 값을 넣는 것을 초기화,
그 다음부터 해당 공간에 값을 넣는 것을 할당이라고 한다.

변수의 종류는 크게 2가지로 나뉜다.
1. 기본형
   해당 공간에 2진법으로 변환된 값이 직접 저장됨
   우리가 해당 변수를 "호출"하면 그 값이 그대로 나옴
2. 참조형
   해당 공간에 값이 아니라 진짜 값이 저장된 곳의 
   주소가 저장되고, 우리가 그 실제 값이 무엇인지,
   그리고 그 형의 저장되어 있는 기증은 뭐가 있는지 확인하기 위해서는
   그 주소를 "참조"해서 자바가 확인하는 타입

   기본형에는 다음과 같은 분류가 있다.
   1. 정수형: byte, short, int, long
   2. 실수형: float, double
   3. 문자형: char
   4. 논리형: boolean

   참조형에는 다음과 같은 분류가 있다.
   1. 클래스형 
   2. 배열형
   3. 인터페이스형

   변수를 선언하는 방법
   데이터타입 변수이름
   데이터 타입이란? 우리가 위에 적어놓은 기본형 중 하나(byte나 char) 혹은 클래스의 이름 등이 오게 된다.

   변수의 값을 초기화하거나 할당하는 방법
   변수이름 = 값;
*/

class Ex02Variable{
    public static void main(String[] args){
        //변수를 선언해보자
        int number;

        //변수를 초기화해보자
        number = 43;
        //이진법으로 변환되어서 공간에 저장된다

        //변수의 현재값을 출력해보자
        System.out.println("number의 현재값");
        System.out.println(number);
        //number라는 저장 공간에 가서 확인해 보니 43이 있더라 -> 출력

        //변수에 새로운 값을 할당해보자
        number = 221;
        //다시 이진법으로 변환해서 number 공간에 저장한다
        System.out.println("number의 현재값");
        //number 공간으로 가서
        System.out.println(number);
        //number 공간 안 숫자 확인해서 출력




        //정수형 변수, 실수형 변수, 문자형 변수, 논리형 변수 값 넣어서 출력해보기

        byte number1;
        number1 = 10;
        System.out.println("number1의 현재값");
        
        short number2;
        number2 = 3210;
        System.out.println("number2의 현재값");

        int number3;
        number3 = 876543210;
        System.out.println("number3의 현재값");

        long number4;
        number4 = 876543210;
        System.out.println("number4의 현재값");

        float number5;
        number5 = 01234567;
        System.out.println("number5의 현재값");

        double number6;
        number6 = 01234567;
        System.out.println("number6의 현재값");











    }
}