/* 사용자로부터 
성별, 나이, 신체등급을 입력 받아
현역, 공익, 면제가 출력되는 프로그램을 작성하시오
단 성별이 여자일 경우 추가적인 정보를 입력받지 않습니다
단 남자지만 미성년자일 경우 추가적인 정보를 입력받지 않습니다.
 */
import java.util.Scanner;
class Ex02Amy2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    // 성별을 입력받는다.
    System.out.println("성별을 입력해주세요, 1: 남자 2: 여자");
    System.out.print("> ");
    int gen = scanner.nextInt();

    if(gen == 1){
        // 남자이므로 나이 입력을 받는다
        System.out.println("나이");
        System.out.print("> ");
        int age = scanner.nextInt();

        if(age > 19) {
             // 성인이므로 신체등급을 입력 받는다.
              System.out.println("신체등급을 입력해주세요");
              System.out.print("> ");
              int category = scanner.nextInt();

              if(category >= 1 && category<= 3){
                System.out.println("현역입니다");

              }else if (category == 4){
                System.out.println("공익입니다");
              }else{
                System.out.println("면제입니다");
              }
              
                  
        }else {
            //미성년자이므로 경고 메세지만 출력
        System.out.println("해당사항이 아닙니다");
        }

         

    }else{
        //여자이므로 경고메시지만 출력
        System.out.println("여성에게는 국방의 의무가 부여되지 않습니다");
        scanner.close();
    }
}

}    
   