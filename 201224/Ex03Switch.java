/* 조건문 02 -switch
switch 조건문은
조건식이 아닌
변수의 값에 따라 실행할 코드가 달라지게 된다.
 */
class Ex03Switch {
public static void main(String[] args){
    int number = 2;

    /*if와는 다르게 switch에선
    우리가 true/false가 나오는 조건식이 아니라
    정수형 변수 혹은 스트링 변수를
    선택해서
    그 변수의 값에 따른 코드를 우리가 정의해주게 된다.
    */
    switch(number){
        case 1:
        System.out.println("1입니다.");
        break;
        case 2:
        System.out.println("2입니다.");
        break;
        case 3:
        System.out.println("3입니다.");
        break;
        case 4:
        System.out.println("4입니다.");
        break;
        default:
        System.out.println("그외입니다.");
        
        //1은 만족하지 않으므로 나오지 않고
        //"2입니다" 부터 출력된다
    

    }

  }
}