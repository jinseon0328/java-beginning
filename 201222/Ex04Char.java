/* 기본형 데이터타입 03-char
char은 character의 줄임말로써
글자 한개를 할당하는 데이터타입이다
캐릭터의 단점은 글자를 딱 하나마 할당하기 때문에
실제론 많이 쓸 일이 없다라는 것이 단점이 된다.

기본형 데이터타입은
해당 공간에 이진법 숫자가 저장이 된다.
그렇다면 글자를 담당하는 char은 어떤 이진법 숫자를 저장할까?
char는 ASCII 테이블이라는 특수한 문자표를 사용하여
해당글자의 코드값을 저장하고
우리가 변수 혹은 상수를 호출하면 그 코드값과 일치하는 글자를 보여준다.

char 값의 경우
우리가 ''에 글자 한개를 넣어서 만들게 된다.
*/
public class Ex04Char {
    public static void main(String[] args){
        // char 변수를 선언하고 대문자 A로 초기화해보자
        char myChar = 'A';
        /*위 코드에서 myChar는
        대문자 A를 아스키 테이블에서 확인하면
        65라는 코드값이 있고 Decimal -> 10진법
        해당 코드값을 2진법으로 변환하여
        myChar 안에 저장한다 */

        System.out.println("myChar의 현재값");
        System.out.println(myChar);

        /*char타입의 공간 안에는 실질적으론
        숫자가 저장되기 때문에
        다음과 같은 코드도 가능하다

        1.myChar에 숫자 할당하기
        */
        myChar = 101;
        System.out.println("1. myChar에 숫자 할당하기");
        System.out.println("myChar의 현재값");
        System.out.println(myChar);

        //2. 글자에 숫자 더해서 할당하기
        myChar = 'F'+32;
        // F는 70 -> + 32 = 102 -> f
        System.out.println("2. myChar에 숫자 더해서 할당하기");
        System.out.println("myChar의 현재값");
        System.out.println(myChar);

        /* '' vs ""
        ''는 char 값으로써 딱 한개의 글자만 넣을 수 있다
        
        //System.out.println('여러글자'); -> 오류

        ""는 String 값으로써 0개 이상의 글자를 넣을 수 있다.
        */
        System.out.println("");
        System.out.println("끝");


    }

}
