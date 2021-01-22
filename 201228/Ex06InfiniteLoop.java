/* 무한루프(Inrinite Loop)
무한루프란?
루프의 종료조건이 몇번을 체크를 하더라도 반복되어서
"무한하게" 돌아가는 반복문
 */
public class Ex06InfiniteLoop {
    public static void main(String[] args){
        // 1.for을 이요한 무한루프 만들기
        //A. 반복 조건식이 항상 참이 나오게 만들기
       // for(int i = 0; 0<1; i++){
        //    System.out.println("무한반복됩니다");
        //}
        //B. 제어변수를 변화시키지 않는다.
        //for(int i = 0; i < 1; i += 0){
        //    System.out.println("무한반복됩니다");
       // }
        //C. 아무것도 넣어주지 않는다.
        //for(;;){
        //    System.out.println("무한반복됩니다");
        //}
        //while을 사용한 무한루프 만들기
        //A. 변수를 하나 만들고 변화 시키지 않는다.
        //int i = 0; 
        //while(i < 3){
        //    System.out.println("무한반복됩니다");
        //}

        //B. 항상 true가 나오는 조건식을 넣어준다.
        //while(0 < 1){
        //    System.out.println("무한반복됩니다");
        //}
        //C. 그냥 true만 넣어준다.
        //while(true){
        //    System.out.println("무한반복됩니다");
        //}

    }
    
}
