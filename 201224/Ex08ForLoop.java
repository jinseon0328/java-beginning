/*1. 사용자로부터 정수를 입력 받아서
1부터 그 수까지의 홀수를 출력하는 프로그램을 작성하시오
2. 사용자로부터 정수를 새로 입력받아서
1부터 그 수까지의 합을 구하는 프로그램을 작성하시오
3. 사용자로부터 정수를 새로 입력받아서
1부터 그 수까지의 곱을 구하는 프로그램을 작성하시오

*/
import java.util.Scanner;
class Ex08ForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 홀수 출력하기");
        System.out.println("정수: ");
        System.out.print("> ");
        int number = scanner.nextInt();
        for(int i = 1; i <= number; i+= 2){
            System.out.println(i);
        }
        System.out.println("2. 합 구하기");
        System.out.println("정수: ");
        System.out.print("> ");
        number = scanner.nextInt();
        int sum = 0; 
        for(int i = 1; i <= number; i++){
            sum += i;
        }
        System.out.printf("1부터 %d 까지의 합: %d\n", number, sum);

        System.out.println("3. 곱 구하기");
        System.out.println("정수: ");
        System.out.print("> ");
        /* 3번에서 주의할 점은
        사용자가 13보터 큰 수를 입력하면
        오버 플로우가 발생하여
        정확한 값을 표시할 수 없게 된다.
        그렇다면
        사용자가 입력한 값이 13보다 작으면
        정상적으로 결과를 출력하고
        그 외에는
        "overflow가 발생했습니다" 라고 출력하려면
        어떻게 해야할까?
         */
        number = scanner.nextInt();
        if(number < 13){
           //오버플로우가 발생하지 않는 구간 

           int result = 1;
        for(int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.printf("1부터 %d 까지의 곱: %d\n", number, result);


        }else{
            //경고메시지만 출력
            System.out.println("오버플로우가 발생했습니다.");
        }
         

        scanner.close();
    }
}