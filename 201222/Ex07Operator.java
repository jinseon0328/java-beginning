/*할당 연산자
할당연산자는 뒤의 값을 앞에 할당할때 사용되는 연산자이다
=, +=, -=, *=, /=, %=, ++, --
class Ex07Operator {
    public static void main(String[] args){
    /* x + 3 = 2x +1
    수학적으로 =은 왼쪽 변과 오른쪽 변의 값이 같다 라는 의미이다.*/
    
    class Ex07Operator{
        public static void main(String[] args){
    
        int myNumber;
        myNumber = 12;
        // 12을 myNumber에 저장해라 -> 왜냐하면 12=myNumber; 가 안되므로
        //두개의 값을 비교하는 것은 비교 연산자가 하게 될 것이다.
    
        /*
        하지만 프로그래밍적으로 =은 의미가 완전히 다르다
        프로그래밍에서 =은 오른쪽 값을 왼쪽 공간에 할당하라는 의미가 된다.
        */
    
        // = : 왼쪽 공간에 오른쪽 값을 할당하라
        myNumber = 34;
        System.out.println("myNumber의 현재값: " +myNumber);
        // += : 왼쪽 공간의 현재값에 오른쪽 값을 더하고 그 결과값을 왼쪽 공간에 다시 할당하라
        myNumber += 6;
        System.out.println("myNumber의 현재값: " +myNumber);
    
        // -= : 왼쪽 공간의 현재값에 오른쪽 값을 빼고 그 결과값을 왼쪽 공간에 다시 할당하라
        myNumber -= 5;
        System.out.println("myNumber의 현재값: " +myNumber);
    
        // *= : 왼쪽 공간의 현재값에 오른쪽 값을 곱하고 그 결과값을 왼쪽 공간에 다시 할당하라
        myNumber *= 2;
        System.out.println("myNumber의 현재값: " +myNumber);
    
        // /= : 왼쪽 공간의 현재값에 오른쪽 값을 나눈 몫을 왼쪽 공간에 다시 할당하라
        myNumber /= 3;
        System.out.println("myNumber의 현재값: " +myNumber);
    
        // %= : 왼쪽 공간의 현재값에 오른쪽 값을 나누고 난 나머지를 왼쪽 공간에 다시 할당하라
        myNumber %= 5;
        System.out.println("myNumber의 현재값: " +myNumber);
    
        /* ++, --는 증감연산자로써
        해당 공간의 값을 1씩 증가시키거나 감소시킨다.
        단 변수의 앞에 붙냐 뒤에 붙냐에 따라서 의미가 달라지게 된다.
        변수의 앞에 붙을 경우 전위 증감 연산자로써 해당 줄에서 가장 먼저 실행이 된다. (=가장 우선순위가 높다.)
        변수의 뒤에 붙을 경우 후위 증감 연산자로써 해당 줄에서 가장 나중에 실행이 된다. (=가장 우선순위가 낮다.)
         */
        System.out.println("--------증감연산자--------");
        System.out.println("myNumber의 현재값: " + myNumber);
        System.out.println("++myNumber : " + ++myNumber);
        /*위 코드는 한 줄로 되어있지만 다음과 같은 과정을 거친다.
        1. ++myNumber -> myNumber의 현재값이 1 증가된다.
        2. "++myNumber: "가 만들어진다.
        3. "++myNumber: " +myNumber가 실행되면서
           "++myNumber: 4" 라는 문자열이 완성된다.
        4. System.out.println 이 실행되어서 화면에 "++myNumber: 4"가 출력된다.    
        */
    
    
    
        System.out.println("myNumber의 현재값: " + myNumber);
        System.out.println("myNumber++ : " + myNumber++);
        /* 
        1."myNumber++: "라는 문자열이 생성
        2. "myNumber++: "뒤에 myNumber의 현재값인 4가 붙으면서
        "myNumber++ 4: "라는 문자열이 생성
        3. System.out.println 이 실행되어서 화면에 "myNumber++: 4"가 출력된다.
        4. myNumber++가 실행되어서 myNumber의 현재값이 1 증가되어 5가 된다.
         */
        System.out.println("myNumber의 현재값: " + myNumber);
    
        
        }
    
    }