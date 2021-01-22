/*값 검증(Valiadation)
값 검증이란 사용자가 값이 올바른지
체크하는 과정으로써 다양한 방법으로 검증이 가능하다.

우리는 여기서 두가지 방법으로 검증을 해볼 것이다.
1.빡빡하게 if문 조건 만들기
2. 값을 먼저 검증하고 올바른 값이 입력 되었을 때에만
   그 다음 단계로 넘어가기
 */
import java.util.Scanner;
class Ex01Valiadation{
      public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("점수");
            System.out.println("> ");
            int score = scanner.nextInt();

            System.out.println("--------------1.값 검증 없는 버젼-----");

            if(score >= 90){
                System.out.println("A");
            }else if(score >= 80){
                System.out.println("B");
            }else if(score >= 70){
                System.out.println("C");
            }else if(score >= 60){
                System.out.println("D");
            }else{
                System.out.println("F");    
            }

            System.out.println("--------------------------------------");

            /*조건을 빡빡하게 잡기
            우리가 if-else if 안에 조건을 정확하게 잡아주면
            사용자가 잘못 값을 입력하더라도
            올바른 결과가 나오게 된다.
             */

            System.out.println("--------------2.정확한 범위------------");             

            if(score >= 90 && score <= 100){
                System.out.println("A");
                //110이면 이거는 안되지만
            }else if(score >= 80 && score <= 90){
                System.out.println("B");
                // 여기에 90이하를 안 넣으면 들어간다
            }else if(score >= 70 && score <= 80){
                System.out.println("C");
            }else if(score >= 60 && score <= 70){
                System.out.println("D");
            }else if(score >= 0 && score <= 59){
                System.out.println("F");    
            }else{
                System.out.println("잘못 입력하셨습니다");
            }

            /* 올바른 값이 들어왔을 때에만 다음 단계로 진행
            이때는 우리가 중첩 조건문이 필요하다
            중첩 조건문이란
            한개의 이프문 안에 
            또다른 이프문이 들어있는 형태를 중첩 이프문이라고 한다.

            먼저 올바른 점수인지 체크하고
            올바른 점수이면 조건문 실행
            그 외에는 "잘못 입력하셨습니다" 출력
              
             */

            if(score >= 0 && score<= 100){
                //올바른 점수이므로 점수 출력 실행
                if(score >= 90){
                    System.out.println("A");
                }else if(score >= 80){
                    System.out.println("B");
                }else if(score >= 70){
                    System.out.println("C");
                }else if(score >= 60){
                    System.out.println("D");
                }else{
                    System.out.println("F");    
                }
    
            }else{
                //잘못된 점수이므로 경고메시지만 출력
                System.out.println("잘못 입력하셨습니다");
            }

            


            scanner.close();
        }
    
    }