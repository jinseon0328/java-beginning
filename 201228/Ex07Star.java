import java.util.Scanner;
public class Ex07Star {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        // 1~5줄 + 6~10줄
        // i =1, userNumber >= 경우
        // 1. 커다란 i for문 2개 
        // 2. 커다란 i for문 1개에 if else  

        System.out.println("7번 별찍기");
        System.out.println("숫자를 입력하세요");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        //i for 문: 세로가 몇줄일지 출력
        //j for 문 : 해당 줄의 내용을 결정
        /*for(int i = 1; i <= userNumber ; i++){
            
            //해당 줄의 내용을 담을 String 변수 생성
            String stars = new String();
           
            //j for 문을 만들어보자
            for(int j = 1; j <=i; j++){
                stars += "*";
            }

            for(int j = userNumber +1 ; i >= userNumber - 1; j--){
                stars +="*";

                
            }

         */   

         //2번 방법으로 1~ userNumber-1까지 2*userNumber -1

         for(int i = 1 ; i <= 2*userNumber -1; i++){

            String stars = new String();


            System.out.println(stars);

            
            if(i <= userNumber){
                //윗부분
                for(int j = 1; j<= i; j++){
                    stars +="*";
                }
            }else{
                //아랫부분

                /*실질적으로 i가 5,6,7,8,9 일때
                else로 들어오게 된다
                그렇다면 
                j for 문은
                j = 5,6,7,8,9로 초기화 된다.
                그리고 userNumber는 5이기 때문에
                5번째 줄에 별 1개
                나머지 줄은?
                */

                //아래에서 사용할 i를 새로 만들고 초기화 해주자

                int lowerI = i - userNumber +1;
                for (int j = lowerI; j <= userNumber; j++){
                //for(int j = i -  userNumber +1; j <= userNumber; j++){
                    
                    stars +="*";
                }

            }
         
            System.out.println(stars);

         }

        
        scanner.close();    
        }




    }


