/* 자바에서 콘솔에 출력하는 3가지 방법
1. print()
   () 안의 내용을 출력하고 그 다음 출력위치는 바로 다음칸이 된다.
2. println()
   () 안의 내용을 출력하고 그 다음 출력위치는 그 다음줄 첫번째 칸이 된다.
3. printf()
   () 안의 내용을 형식에 맞추어 출력하고 그 다음 출력위치는 바로 다음칸이 된다.

공백문자
공백문자란? \ + 알파벳 으로 이루어진 두 글자이지만 한 개의 문자로 취급되는 문자로서,
탭 공백, 다음줄 공백 등이 있다.

\t: 스페이스 4칸씩 끊어 칸을 맞춰주는 공백
\n: 다음줄 문자. 개행문자라고도 함.

 */

public class Ex02Print {
    public static void main(String[]args){
        String string1 = "abcDEF";
        String string2 = "GHIjkl";

        //1.print()의 경우
        System.out.print(string1);
        System.out.print(string2);

        //2.println()의 경우
        System.out.println(string1);
        System.out.println(string2);

        //3.printf()의 경우
        System.out.printf("%s", string1);
        System.out.printf("%s", string2);
        //-> print()와 printf()는 다음에 입력될 값이 있으면 오른쪽에 바로 입력되고
        // println()은 다음에 입력될 값이 있으면 다음 줄에 입력된다!
        /* %->뒤의 알파벳의 의미(d -> 10진법, s -> string 문자열)를 표시하라는 뜻이다 */

        System.out.println();

        //4. 탭공백 체험해보기
        System.out.println("12\t34");
        System.out.println("123\t456");
        System.out.println("1234\t5678");

        //5. 개행문자 체험해보기
        System.out.print(string1+"\n");
        System.out.print(string2+'\n');
        //->print()썼는데도 줄이 나눠짐





    }
}
