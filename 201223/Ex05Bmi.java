/* 사용자로부터 키와 몸무게를 입력받아서
bmi를 계산하는 프로그램을 작성하시오
bmi 공식은 몸무게(kg단위)/ 키(m단위) / 키(m단위) 입니다.
단 출력시에는 
bmi 수치를 소수점 2번째 자리까지만 출력되게 작성하세요
입력시에는
몸무게
> (값)
이런식으로 입력될 수 있게 작성하세요.
*/
import java.util.Scanner;
class Ex05Bmi {    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("몸무게");
        System.out.print("> ");
        double wight = scanner.nextDouble();

        System.out.println("키");
        System.out.print("> ");
        double height = scanner.nextDouble();

        double bmi = (double) wight / height / height;

        System.out.printf("사용자의 BMI는 %.2f입니다. \n", bmi);








        scanner.close();



    }
}
