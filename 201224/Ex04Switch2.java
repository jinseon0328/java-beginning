/* 의도적으로 break를 생략해서
우리가 코드를 간략화 하는 방법

/ * 사용자로부터 월을 입력받아서
해당월의 가장 마지막 날이 몇일인지 보여주는 프로그램

    
*/
import java.util.Scanner;
 class Ex04Switch2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("확인할 월을 입력하세요:");
        System.out.print("> ");
        int month = scanner.nextInt();
        switch(month){
            
            case 2:
            System.out.println("28일까지입니다.");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("30일까지입니다.");
            break;
            
            default:
            System.out.println("31일까지입니다.");
            break;
        }
            

        

        /*0~5미만: 영아
        5~14미만 : 어린이
        14~19 미만 : 청소년
        그외 : 성인
        */
        System.out.println("나이");
        System.out.print("> ");
        int age = scanner.nextInt();
        switch(age / 19){
            case 0:
            System.out.println("미성년자입니다");
            default:
            System.out.println("성인입니다");
        }

        scanner.close();
    }

}