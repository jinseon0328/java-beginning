        /*숙제 
        사용자로부터 국어, 영어, 수학 점수를 입력받아서
        각 점수와 총점, 평균을 계산하는 프로그램을 작성하시오
        심화문제
        스캐너 버그를 검색해보시고
        위의 문제에서 학생 -> 번호 이름 국어,영어,수학 순으로 입력 받고
        번호, 이름, 국어, 영어, 수학, 총점, 평균이 차례대로 출력되는 프로그램을
        작성하시오*/
        import java.util.Scanner;
        class Ex11Assignment{
            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
        
                int id;
                System.out.println("번호를 입력해주세요: ");
                id = scanner.nextInt();
        
                String name;
                System.out.println("이름을 입력해주세요: ");
                name = scanner.next();
        
        
                int kor;
                int eng;
                int math;
        
                System.out.println("국어점수를 입력해주세요: ");
                kor = scanner.nextInt();
        
                System.out.println("영어점수를 입력해주세요: ");
                eng = scanner.nextInt();
        
                System.out.println("수학점수를 입력해주세요: ");
                math = scanner.nextInt();
                
                int sum = kor + eng + math;
                System.out.println("총점: "+sum);
                
                System.out.println("평균: "+(double)sum/3);
                System.out.println();
        
        
            
        
           scanner.close();
            }
        }
        
        