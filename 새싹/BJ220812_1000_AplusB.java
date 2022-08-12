import java.util.Scanner;                       // 사용자로부터 값을 입력받기 위한 Scanner 클래스를 import 함

class plus {                                    // 덧셈 계산을 위한 plus 클래스를 선언
    int A, B;                                   // 두 개의 값을 저장하기 위해 int 타입의 속성 A와 B를 선언 
    public void setA(int a) { A = a; }          // 값을 저장하기 위해 setA() 그리고 setB() 메소드를 선언함.
    public void setB(int b) { B = b; }          // 이 두 개의 메소드는 클래스 외부로부터 가져온 값을
                                                // 클래스 내부의 속성값으로 설정하는 기능을 가지고 있음.

    public int sumAB() {                        // 값을 계산하고 결과값을 반환하기 위한 sumAB() 메소드를 선언
        int X = A + B;                          // 임시 변수 X를 사용하여 속성값 A와 B를 더한 값을 저장하고
        return X;                               // 저장된 값이 들어있는 변수 X를 반환하는 기능을 가지고 있음.
    }
}

public class BJ220812_1000_AplusB {
    public static void main(String[] args) {    // 메인 메소드에서 plus 클래스로 myPlus 객체를 생성
        plus myPlus = new plus();

        Scanner sc = new Scanner(System.in);    // 값을 입력받기 위해 Scaneer 객체를 생성
        myPlus.setA(sc.nextInt());              // 두 개의 값을 myPlus 객체 속 setA() 및 setB() 메소드와
        myPlus.setB(sc.nextInt());              // Scanner 객체 속 nextInt() 메소드를 이용해 값을 저장함

        System.out.println(myPlus.sumAB());     // sumAB() 메소드를 통해 계산된 결과값을 반환하여 이를 출력함
        sc.close();                             // Scanner 객체 실행을 종료함
    }
}