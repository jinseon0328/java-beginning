/* 논리연산자
논리연산자는 
boolean 값에 대한 연산을 한다.
&&: AND 연산자. 2개의 boolean이 true일 때만 true가 나온다.
||: OR 연산자. 2개의 boolean 중 하나가 true이면 true가 나온다.
!: NOT 연산자. true는 false로 바꿔주고 false는 true로 바꾸어준다.

자바에서는 앞에 것만 보아도 전체 결과가 결정되는 경우,
뒤의 값은 확인하지 않는다.
예를 들어
AND 연산자의 경우 앞의 값이 false이면 뒤에 값은 확인하지 않아도
결과값이 false가 나오기 때문에 뒤의 것은 계산하지 않는다.
OR 연산자의 경우 앞의 값이 true이면 결과값이 true 이기 때문에 뒤의 값은 계산하지 않는다.

 */
class Ex09Operator {
    public static void main(String[] args){
        System.out.println("1.AND 연산");

        System.out.println("true && true: " + (true && true));
        System.out.println("true && true: " + (true && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("false && false: " + (false && false));

        System.out.println("--------------------------------------------------");

        System.out.println("2.OR 연산");

        System.out.println("true || true: " + (true || true));
        System.out.println("true || true: " + (true || false));
        System.out.println("false || true: " + (false || true));
        System.out.println("false || false: " + (false || false));

        System.out.println("--------------------------------------------------");

        System.out.println("3.NOT 연산");

        System.out.println("!true: " + (!true));
        System.out.println("!false: " + (!false));

        /* 좀더 현실적인 논리 연산 예제
         */
        System.out.println("-------------------------현실적 예제 -------------------");
         int number = 5;
         System.out.println("number > 0 && number < 10: " +(number > 0 && number < 10));
         number = -5;
         System.out.println("number > 0 && number < 10: " +(number > 0 && number < 10));
         number = 10;
         System.out.println("number > 0 && number < 10: " +(number > 0 && number < 10));

         
    }
}