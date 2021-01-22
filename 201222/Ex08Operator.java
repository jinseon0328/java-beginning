/* 연산자 03 - 비교 연산자
두 개의 값을 비교한다.
>, >=, <, <=, ==, !=
비교연산자는 결과값이 true/false의 boolean 값이 나오게 된다.
 */
class Ex08Operator {
    public static void main(String[] args){

        int number1 = 30;
        int number2 = 27;

        //"number1의 현재값이 number2의 현재값보다 큽니까?"
        System.out.println("number1 > number2 :" +(number1 > number2));
        //"number1의 현재값이 number2의 현재값보다 작습니까?"
        System.out.println("number1 < number2 :" +(number1 < number2));
        
        //"number1의 현재값이 number2의 현재값보다 크거나 같습니까?"
        System.out.println("number1 >= number2 :" +(number1 >= number2));
        //"number1의 현재값이 number2의 현재값보다 작거나 같습니까?"
        System.out.println("number1 <= number2 :" +(number1 <= number2));


        //"number1의 현재값이 number2의 현재값과 같습니까?"
        System.out.println("number1 == number2 :" +(number1 == number2));
        //"number1의 현재값이 number2의 현재값과 다릅니까?"
        System.out.println("number1 != number2 :" +(number1 != number2));

        /* 하지만 비교연산자를 쓸 때 한가지 주의할 점이 있다.
           참조형 데이터타입의 값을 비교할 경우에는 비교연산자를 사용하면 안된다.

           String이란?
           여러개의 문자를 한번에 다루는 "문자열" 클래스이다.
         */

//String 변수를 만들어보자        
String string1 = new String("abc");
//String 변수를 만들 때 abc라는 초기값을 넣어 만들어라
String string2 = "abc";
// 이 abc는 상수다  abc를 어디에 넣는 건 가능하지만 이 abc글자 자체를 바꿀 수는 없다
// 일반적인 클래스는 new를 써서 선언하지 않으면 안되지만 예외적으로 String은 ""선언이 가능하다
String string3 = string2;

System.out.println("----------string 변수의 값 출력----");
System.out.println("string1: ("+ string1 +")");
System.out.println("string2: ("+ string2 +")");
System.out.println("string3: ("+ string3 +")");
System.out.println("----------------------------------");

System.out.println("----------string 변수의 값 비교----");
System.out.println("string1 == string2: " + (string1 == string2));
System.out.println("string1 == string3: " + (string1 == string3));
System.out.println("string2 == string3: " + (string2 == string3));
System.out.println("----------------------------------");

/* 비교연산자는 해당 공간에 저장된 '값'을 비교한다.
기본형 데이터타입의 경우 해당 공간에 실제 값이 2진법으로 저장되기 때문에
비교연산자를 사용하여 정확한 비교값을 얻을 수 있다.

하지만 참조형 데이터타입의 경우에는 실제 값이 아닌 주소 값이 저장되어있다.
그리고 비교연산자는 그 주소값을 비교하게 된다!!

따라서 주소값을 비교하는 것이 아니라
해당 클래스형 변수의 실제 값을 비교하기 위해서는 
우리가 그 변수 안에 저장되어 있는
equals()라는 기능(=메소드)를 실행해 주어야 한다.

클래스형 변수의 메소드를 실행하기 위해서는
접근연산자.을 이용해서 우리가 해당 변수 안의 메소드를 실행시켜야 한다.


 */
System.out.println("---------equals() 메소드를 통한 비교------");
System.out.println("string1.equals(string2): "+ (string1.equals(string2)));
System.out.println("string1.equals(string3): "+ (string1.equals(string3)));
System.out.println("string2.equals(string3): "+ (string2.equals(string3)));
System.out.println("----------------------------------------");
//-> 여기서 접근연산자는 점(.)이고 equals()는 메소드이다.
    }
}