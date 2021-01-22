/*다중 for loop
다중 for loop이란 중첩 if문과 마찬가지로
하나의 fop loop 안에 다른 for loop이 들어가는 것이다

한가지 유의할 점은 바깥쪽(=상위) for문이 한번 실행될 동안
안쪽(=하위) for문들은 지정된 횟수만큼 전부 반복하게 되는 것이다

전통적으로
최상위 for loop : i
차위 for loop : j
하위 for loop : k
순으로 우리가 제어변수를 만든다.
하지만 3중 for loop부터는 보기 매우 힘들다
*/


public class Ex01NestedForLoop {
    public static void main(String[] args){
         // i : 1
         // j : 10

        for (int i = 1 ; i <=3; i++){
            for (int j = 10; j<=12; j++){
                System.out.printf("i: %d, j: %d\n", i, j);
            }
        }
    }
    
}
