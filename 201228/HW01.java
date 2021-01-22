/* 사용자가 점수를 입력하면 A,B,C,D,F가 출력되는 프로그램을 작성하시오.
단 무한루프를 사용해서 사용자가 -1을 입력하면 종료가 되고
그 외에는 올바른 점수가 들어올 때까지 입력을 받아서 점수가 출력되도록 만드세요
예시
점수를 입력하세요(-1은 종료): -50
잘못 입력하셨습니다. 다시입력해주세요: 50
50점은 F입니다.
점수를 입력하세요(-1은 종료):-1
사용해주셔서 감사합니다
 */
import java.util.Scanner;
public class HW01 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("점수를 입력하세요");
    System.out.println("> ");
    int score = scanner.nextInt();

        while(true){
            
             if (score == -1){
                System.out.println("프로그램이 종료됩니다");
                break;
             }else if(score <=0){
                System.out.println("잘못 입력하셨습니다");
                System.out.println("다시 입력해주세요");
                System.out.println("> ");
                score = scanner.nextInt();
             }
            }
                
             if(score >90){
                System.out.printf("%d점\n은 A입니다", score);
             }else if(score >80){
                System.out.printf("%d점\n은 B입니다", score);
             }else if(score >70){
                System.out.printf("%d점\n은 C입니다", score);
             }else if(score >60){
                System.out.printf("%d점\n은 D입니다", score);
             }else{  
                System.out.printf("%d점\n은 F입니다", score);
              
             }
            
            
         scanner.close();
       
        }
    



    }
    

