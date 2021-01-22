/*기본형 데이터 타입 01 - 정수형(integer)
정수란? 소수점이 없는 숫자
자바에는 기본형 데이터타입 중 정수를 담당하는 데이터타입은 다음과 같이 있다.
1. byte
    크기 : 8비트
    범위 : -2^7~2^7-1 ->표현할 수 있는 숫자는 2의 8승
2. short
    크기 : 16비트
    범위 : -2^15~2^15-1
3. int
    크기 : 32비트
    범위 : -2^31~2^31-1
4. long 
   크기 : 64비트
    범위 : -2^63~2^63-1
비트란? 
2진법 자릿수 1개를 뜻한다.
8비트 = 2진법 8자리
예를 들어 바이트의 경우 8비트이므로
8자리 2진법 숫자를 뜻한다.

10진법이란? 각 자릿수가 10의 제곱이고, 한 자리당 0~9까지 10개의 숫자로 이루어진 숫자체계이다.
예를 들어 12345 -> 여기서 1은 1이 아니라 1*10000이다. 

2진법이란? 각 자릿수가 2의 제곱이고, 한 자리당 0~1까지 2개의 숫자로 이루어진 숫자체계이다.

16진법이란? 각 자릿수가 16의 제곱이고, 한 자리당 0~15까지 16개의 숫자로 이루어진 숫자체계이다.

컴퓨터의 숫자 체계
컴퓨터의 숫자 체계에서 가장 왼쪽자리는 부호를 뜻한다.
0이면 +, 1이면 -이다.

하지만 이렇게 숫자체계가 만들어짐으로써 다음과 같은 형태가 나오게 된다.
byte 기준 +인 숫자 중 가장 작은 수는?
0000 0000 -> 0
byte 기준 -인 숫자 중 가장 작은 수는?
1000 0000 -> -128
하지만 이러한 숫자 체계 때문에 발생하는 버그가 있다.
그것이 바로 overflow, underflow라고 불리는 버그이다.

*/
class Ex01Integer {
    public static void main(String[] args) {
        
        byte myByte = 10;
        System.out.println("myByte의 현재값:");
        System.out.println(myByte);

        Short myShort = 100;
        System.out.println("myShort의 현재값");
        System.out.println(myShort);

        int myInt = 10000;
        System.out.println("myInt의 현재값");
        System.out.println(myInt);

        long mylong = 1123456789;
        System.out.println("mylong의 현재값");
        System.out.println(mylong);
    }
}