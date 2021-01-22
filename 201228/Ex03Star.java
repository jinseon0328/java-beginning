import java.util.Scanner;
class Ex03Star {
    public static void main(String[]arges){
        Scanner scanner = new Scanner(System.in);

        System.out.println("별찍기 3번");
        System.out.println("숫자를 입력해주세요");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

    //i for 문: 세로가 몇줄일지 출력 
    //j for 문 : 해당 줄의 내용을 결정 3번은 공백을 나타내는 j for문과 *을 나타내는 j for문 두개가 필요
    for(int i = 1; i <=userNumber; i++){
        //해당 줄의 내용을 담을 String 변수 생성
        String stars = new String();
       
        //j for 문 공백 부분과 * 부분을 만들어보자
            /* 공백부분
            1번째 줄에 공백이 4개 
            2번째 줄에 공백이 3개
            3번째 줄에 공백이 2개
            따라서 공백 숫자는 userNumber - i
            *부분은 1번과 동일
             */
            for(int j = 1; j <= userNumber - i; j++){
                stars += " ";
            }
            for(int j = 1; j<= i; j++){
                stars += "*";
            }
    
            System.out.println(stars);
        }
            
        



     scanner.close();
    }
    
}
