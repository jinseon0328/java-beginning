/*사용자로부터 번호, 이름, 국어, 영어, 수학 점수 순으로 입력 받아서
printf로 출력하는 프로그램을 작성하시오
번호의 범위는 1부터 25까지입니다
점수의 범위는 0부터 100까지입니다.
만약 사용자가 입력한 번호 혹은 점수가
범위를 벗어났을 경우
올바른 값을 입력할 때까지 다시 입력을 받으세요
 */
import java.util.Scanner;
public class Ex05GradeBook {
    static final int SUBJECT_SIZE =3;
    static final int MAX_ID = 25;
    //-> 이것도 유념
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("번호를 입력하세요");
        System.out.println("> ");
        int id = scanner.nextInt();

        while(id < 1 || id > MAX_ID){
                System.out.println("잘못입력하셨습니다.");
                System.out.println("1부터 25사이의 숫자를 입력해 주세요");
                System.out.println("번호를 입력하세요");
                System.out.print("> ");
                id = scanner.nextInt();
        }

        System.out.println("이름을 입력하세요");
        System.out.println("> ");
        scanner.nextLine();
        //-> 이거 꼭 쓰기
        String name = scanner.nextLine();
        

        System.out.println("국어 점수를 입력하세요");
        System.out.println("> ");
        int kor = scanner.nextInt();

        while(kor < 0 || kor > 100){
            System.out.println("유효한 점수가 아닙니다.");
            System.out.println("점수를 입력하세요");
            System.out.print("> ");
            kor = scanner.nextInt();
    }

        System.out.println("영어 점수를 입력하세요");
        System.out.println("> ");
        int eng = scanner.nextInt();

        while(eng < 0 || eng > 100){
            System.out.println("유효한 점수가 아닙니다.");
            System.out.println("점수를 입력하세요");
            System.out.print("> ");
            eng = scanner.nextInt();
    }

        System.out.println("수학 점수를 입력하세요");
        System.out.println("> ");
        int math = scanner.nextInt();

        while(math < 0 || math > 100){
            System.out.println("유효한 점수가 아닙니다.");
            System.out.println("점수를 입력하세요");
            System.out.print("> ");
            math = scanner.nextInt();

        }

        int sum = kor + eng + math;
        double average = sum /(double) SUBJECT_SIZE;

        System.out.printf("번호: %03d번, 이름:%s\n", id, name);
        System.out.printf("국어: %03d점, 영어: %03d점, 수학:%03d점", kor, eng, math);
        System.out.printf("총점: %03d점 평균:%.2f점\n", sum, average);

    


        scanner.close();


    }


    
}
