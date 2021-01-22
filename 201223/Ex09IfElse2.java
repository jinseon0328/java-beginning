/* 아래의 출력 내용에서 
만약 조건을 만족하지 않으면
그 경우에 맞는 메시지를 출력하도록
프로그램을 변경해보세요
 */
import java.util.Scanner;
class Ex09IfElse2 {
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
        }else{
            System.out.println("성인입니다.");
        }
        //2. 홀수 체크하기
        System.out.println("숫자: ");
        System.out.println("> ");
        int number = scanner.nextInt();
           
        if (number % 2 == 1 ){
            System.out.println("홀수입니다.");
        }else{
            System.out.println("짝수입니다");
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
            //if(userName == ADMIN_NAME && password == ADMIN_PASSWORD) 하면
            //맞는 정보를 입력해도 로그인 성공이 뜨지 않는다.


            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");

        }

        


       

        System.out.println("프로그램 종료");
        scanner.close();


   
        




        


    }

    
}
