/*숙제 
        사용자로부터 국어, 영어, 수학 점수를 입력받아서
        각 점수와 총점, 평균을 계산하는 프로그램을 작성하시오
        심화문제
        스캐너 버그를 검색해보시고
        위의 문제에서 학생 -> 번호 이름 국어,영어,수학 순으로 입력 받고
        번호, 이름, 국어, 영어, 수학, 총점, 평균이 차례대로 출력되는 프로그램을
        작성하시오*/
import java.util.Scanner;
public class HW01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        
        //국어, 영어, 수학을 입력받는다.
        System.out.println("국어: ");
        int korean = sc.nextInt();

        System.out.println("영어: ");
        int english = sc.nextInt();

        System.out.println("수학: ");
        int math = sc.nextInt();


        //입력받은 점수로 총점과 평균 계산

        int sum = korean + english + math;
        double average = sum /3.0;
        //->3.0으로 나누는 이유는 총점이 double 형태이므로 3으로 하면 안되고 3.0으로 해야한다

        System.out.println("국어: "+korean);
        System.out.println("영어: "+english);
        System.out.println("수학: "+math);
        System.out.println("총점: "+sum);
        System.out.println("평균: "+average);



        sc.close();


    }
    

}
