/* 사용자로부터
번호 이름 국어 영어 수학 순으로 입력 받아서
출력하는 프로그램을 작성하시오
단, 입력의 경우
국어
> (입력할 값)
의 형태로 입력을 받고
출력시에는 
번호: 001번 이름: 조재영
국어: 030점 영어: 030점 수학: 031점
총점: 091점 평균: 030.33점
의 형식으로 출력될 수 있게 프로그램을 작성하시오
*/

import java.util.Scanner;
class Ex04GradeBook{
    final static int SUBJECT_SIZE = 3;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("번호");
        System.out.print(">");
        int id = scanner.nextInt();

        System.out.println("이름");
        System.out.print(">");
        scanner.nextLine();
        //이거 써야함!
        String name = scanner.nextLine();

        System.out.println("국어");
        System.out.print(">");
        int kor = scanner.nextInt();

        System.out.println("영어");
        System.out.print(">");
        int eng = scanner.nextInt();

        System.out.println("수학");
        System.out.print(">");
        int math = scanner.nextInt();

        //총점 계산
        int sum = kor + eng + math;
        //평균 계산
        double average = sum /(double) SUBJECT_SIZE;

        
        
        System.out.printf("국어: %03d점, 영어: %03d점 수학: %03d\n점", kor, eng, math);
        System.out.printf("총점: %03d점, 평균: %06.2f점\n", sum, average);



        scanner.close();




        
    }
}