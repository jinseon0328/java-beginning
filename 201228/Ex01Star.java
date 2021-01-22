import java.util.Scanner;
public class Ex01Star {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        /*System.out.println("숫자");
        System.out.print("> ");
        String i = scanner ();
        


        for(int i = 1; i <= 5; i++);
        


        System.out.printf("");*/

        System.out.println("별찍기 1번");
        System.out.println("숫자를 입력해주세요");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        //i for 문: 세로가 몇줄일지 출력
        //j for 문 : 해당 줄의 내용을 결정
        for(int i = 1; i <=userNumber; i++){
            //해당 줄의 내용을 담을 String 변수 생성
            String stars = new String();
           
            //j for 문을 만들어보자
            for(int j = 1; j <=i; j++){
                stars += "*";
            }

            System.out.println(stars);
        }



        scanner.close();
    }
}
