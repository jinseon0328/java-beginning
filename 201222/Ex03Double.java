/* 기본형 데이터타입 02- 실수형
실수형을 담당하는 데이터타입은 double과 float이 있다.
자바에서 실수는 double로 취급된다

만약 여러분들이 꼭 float이 필요하다!
이럴 때에는 값을 초기화해줄 때
실수값의 맨 뒤에 f를 붙여서
해당 실수가 float이라는 것을 적어주어야 한다.
*/
class Ex03Double {
    public static void main(String[] args){
        double myDouble = 3.4567;
        System.out.println("myDouble의 현재값: ");
        System.out.println(myDouble);
        

        //float myFloat = 3.4; -> 에러가 난다
        /*위 코드에서 3.4는 데이터타입이 double이다 -> 
        double은 float보다 크기가 크므로
        자바에서 데이터 손실이 일어날 수 있다고 보게 된다
        따라서 명시적 형변환을 하여 double 3.4을 float 3.4로 만들거나
        아니면 3.4가 double이 아닌 float 타입인 것을 명시해주어야 한다.
        물론 두 방법 모두 결과의 차이는 없다.*/

        //1.double 실수를 타입캐스팅하여 float으로 만들어 할당하기
        float myFloat = (float)3.14;

        //2. 만들어진 실수가 float임을 명시하고 할당하기
        myFloat = 3.14f;

        /* int와 마찬가지로 자바에서는
        실수는 기본적으로 double타입이다.
        따라서 굳이 float를 쓰지말고
        double을 쓰자!
        */

    }
}
