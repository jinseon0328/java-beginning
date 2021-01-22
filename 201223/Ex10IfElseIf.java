/* if- else if 구조
만약 첫번째 if 조건이 false일 때
다시 다른 조건식을 통해서 조건을 체크하는 경우,
우리가 if-else if-else 구조를 만들어주어야 한다.
else if는 우리가 필요한 만큼 도중에 끼어넣어줄 수 있다.
단, else는 가장 마지막에 한번 나올 수 있고
else 이후에는 else if가 나올 수 없다.
*/
class Ex10IfElseIf {
    public static void main(String[] args){
        int number = 5;
        if(number < 10){
            System.out.println("한자리 숫자입니다.");
        }else if(number<100){
            System.out.println("두자리 숫자입니다.");
        }else if(number<1000){
            System.out.println("세자리 숫자입니다.");
        }else{
            System.out.println("네 자리 이상의 숫자입니다");
        }
    }
    
}
