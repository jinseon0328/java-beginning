/*반복문
반복문이란 특정 조건을 만족하는 동안
해당 코드 블락을 반복시키는 것을 반복문이라고 한다.

반복문에는 for 반복문과 while 반복문 2가지가 있다.
for 반복문은 비교적 명확하게 횟수가 지정된다.
"나는 너를 5분동안 기다렸어" 
=> I waited you for five minute.
이 조건은 몇번 반복해

while 반복문은 횟수가 지정되지 않는다.
"나는 너를 기다리는 동안 폰을 봤어"
=> I was using my cellphone while I was waiting you.
이 조건이 트루인 동안 계속 반복해
 */
class Ex07ForLoop {
    public static void main(String[] args){
        /*for 반복문은 다음과 같은 구조를 가진다
        for (제어변수의 선언과 초기화; 조건식; 제어변수의 변화 할당 연산자){
            반복할 코드의 내용
        }
        작동 순서는 다음과 같다.
         1. 제어변수의 선언과 초기화
         2. 조건식의 체크
         2-A 조건식이 true 가 나오는 경우
                가. 반복할 코드 실행
                나. 반복할 코드가 끝날 경우 할당연산자 실행
                다. 할당연산자가 실행되어 변경된 제어변수의 값으로 조건 다시 체크 
         2-B 조건식이 false가 나오는 경우
             해당 반복문 종료

        */
        for(int i = 1; i <= 3; i++);{
            System.out.println(i);
        }
        /* 위 for 문을 말로 풀어서 쓰면
        int i는 1로 초기화하고 i <= 의 조건식을 체크해서 true가 나오면
        System.out.println(i)를 실행하고 i++해서 조건식을 다시 체크해서 
        반복 여부를 결정해라

        1. int i = 1;
        2. i <= 3; (현재 i의 값이 1이므로 true)
        3. System.out.println(i)
        4. i++(i의 현재값이 2가 된다.)
        5. i <= 3; (현재 i의 값이 2이므로  true)
        6. System.out.println(i)
        7. i++(i의 현재값이 3이 된다.)
        8. i <= 3; (현재 i의 값이 3이므로 true)
        9. System.out.println(i)
        10. i++(i의 현재값이 4이 된다.)
        11. i <= 3; (현재 i의 값이 4이므로 false)
        12. -> for문 종료
        */

       // for 반복문을 사용할때 주의할점과 알아두면 좋은 점
        // 1. 컨트롤 변수의 초기화식이나 조건식에 
        //    다른 변수가 들어갈 수도 있다.
        System.out.println("1. 다른 변수 사용");
        int number1 = 3;
        int number2 = 5;
        for(int i = number1; i <= number2; i++){
            System.out.println(i);
        }
        System.out.println("---------------------------------------");
        System.out.println("2. 처음부터 false가 나오는 조건식");
        // 만약 처음부터 false가 나오는 조건식이라면?
        for(int i = 1; i < 0; i++){
            System.out.println(i);
        }
        System.out.println("---------------------------------------");
        // 3. for 문 안의 제어변수를 선언할 시에
        //    해당 제어변수는 유효범위가 for문인 변수이다.
        System.out.println("3. 유효범위");
        for(int i = 1; i <= 3; i++){
            int j = i + 100;
            System.out.printf("i: %d, j: %d\n", i, j);
        }
        System.out.println("---------------------------------------");
        // 4. semicolon을 조심하자
        System.out.println("4. 세미콜론 조심하자");
        for(int i = 1; i <= 4; i++);{
            System.out.println("몇번 반복 될까?");
        }
        System.out.println("---------------------------------------");
        // 5. 할당연산자는 ++ 뿐만이 아니라
        //    제어변수를 바꿀 수 있기만 하면 
        //    뭐든 가능하다.
        System.out.println("5. 다양한 할당연산자");
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("---------------------------------------");
        // 6. 제어변수의 선언과 초기화는 밖으로 뺄 수 있긴 하지만
        //    왠만하면 항상 for 문 안에 넣자.
        //    만약 밖으로 뺄 시에는 for(;조건식;변화식) 의 형태가 된다.
        int i = 1;
        System.out.println("6. 제어 변수의 분리");
        for(; i <= 4; i++){
            System.out.println(i);
        }
        System.out.println("---------------------------------------");
    }
}