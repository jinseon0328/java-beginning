/* 숙제 심화 버전
번호 -> 이름 -> 국영수 순으로 입력 받아서
번호 이름 국 영 수 총점 평균 순으로 출력하는 프로그램
 */
import java.util.Scanner;
class HW02 {
    /* static : 스태틱이란 해당 변수 혹은 메소드를
    자바의 메소드 메모리 영역에 등록시키는 키워드이다.
    만약 메소드에 스태틱이 붙어있을 경우,
    해당 메소드가 다른 메소도, 변수, 상수를 호출한다면
    그 다른 메소드, 변수, 상수에도 Static이 붙어있어야 한다!
    final : 파이널이란 해당 공간을 상수로 만드는 키워드이다.
    파이널이 붙어있는 공간의 경우, 한번 값이 초기화가 되면
    더이상 변경(=할당)을 할 수 없게 된다.
     */
    static final int SUBJECT_SIZE =3;
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        /*번호 입력받기
        "학생의 번호", "상품의 번호","스포츠 기사의 번호"등
        아이템에 부여되는 고유 번호는 주로 itn id 혹은 int seq라고 이름지어진다.*/
        System.out.println("번호: ");
        int id = scanner.nextInt();

        /* 이름 받기
        만약 우리가 이름부터 입력을 받았으면 
        버퍼메모리에 아무런 내용이 없겠지만
        현재는 번호를 입력받으면서 nextInt()를 사용했으므로 
        nextLine()을 한번 적어주고
        다시 nextLine()을 실행시켜서입력을 받게 한다.
         */
        System.out.println("이름: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        //국어 입력받기
        System.out.println("국어: ");
        int korean = scanner.nextInt();

        System.out.println("영어: ");
        int english = scanner.nextInt();

        System.out.println("수학: ");
        int math = scanner.nextInt();

        //총점 계산하기
        int sum = korean + english + math;

        //평균 계산하기
        double average = sum /3.0;
        /*위 코드에서 3.0은 
        우리가 코딩할 때 쉽게 코딩하려고 넣은
        "마법의 숫자"이다.
        
        마법의 숫자를 없애기 위해서는
        우리가 변수 혹은 상수를 
        적극적으로 사용해야한다.
        */

        average = sum / (double)SUBJECT_SIZE;

        //출력하기
        System.out.println("번호: "+id);
        System.out.println("이름: "+name);
        System.out.println("국어: "+korean);
        System.out.println("영어: "+english);
        System.out.println("수학: "+math);
        System.out.println("총점: "+sum);
        System.out.println("평균: "+average);





        scanner.close();
    }
}
