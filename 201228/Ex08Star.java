import java.util.Scanner;
class Ex08Star {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("8번 별찍기");
        System.out.println("숫자를 입력해주세요");
        System.out.print(">");
        int userNumber = scanner.nextInt();

       /* for(int i = 1 ; i <= 2*userNumber -1; i++){
            String stars = new String();

            if (i <= userNumber){
            // 윗부분 공백
            for(int j = 1; j <= userNumber -1 ; j++){
                stars = " ";

             }
            for()

            }





        */

        //커다란 i for 문으로 if -else 사용해서 만들어보자.

        for(int i = 1 ; i <= 2*userNumber -1; i++){
            String stars = new String();

            
            if(i <= userNumber){
                //윗부분
                //공백을 담당하는 j for문
                for(int j = 1; j<= userNumber - i; j++){
                    stars +=" ";
                }

                //별을 담당하는 j for문
                for(int j = 1; j <= i ; j++){
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
                
                int lowerI = i - userNumber +1;

                //공백을 담당하는 j for 문
                //for(int j = 1; j <= i - userNumber +1 -1; j++){
                    for(int j = 1; j <= lowerI -1; j++){
                        stars +=" ";


                }



                //별을 담당하는 j for문

                //아래에서 사용할 i를 새로 만들고 초기화 해주자

                
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