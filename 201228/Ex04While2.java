/* 사용자로부터 자연수를 입력받는 프로그램
단 사용자가 음의 정수를 입력하면
자연수가 입력될 때까지 다시 입력을 받는다
 */
import java.util.Scanner;
public class Ex04While2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

         System.out.println("자연수를 입력하세요");
         System.out.print("> ");
         int number = scanner.nextInt();

         
         /*for(int i =1; i<=1000; i++){
         if(number < 0){
             System.out.println("자연수가 아닙니다.");
             System.out.println("자연수를 입력하세요");
             System.out.print("> ");
             number = scanner.nextInt();
             // 1000번 이상 음의 정수를 넣는 사람이 있으면 -1001부터는 오류가 난다.
             */
             while(number < 0){
                System.out.println("자연수가 아닙니다.");
                System.out.println("자연수를 입력하세요");
                System.out.print("> ");
                number = scanner.nextInt();
         }

         System.out.println("사용자가 입력한 자연수: "+number);
        


        scanner.close();
    }
    
}
