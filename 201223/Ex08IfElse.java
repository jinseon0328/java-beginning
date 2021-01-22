/* if-else 구조
if-else 구조에서는
우리가 조건식이 true가 나오면
if에 속하는 코드 블락이 실행되지마 
만약 조건식이 false가 나오면
무조건 else 코드 블락이 실행이 된다.
즉 실행되는 코드 브락은 단 하나!
 */
class Ex08IfElse {
    public static void main(String[] args){
        int number = 5;
        if(number >= 0){
            System.out.println("number는 자연수입니다.");

        }else{
            System.out.println("number는 음의 정수입니다.");
        }
}
}