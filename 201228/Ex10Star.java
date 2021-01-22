import java.util.Scanner;
public class Ex10Star {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("10번 별찍기");
        System.out.println("숫자를 입력해주세요");
        System.out.print(">");
        int userNumber = scanner.nextInt();

        
        for(int i =1; i <=2 * userNumber -1; i++){
              String stars = new String();
               
               
              if(i == 1|| i ==2 * userNumber -1){
              //맨 위 맨 마지막줄 꽉 채워진 공간

               // 별을 추가하는 j for문
               for(int j = 1; j<=2 * userNumber -1; j++){
                    stars += "*";
               }



               //중간에 빈 공간에서도 점점 줄어드는 공간
              }else if(i < userNumber){

                //왼쪽 별을 담당하는 j for문
                for(int j = i; j <= userNumber; j++){
                    stars +="*";
                }

                //가운데 공백을 담당하는 j for문
                // 2* (i -1) -1
                // 2*(upperI) -1
                // 윗부분에서 사용할 i

                int upperI = i - 1;
                for(int j = 1; j <= 2 * upperI -1; j++){
                      stars +=" ";
                }

                // 오른쪽 별을 담당하는 j for 문
                for(int j = i; j <= userNumber; j++){
                    stars +="*";
                }



                

               


                //마지막 점점 늘어나는 공간
              }else{

                int lowerI = i - userNumber +1;

                //왼쪽 별을 담당하는 j for 문
                for(int j = 1; j <= lowerI; j++){
                    stars += "*";
                }

                //가운데 공백을 담당하는 j for문
                //가운데 공백의 개수
                // = 총너비 - 별의 갯수
                // =(2* userNumber -1)
                //별의 갯수 = 2 *lowerI
                // 따라서 가운데 공백의 개수
                // = 2 * userNumber -1 -2 * lowerI
                // = 2 * (userNumber - lowerI )-1

                /* 이걸 그대로 j for 문에 넣어줄 수도 있지만
                우리가 다른 변수에 할당하고
                그 변수를 j for 문에 써도 된다.
                 */

                int totalWidth = 2 * userNumber -1;
                int totalStars = 2 * lowerI;
                int spaceWidth = totalWidth - totalStars;

                for(int j = 1; j <= spaceWidth; j++){
                       stars += " ";

                }

                // 오른쪽 별을 담당하는 j for문
                for(int j = 1; j <= lowerI; j++){
                    stars +="*";
                }


              }


              System.out.println(stars);
        }

        
        scanner.close();


    }

}