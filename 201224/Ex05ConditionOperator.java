/* 삼항연산자(ConditionOperator)
삼항연산자란 연산자를 사용해서
어떤 조건이 true일 때의 값 어떤 조건이 false일 때의 값을
선택시키는 방법이다
Ternary operator가 올바른 표현이지만
라고 해도 된다

삼항 연산자의 장점
1. 코드를 간략하게 만들어 줄 수 있음
2. 멋있음

삼항 연산자의 단점
1. 어려움
2. 코드의 개별 실행이 아니라 어떤 값 선택용으로만 사용 가능

사용방법
조건식? true일 때의 값: false일 때의 값

값마다 다른 삼향연산자가 들어올 수 있다.
*/
class Ex05ConditionOperator {
    public static void main(String[] args){
        int number = 3;
        String result = new String();

        //if -else 구조를 사용해서
        //result에 "짝수입니다" vs "홀수입니다"를 저장해보자
        if(number % 2 == 1){
            result = "홀수입니다.";
        }else{
            result = "짝수입니다.";
        }
        System.out.println(result);


        number = 4;
        //삼항연산자를 사용하면 다음과 같이 적어줄 수 있다.
        result = number % 2 == 1 ? "홀수입니다." : "짝수입니다.";

        System.out.println(result);

        /*한가지 주의할 점은
        삼항연산자는 어떠한 값을 선택하는 용도로만 사용가능하고
        어떤 코드를 실행하라는 용도에서는 사용할 수 없다. */

        // number % 2 == 1 ? System.out.println("홀수입니다") : () System.out.println("짝수입니다");
        // 실행은 안된다

        /* 다중 삼항연산자
        삼항연산자 안에 삼항연산자 
         */

         int age = 3;
         //result = age < 5 ? "유아" : "어린이 ";
         result = age < 5 ? "유아" :  age < 13 ?  "어린이 " :  age < 19 ? "청소년" : "성인";
         // 앞의 유아는 age < 5가 트루일 때, 어린이는 펄스일때
         // result = age < 13 ? "어린이" : "청소년";
         // result = age < 19 ? "청소년" : "성인";
         // 이렇게 쓰면 틀림 청소년에 들어가므로
    }
}
