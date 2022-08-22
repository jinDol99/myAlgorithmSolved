import java.util.*;

class Compare {
    int A, B;
    public void setAB(int a, int b) {
        A = a;
        B = b;
    }

    void compAB() {
        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
// Compare 클래스 - 두 수를 저장하여 값을 비교함
// setAB() 메소드 - 두 개의 int 타입 숫자를 저장
// compAB() 메소드 - 두 개의 숫자를 비교하여 결과에 따라 특정 문자를 출력

public class BJ220822_1330_CompareTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compare cp = new Compare();

        cp.setAB(sc.nextInt(), sc.nextInt());
        cp.compAB();

        sc.close();
    }
}
// 메인 메소드 - 두 개의 숫자를 입력받아 결과를 출력함