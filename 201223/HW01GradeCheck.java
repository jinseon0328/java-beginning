/*숙제
사용자로부터 국어, 영어, 수학, 도덕 시험 점수를 입력 받아서
평균이 70이상이고 모든 점수도 70이상일 때에만
합격
그외에는 불합격이 출력이 되는 프로그램을 작성하시오
예시:  국어 영어 수학 도덕
       70   70   70  71  -> 합격
       65   65   65  68  -> 불합격
      100   50   75  75  -> 불합격

심화과정: 만약 사용자가 입력한 과목 중 불합격 점수가 나올 경우
         더이상 입력이 안되게 프로그램을 작성해보세요
 */
import java.util.Scanner;
class SHW01GradeChecker{
    final static int SCORE_LIMIT = 70;
    final static int SUBJECT_SIZE = 4;
      public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("국어 점수를 입력하세요");
            System.out.print("> ");
            int kor = scanner.nextInt();

            System.out.println("영어 점수를 입력하세요");
            System.out.print("> ");
            int eng = scanner.nextInt();

            System.out.println("수학 점수를 입력하세요");
            System.out.print("> ");
            int math = scanner.nextInt();

            System.out.println("도덕 점수를 입력하세요");
            System.out.print("> ");
            int eth = scanner.nextInt();

            //총점을 계산하여 저장하는 int 변수 sum
            int sum = kor + eng + math + eth;
            if(sum >= SCORE_LIMIT * SUBJECT_SIZE && 
            kor >= SCORE_LIMIT && eng>=SCORE_LIMIT && math>= SCORE_LIMIT && eth>= SCORE_LIMIT){
                System.out.println("합격");
            }else{
                System.out.println("불합격");
            }

            scanner.close();
        }
    
    }

import java.util.Scanner;
class Hw01GradeCheck{
    final static int SCORE_LIMIT = 70;
    final static int SUBJECT_SIZE = 4;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("국어");
        System.out.print("> ");
        int korean = scanner.nextInt();
        if(korean >= 70 && korean <= 100){
            // 국어는 합격이므로 영어 점수를 입력 받는다.
            System.out.println("영어");
            System.out.print("> ");
            int english = scanner.nextInt();

            if(english >= 70 && english <= 100){
                // 영어는 합격이므로 수학 점수를 입력 받는다.
                System.out.println("수학");
                System.out.print("> ");
                int math = scanner.nextInt();

                if(math >= 70 && math <= 100){
                    // 수학은 합격이므로 도덕 점수를 입력 받는다.
                    System.out.println("도덕");
                    System.out.print("> ");
                    int ethics = scanner.nextInt();


                    if(ethics >= 70 && ethics <= 100){
                        //도덕이 합격이므로 모든 점수가 합격 점수이다.
                        //그러므로 합격 메시지 출력
                        System.out.println("합격 입니다.");
                    }else{
                        // 올바른 점수의 형태가 아닐 경우 "잘못 입력하셨습니다." 가 출력
                        // 그 외는 "탈락" 출력
                        if(ethics < 0 || ethics > 100 ){
                            // 올바르지 않은 점수이므로 잘못 입력했다고 출력
                            System.out.println("잘못입력하셨습니다.");
                        }else{
                            System.out.println("탈락");
                        }
                    }

                }else{
                    // 올바른 점수의 형태가 아닐 경우 "잘못 입력하셨습니다." 가 출력
                    // 그 외는 "탈락" 출력
                    if(math < 0 || math > 100 ){
                        // 올바르지 않은 점수이므로 잘못 입력했다고 출력
                        System.out.println("잘못입력하셨습니다.");
                    }else{
                        System.out.println("탈락");
                    }
                }

            }else{
                // 올바른 점수의 형태가 아닐 경우 "잘못 입력하셨습니다." 가 출력
                // 그 외는 "탈락" 출력
                if(english < 0 || english > 100 ){
                    // 올바르지 않은 점수이므로 잘못 입력했다고 출력
                    System.out.println("잘못입력하셨습니다.");
                }else{
                    System.out.println("탈락");
                }
            }

        }else{
            // 올바른 점수의 형태가 아닐 경우 "잘못 입력하셨습니다." 가 출력
            // 그 외는 "탈락" 출력
            if(korean < 0 || korean > 100 ){
                // 올바르지 않은 점수이므로 잘못 입력했다고 출력
                System.out.println("잘못입력하셨습니다.");
            }else{
                System.out.println("탈락");
            }
            
        }

        




        scanner.close();
    }
}