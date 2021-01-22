/* 연산자
연산자란 
수학적 기호에 
프로그래밍적 기능이 정의되어 있어서
우리가 그 기호를 적으면 해당 기능이 실행된다.

연산자에는 크게
산술, 할당, 비교, 논리, 쉬프트 -> 쉬프트는 엄선생님이... -> 나머지 4개는 깊숙히 배운다
5가지 연산자가 있다.

연산자 01 - 산술연산자
산술연산자는
간단한 사칙연산 + 나머지를 구하는 5가지 연산자가 있다.
+: 2개의 값을 더한다.
-: 2개의 값을 뺀다.
*: 2개의 값을 곱한다.
/: 2개의 값을 나눈 몫을 구한다.
%: 2개의 값을 나눈 나머지를 구한다.
*/
class Ex06Operator {
    public static void main(String[] args){
    System.out.println("3+5");
    System.out.println(3+5);
    System.out.println("3-5");
    System.out.println(3-5);
    System.out.println("3*5");
    System.out.println(3*5);
    System.out.println("3/5");
    System.out.println(3/5);
    /*나누기의 경우에는 정수형끼리의 나눗셈은 몫만 결과로 나오게 된다.
    즉 3/5의 경우 몫은 0이기 때문에
    결과가 0으로 출력이 된다.
    */
    System.out.println("3%5");
    System.out.println(3%5);
    /* 서로 다른 데이터타입끼리의 연산은
    더 큰 데이터타입이 결과의 데이터타입이 된다.
    int와 long을 연산하면 long이 결과 데이터타입이 되고
    double과 float을 연산하면 double이 결과 데이터타입이 된다.

    정수형끼리는 정수, 실수끼리는 실수가 나온다.
    만약 정수형과 실수형을 연산하면
    결과는 실수가 나오게 된다.

    */
    System.out.println("3 + 5.0");
    System.out.println(3 + 5.0);
    System.out.println("3 - 5.0");
    System.out.println(3 - 5.0);
    System.out.println("3 * 5.0");
    System.out.println(3 * 5.0);
    System.out.println("3 / 5.0");
    System.out.println(3 / 5.0);
    System.out.println("3 % 5.0");
    System.out.println(3 % 5);

    //주의할 점
    //아래의 두 코드는 결과가 다르다.
    double myDouble = 3/5;
    /*위 코드는 3/5의 결과값을
    double로 저장해라는 의미이기 때문이다
    3/5는 int/int이기 때문에 
    결과값이 0이된다.
    그리고 0을 double로 저장하면 0.0이 된다!
    */

    double myDouble2 = 3/5.0;
    /* 위 코드는 3/5.0의 결과값을
    double로 저장해라는 의미이다.
    3/5.0은 int/double이기 때문에
    결과값은 0.6이 된다.
    그리고 0.6을 double myDouble2에 할당하게 된다!
     */
    System.out.println("myDouble의 현재값: ");
    System.out.println(myDouble);

    System.out.println("myDouble2의 현재값: ");
    System.out.println(myDouble2);

    //아래 세 줄의 차이는?
    System.out.println(10 + 100);
    System.out.println("10 + 100");
    
    System.out.println("10" + 100);
    //->int

    /* 만약 ""혹은 String에 +가 붙으면
    앞에 내용 뒤에 뒤의 내용을 이어 붙여라는 의미가 된다.
    즉 "10"+"100"은
    앞의글자 10 뒤에 뒤의 글자 100을 이어서
    10100으로 만들어라 라는 의미가 된다.

    "10"+100은
    뒤의 int 100을 "100"이라는 글자로 바꾸어서
    앞의 글자 10 뒤에 뒤의 글자 100을 이어서
    10100으로 만들어라 라는 의미가 된다.

     
     */


    }

    
}
