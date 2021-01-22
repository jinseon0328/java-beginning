/* 1부터 사용자가 입력한 수까지의 
소수를 구하는 프로그램
소수란?
약수가 1과 자기자신인 숫자
=약수가 2개인 숫자

약수란?
A를 B로 나누었을 때 나누어 떨어지면
B는 A의 약수이다.
= A를 B로 나누었을 때 나머지가 0과 같으면
B는 A의 약수이다

어떤 수의 최대 약수는?
자기자신이다.

우리는 이 3가지 조건을 사용해서
1부터 사용자가 입력한 숫자까지의
소수를 출력하는 프로그램을 작성하게 된다.

i : 해당 숫자가 소수인지 아닌지를 체크할 숫자
j : i의 약수인지 아닌지를 체크할 숫자

 */
import java.util.Scanner;
class Ex02PrimeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("숫자");
        System.out.print(">");
        int number = scanner.nextInt();

        //우리가 i for 문에서 i가 소수인지 아닌지를 검사할 숫자가 된다.
        //그렇다면 i for 문의 초기화식은? int i = 1
        //반복 조건식은? i <= number
        for (int i = 1; i<= number; i++){
            //약수의 갯수를 저장할 int 변수를 여기에서 선언과 초기화한다.
            //그렇게 하면 i for문이 한번 실행될 때마다 선언과 초기화가 이루어지면서
            //해당 숫자의 약수를 저장할 공간이 0으로 초기화 되서 확인 가능하기 때문이다.
            int count = 0; 
            //-> i가 시작될 때마다 0으로 초기화 해서 새로 체크한다

            //우리가 j for 문에서 j는 i의 약수인지 아닌지를 검사할 숫자가 된다.
            //그렇다면 j for 문의 초기화식은? int j = 1
            //반복 조건식은? j <= i
            for(int j = 1; j <= i; j++){

                //만약 j가 i의 약수이면 count의 현재값을 1 증가시킨다
                //만약 i 나누기 j의 나머지가 0과 같다면 count의 현재값을 1 증가시킨다.
                if(i % j == 0){
                    count++;
                }

            }

            //j for 문이 종료가 되었다
            // = i의 약수가 몇개인지 count에 저장

            //소수란 약수가 2개인 숫자
            // 즉 count가 2이면 i를 출력해준다.

            if(count == 2){
                System.out.printf("%d는 소수입니다.\n", i);
            }

        }






        scanner.close();
    }
    
}
