import java.util.Scanner;
public class Ex02Star {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    /*System.out.println("별찍기 2번");
    /* 1일 때 1,2,3,4,5까지 5번 반복
    2일 때 2,3,4,5까지 4번 반복
    3일 때 3,4,5까지 3번 반복

    /*

    System.out.println("번호를 입력하세요");
    System.out.print("> ");
    int userNumber = scanner.nextInt();

    for(int i = 1; i <= userNumber; i++);{
        String stars = new String();
        for(int j = 1; j <= userNumber; j++ );{
        stars += "*";
        }
    */

    System.out.println("별찍기 2번");
    System.out.println("숫자를 입력해주세요");
    System.out.print("> ");
    int userNumber = scanner.nextInt();

    //i for 문: 세로가 몇줄일지 출력
    //j for 문 : 해당 줄의 내용을 결정
    for(int i = 1; i <=userNumber; i++){
        //해당 줄의 내용을 담을 String 변수 생성
        String stars = new String();
       
        //j for 문을 만들어보자
        for(int j = i; j <= userNumber; j++){
            stars += "*";
        }

        System.out.println(stars);
    }

    


       


    scanner.close();
    }
    
    
}
