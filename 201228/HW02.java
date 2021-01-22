/*메뉴를 만들고 사용자가 입력을 누르면
번호, 이름, 국어, 영어, 수학 점수를 입력할 수 있게 하고
출력을 누르면 출력이 되게 만드세요.
단 사용자가 입력할 때 번호는 1~25사이
국영수 점수는 0~100 사이의 정수만 입력되도록 만드세요
심화 : 만약 사용자가 아무런 값도 없이 출력을 누르면 "입력된 값이 없습니다" 라고 출력되게 만드세요
  
 */
import java.util.Scanner;
public class HW02 {
    static final int SUBJECT_SIZE =3;
    static final int Max_ID = 25;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1){
                System.out.println("번호:");
                System.out.println("> ");
                int id = scanner.nextInt();
                
                while(id < 1|| id > Max_ID) {
                    System.out.println("잘못입력하셨습니다");
                    System.out.println("번호를 다시 입력해주세요");
                    System.out.print("> ");
                    id = scanner.nextInt();
                }

                System.out.println("이름:");
                System.out.println("> ");
                scanner.nextLine();
                String name = scanner.nextLine();

                System.out.println("국어 점수를 입력하세요");
                System.out.println("> ");
                int kor = scanner.nextInt();

                      while(kor < 0 || kor > 100){
                          System.out.println("잘못입력하셨습니다");
                          System.out.println("국어점수를 다시 입력해주세요");
                          System.out.print(">");
                          kor = scanner.nextInt();
                      }

                System.out.println("영어 점수를 입력하세요");
                System.out.println("> ");
                int eng = scanner.nextInt();

                      while(eng < 0 || eng > 100){
                          System.out.println("잘못입력하셨습니다");
                          System.out.println("영어점수를 다시 입력해주세요");
                          System.out.print(">");
                          eng = scanner.nextInt();
                      }

                System.out.println("수학 점수를 입력하세요");
                System.out.println("> ");
                int math = scanner.nextInt();
      
                            while(math < 0 || math > 100){
                                System.out.println("잘못입력하셨습니다");
                                System.out.println("수학점수를 다시 입력해주세요");
                                System.out.print(">");
                                math = scanner.nextInt();
                                }
                                break;
            }else if(userChoice == 2){
                
                int id = scanner.nextInt();
                String name = scanner.nextLine();
                int kor = scanner.nextInt();
                int eng = scanner.nextInt();
                int math = scanner.nextInt(); 

                int sum = kor + eng + math;
                double average = sum /(double) SUBJECT_SIZE;

                System.out.printf("번호: %03d번, 이름:%s\n", id, name);
                System.out.printf("국어: %03d점, 영어: %03d점, 수학:%03d점", kor, eng, math);
                System.out.printf("총점: %03d점 평균:%.2f점\n", sum, average);

            }else if(userChoice ==3){
                System.out.println("프로그램을 종료합니다");
             break;
            }




        scanner.close();


        }



    
       
    }
    
}
