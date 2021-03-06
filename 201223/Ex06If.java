/* 제어문(Control Statement)
제어문이란? 특정 코드 블락이 실행될지 혹은 반복될지를 결정하는 코드
크게 조건문과 반복문이 있다.
조건문: "조건"이 맞으면 코드를 실행
반복문: "조건"이 맞으면 코드를 반복

코드 블락
코드 블락이란 { } 으로 감싸진 코드 전체를 한 개의 코드 블락이라고 한다.
한 개의 코드 블락 안에는 여러 개의 코드 블락이 들어올 수도 있다.
그러한 구조에서는 상위 코드 블락 안에 속한 모든 하위 코드 블락은
상위 코드 블락의 코드로 취급이 된다.

코드 블락이 중요한 이유는, 변수의 유효범위와 관계되기 때문이다.
변수의 유효범위는 그 변수가 선언된 위치부터
해당 변수가 속한 코드 블락이 종료될 때까지이다.

예를 들어서
{ // 코드 블락 A
    int number = 5;
        {// 코드 블락 B 
         int number2 = 10;
        }
} -> int number 5는 19번줄부터 23번줄 중괄호 전까지 유효
-> int number2 10은 21번줄부터 22번줄 중괄호 전까지 유효
변수가 유효한 범위에서는 똑같은 이름의 변수를 만들 수 없다!
즉 코드블락 B에서 number라는 변수는 쓸 수 없음
  
파이썬에서는
우리가 몇번 들여쓰기를 하느냐에 따라서 코드블락이 지정되지만
자바에서는
{ }로 코드블락이 결정된다. -> { }을 생략하지 맙시다.

조건문
조건문이란? 특정 조건을 만족할 시에 
해당 코드 블락이 실행이 되는 코드를 말한다.
조건문에는 크게
if, switch 2개에 삼항연산자를 포함하는 경우도 있다.

if : 특정 조건식이 true가 나오면 코드 블락 실행
switch: 변수의 값에 따라 코드 실행
삼항연산자: 특정 조건식이 true일 떄와 false일 때 값을 선택 -> 코드를 실행하지는 않고 어떤 값을 실행할때 쓰임.



 */
/* if
가장 많이 쓰이는 조건문으로써
if(조건식){
    실행할 코드
}
의 형태를 지니고 있다

조건식이란, 결과값이 true/false가 나오는
비교연산자, 논리연산자의 결과값 혹은 메소드를 조건식이라고 한다.
 */
class Ex06If {
    public static void main(String[] args){
        int number = 3;
        if(number >= 0){
            System.out.println("number는 자연수입니다.");
        }
System.out.println("프로그램 종료");

    }
    
}
