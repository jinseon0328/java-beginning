/* 1. 사용자로부터 나이를 입력받아서
미성년자일 경우 "미성년자입니다."라고 출력되게 코드를 작성하시오
2.사용자로부터 숫자를 입력받아서
홀수일 경우 "홀수 입니다."가 출력되게 코드를 작성하시오
3. 관리자 id:"admin", 관리자 pw:"1111"일때
사용자로부터 id와 비밀번호를 입력받아서
기존 기록과 일치할 경우에만 "로그인 성공!"이 출력되게 코드를 작성하시오
 */
import java.util.Scanner;
class Ex06If2 {
    final static String ADMIN_NAME = "admin";
    final static String ADMIN_PASSWORD = "1111";
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //나이 입력받아서 체크하기
        System.out.println("나이: ");
        System.out.print("> ");
        int age = scanner.nextInt();
        
        if (age <= 18){
            System.out.println("미성년자입니다.");
        }
        //2. 홀수 체크하기
        System.out.println("숫자: ");
        System.out.println("> ");
        int number = scanner.nextInt();
           
        if (number % 2 == 1 ){
        System.out.println("홀수입니다.");
        }

        //3. 아이디 비밀번호 입력받아서 로그인 체크하기
        System.out.println("ID");
        System.out.println("> ");
        scanner.nextLine();
        String userName = scanner.nextLine();

        System.out.println("비밀번호: ");
        System.out.println("> ");
        String password = scanner.nextLine();

        if(userName.equals(ADMIN_NAME) && password.equals(ADMIN_PASSWORD)){
            //비교연산 쓰면 주소값 비교이므로 쓰면 안되고 참조형 써야한다


            System.out.println("로그인 성공");
        }

        


       

        System.out.println("프로그램 종료");
        scanner.close();


   
        




        


    }

    
}
