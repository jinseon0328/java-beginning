/* 사용자로부터 나이를 입력받아서
~5세 이하: 영아
6~13세 이하: 어린이
14세~19세 미만:청소년
그외: 성인
이 출력되는 프로그램을 작성해보세요
 */
import java.util.Scanner;
public class Ex11IfElseIf2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이");
        System.out.print("> ");
        int age = scanner.nextInt();

        if(age < 6){
        System.out.println("영아입니다.");
        }else if(age <= 13){
            System.out.println("어린이입니다.");
        }else if(age < 19){
            System.out.println("청소년입니다.");
        }else{
            System.out.println("성인입니다.");
        }








        scanner.close();
    }
    
}
