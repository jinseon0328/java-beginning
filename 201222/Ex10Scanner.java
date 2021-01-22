/* 자바에서의 입력은
Scanner라는 클래스의 변수를 만들어서
해당 변수의 메소드를 통하여 키보드 입력을 받게 된다.
하지만 Scanner라는 클래스는 우리 폴더에 존재하지 않으므로
우리가 import 라는 예약을 이용해서 해당 클래스를 우리 클래스에서 사용하겠다고
"수입"해 와야한다.
 */
import java.util.Scanner;
//java.util.Scanner라는 폴더 안에 있는 스캐너를 "import" 수입해온다.
class Ex10Scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /* 스캐너 변수는 
        생성할 때 "어디서" 입력값을 읽어올지를 지정해주어야 한다.
        우리는 키보드 입력을 사용하기 때문에
        new Scanner()의 ()안에 System.in이라고 적어준다.
         */
        

        /* 정수를 입력 받을 때에는 nextIn() 메소드를 실행하면 된다.
        
         */
        int number = -1234;
        System.out.println("number의 현재값: "+number);
        System.out.println("정수를 입력해주세요: ");
        number = scanner.nextInt();
        System.out.println("number의 현재값: "+number);

        //실수를 입력받을 때에는 
        //nextDouble() 메소드를 실행하면 된다.
        System.out.println("실수를 입력해주세요: ");
        double myDouble = scanner.nextDouble();
        System.out.println("number의 현재값: "+myDouble);

        /*숙제 
        사용자로부터 국어, 영어, 수학 점수를 입력받아서
        각 점수와 총점, 평균을 계산하는 프로그램을 작성하시오
        심화문제
        스캐너 버그를 검색해보시고
        위의 문제에서 학생 -> 번호 이름 국어,영어,수학 순으로 입력 받고
        번호, 이름, 국어, 영어, 수학, 총점, 평균이 차례대로 출력되는 프로그램을
        작성하시오*/
        



        /*Scanner, Reader 등의 클래스 변수는
        버퍼메모리라는 곳을 "읽어온다".
        그렇게 다른 메모리를 읽는 클래스 변수는 
        항상 다 사용하고 나면 close()라고 적어서
        메모리 읽기를 끝내주어야 한다. -> 메모리의 불필요한 운동을 없앤다
        */
        scanner.close();
}
}