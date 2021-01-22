/* 주석(Comment)
주석이란?
프로그램 코드파일에 적혀있지만
컴파일 단계에서는 무시가 되는 코드
즉 쉽게 말해서 우리가 이런저런 설명글을 적지만
코드에서는 아무런 영향을 미치지 않는다.
*/

//주석에는 크게 한줄 주석과 여러줄 주석이 있는데
//한줄 주석은 //을 적으면 그 칸 이후는 모두 주석이 된다.
//여러줄 주석은 /* */으로 감싸진 모든 줄이 주석이 된다.


/*이렇게
모든 줄이 
주석이 된다 */

class Ex01Comment{
    public static void main(String[] args){
        System.out.println("1번");
        //System.out.println("2번");
        System.out.println("한글 나오니");
    }

}

//class, public, static은 예약어