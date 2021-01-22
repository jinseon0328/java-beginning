/*사용자로부터 시험 점수를 입력 받아서
90점 이상일 시 :A
80점 이상일 시 :B
70점 이상일 시 :C
60점 이상일 시 :D
60점 미만: F
가 출력되는 프로그램을 작성해보세요

심화과정
1의 자리에 따라
7이상 : +
4~6 : 0
0~3 : -
도 같이 출력되게 프로그램을 작성해보세요.

*/
import java.util.Scanner;
class SHW03LetterGrade{
      public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("점수");
            System.out.println("> ");
            int score = scanner.nextInt();

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


            scanner.close();
        }
    
    }

import java.util.Scanner;
class SHW03LetterGrade2{
      public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("점수");
            System.out.println("> ");
            int score = scanner.nextInt();

            //출력할 내용을 저장할 String 변수 만들자
            String letterGrade = new String();

            if(score >= 90){
                letterGrade += 'A';
               // System.out.println("A"); -> 현재는 빈공간이므로 letterGrade에 'a' 이어붙여서 출력해라
            }else if(score >= 80){
                letterGrade += 'B';
            }else if(score >= 70){
                letterGrade += 'C';
            }else if(score >= 60){
                letterGrade += 'D';
            }else{
                letterGrade += 'F';   
            }
            // 앞의 글자를 추가해준 거임!

            if(score >= 60){
                if(score == 100 || score %10 >= 7){
                    //100점은 관계없이 플이니까!
                        letterGrade += "+";
                    }else if(score % 10 >= 4){
                        letterGrade += "0";
                    }else{
                        letterGrade += "-";
                    }

            }
        

        
            System.out.println(letterGrade);
        

            scanner.close();
        }
    
    }