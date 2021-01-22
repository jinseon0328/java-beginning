/*사용자로부터 점수를 입력받아서
A, B, C, D, F를 출력하는 프로그램
단 사용자가 잘못된 점수를 입력하면
올바른 점수가 입력될 때까지 다시 입력을 받도록 하시오
 */
import java.util.Scanner;
public class Ex06LetterGrade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요");
        System.out.print("> ");
        int score = scanner.nextInt();

        while(score < 0 || score > 100){
            System.out.println("잘못된 점수입니다.");
            System.out.println("점수를 입력해주세요.");
            System.out.println("> ");
            score = scanner.nextInt();
        }

        if(score>= 90){
            System.out.print("A");
        }else if(score>= 80){
            System.out.print("B");
        }else if(score>= 70){
            System.out.print("C");
        }else if(score>= 60){
            System.out.print("D");
        }else{
            System.out.print("F");
        }


        scanner.close();
    }
    
}
