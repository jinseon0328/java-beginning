import java.util.Scanner;
public class Ex04Star {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("별찍기 4번");
        System.out.println("숫자를 입력해주세요");
        System.out.print(">");
        int userNumber = scanner.nextInt();

        for(int i = 1; i <= userNumber; i++){
            String stars = new String();

            for(int j = 1; i<=userNumber -1; j++){
                stars += " ";

            }

            for(int j = i; j <= userNumber ; j++){
                stars +="*";
            }
        }
        */

        System.out.println("별찍기 4번");
        System.out.println("숫자를 입력해주세요");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

    //i for 문: 세로가 몇줄일지 출력 
    //j for 문 : 해당 줄의 내용을 결정 3번은 공백을 나타내는 j for문과 *을 나타내는 j for문 두개가 필요
    for(int i = 1; i <=userNumber; i++){
        //해당 줄의 내용을 담을 String 변수 생성
        String stars = new String();
       
        //j for 문 공백 부분과 * 부분을 만들어보자
            /* 공백부분
            1번째 줄에 공백이 1-1개 
            2번째 줄에 공백이 2-1개
            3번째 줄에 공백이 3-1개
            4번째 줄에 공백이 4-1개
            5번째 줄에 공백이 5-1개
            따라서 공백 숫자는 userNumber - i */
            
            for(int j = 1; j <= i -1; j++){
                stars += " ";
            }
            /* *부분은 2번과 동일
             */
            for(int j = i; j<= userNumber; j++){
                stars += "*";
            }

         System.out.println(stars);




    }



        scanner.close();

    }
    
}
