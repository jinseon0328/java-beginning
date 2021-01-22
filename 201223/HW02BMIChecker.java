/*사용자로부터 키와 몸무게를 입력받아서
bmi 계산을 해서
~18.5 미만 : 저체중
18.5 ~ 23 미만 : 정상
23 ~ 25미만 : 과체중
25 ~ 30미만 : 비만
30 ~ : 고도비만이 출력되는 프로그램을 작성하세요

심화과정 기네스북에 의하면 세상에서 키가 가장 큰 사람은 272였다고 한다
세상에서 가장 무거웠던 사람은 635킬로그램이었다고 한다
만약 사용자가 그것을 초과하는 값을 입력하면
"잘못 입력하셨습니다."가 출력이 되게 프로그램을 만들어 보세요
*/
import java.util.Scanner;
public class SHW02BMIChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("키");
        System.out.print("> ");
        double height = scanner.nextDouble(); 

        System.out.println("몸무게");
        System.out.print("> ");
        double wight = scanner.nextDouble();

        double bmi = wight / height / height;
        if(bmi < 18.5){
            System.out.println("저체중");
        }else if(bmi < 23){
            System.out.println("정상체중"); 
        }else if(bmi < 25){
            System.out.println("과체중");
        }else if(bmi < 30){
            System.out.println("비만");
        }else{
            System.out.println("고도비만");
        }


        scanner.close();
 
    }
}

import java.util.Scanner;
public class SHW02BMIChecker2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("키");
        System.out.print("> ");
        double height = scanner.nextDouble();
        if(height >= 0 && height <= 2.72){
            // 키가 올바른 범위이므로 몸무게를 입력 받는다.
            System.out.println("몸무게");
            System.out.print("> ");
            double weight = scanner.nextDouble();

            if(weight >= 0 && weight <= 635){
                //몸무게가 올바른 범위 이므로 비엠아이를 계산하여
                //결과를 출력해준다.
                double bmi = weight / height / height;
                if(bmi < 18.5){
                    System.out.println("저체중");
                }else if(bmi < 23){
                    System.out.println("정상체중"); 
                }else if(bmi < 25){
                    System.out.println("과체중");
                }else if(bmi < 30){
                    System.out.println("비만");
                }else{
                    System.out.println("고도비만");
                }

            }else{
                //잘못된 몸무게이므로 경고 메시지 출력
                System.out.println("잘못된 몸무게 입니다");
            }

        }else{
            //잘못된 키이므로 경고 메시지 출력
            System.out.println("잘못된 키입니다");
        }

       

       


        scanner.close();
 
    }
}