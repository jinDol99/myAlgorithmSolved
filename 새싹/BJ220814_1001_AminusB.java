import java.util.*;                             // 사용자로부터 값을 입력받기 위한 Scanner 클래스를 import 함

class minus {                                   // 뺄셈 계산을 위한 minus 클래스를 선언
    int A, B;                                   // 두 개의 값을 저장하기 위해 int 타입의 속성 A와 B를 선언 
    public void setA(int a) { A = a; }          // 외부로부터 읽어들인 값을 클래스 내부의 속성값에 저장하는          
    public void setB(int b) { B = b; }          // setA() 그리고 setB() 메소드를 선언

    public void AminusB() {                     // 값을 계산하고 결과값을 콘솔에 출력하는 AminusB() 메소드를 선언
        int X = A - B;
        System.out.println(X);
    }
}

public class BJ220814_1001_AminusB {
    public static void main(String[] args) {    // 메인 메소드에서 minus 클래스로 myMinus 객체를 생성
        minus myMinus = new minus();
        Scanner sc = new Scanner(System.in);    // 값을 입력받기 위해 Scanner 객체를 생성
        
        myMinus.setA(sc.nextInt());             // 두 개의 값을 myMinus 객체 속 setA(), setB() 메소드를 통해
        myMinus.setB(sc.nextInt());             // 값을 저장함.
        myMinus.AminusB();                      // AminusB() 메소드로 결과값을 출력함

        sc.close();                             // Scanner 객체 실행을 종료함
    }
}