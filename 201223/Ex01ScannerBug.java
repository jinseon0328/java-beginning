import java.util.Scanner;

//Scanner 버그 체험해보기 + 해결해보기
/*스캐너 버그란?
*/

class Ex01ScannerBug {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        int a = scanner.nextInt();

        System.out.println("b: ");
        int b = scanner.nextInt();

        System.out.println("d: ");
        double d = scanner.nextDouble();


        /* Scanner의 경우 버퍼메모리라는 임시 저장소에 입력값을 임시로 저장하고
        우리가 실험한 메소드에 형태와 일치하는 입력값인지 체크하여
        일치하는 형태이면 그 값을 읽어온다.
        맨 처음에 입력값을 스트링으로 읽어와서
        공백문자를 제거하고 남은 내용이 int, double등의 형태인지 체크한다.
        예시: int라면 남은 내용이 숫자만 있어야 한다.
        double이라면 남은 내용이 숫자만 있거나 숫자.숫자의 형태여야만 한다
        만약 실행한 메소드와 읽어온 스트링의 형태가 일치한다면
        스트링을 해당 데이터타입으로 변환한다.
        하지만 스트링의 경우 아무내용 없는 ""도 스트링이기 때문에
        이러한 버그가 발생하게 되는 것이다!!
        이 버그를 해결하기 위해서는
        현재 버퍼 메모리에 있는 내용을 읽어오되
        그 내용을 어딘가에 할당하는 것이 아니라
        읽어만 오면, 버퍼메모리는 지워지고
        우리가 정상적으로 nextline()을 실행해줄 수 있다.*/
        scanner.nextLine();
        // 이부분이 추가!!!!!!!!!!!!!

        System.out.println("str: ");
        String str = scanner.nextLine();
        //str ="";


        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("d: "+d);
        System.out.println("str: "+str);



    System.out.println("프로그램 종료");
scanner.close();


}


}
