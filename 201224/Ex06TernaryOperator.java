/*사용자로부터 연도를 입력 받으면
해당연도가 윤년인지 평년인지를 출력하는 프로그램
윤년과 평년의 조건은 다음과 같다
1. 4로 나누었을 때는 나머지가 없지만
2. 100으로 나누었을 때는 나머지가 있을 것
3. 만약 400으로 나누었을 때 나머지가 없으면 윤년
4. 그외는 모두 다 평년

이 프로그램을 삼항연산자를 사용하여 작성하시오
 */
import java.util.Scanner;
public class Ex06TernaryOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("연도를 입력하세요: ");
        System.out.print("> ");
        int year = scanner.nextInt();
        String result = new String();
        result = year % 100 == 1 ? "평년" : "윤년" ;
        result = year % 4 == 0 ? "윤년" : "평년" ; 
                                 -----

        result = year % 400 == 0 ? "윤년" : "평년" ;

        result = year % 100 == 1 ? "평년" : year % 400 == 0 ? "윤년" : year % 4 == 0 ? : "윤년" ;




        System.out.println(result);*/

        System.out.println("연도");
        System.out.print("> ");
        int year = scanner.nextInt();
        
        String result = year % 4 == 0 ? year % 100 == 0 ? year % 400 == 0 ? "윤년" : "평년" : "윤년" : "평년";

        System.out.println(result);


        scanner.close();
    }

}