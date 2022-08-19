import java.util.*;

class dev {
    double A, B;
    public void setA(double a) { A = a; }
    public void setB(double b) { B = b; }
    double printDevide() {
        return A/B;
    }
}
// dev 클래스 - 값을 계산할 두 소수를 저장 및 계산 값을 반환
// setA() 및 setB() 메소드 - 두 수를 저장
// printDevide() 메소드 - A에서 B를 나눈 값을 소수 형식으로 출력

public class BJ220819_1008_AdevideB {
    public static void main(String[] args) {
        dev myDev = new dev();
        Scanner sc = new Scanner(System.in);

        myDev.setA(sc.nextDouble());
        myDev.setB(sc.nextDouble());
        System.out.println(myDev.printDevide());

        sc.close();
    }
}
// 메인 메소드 - 두 수를 입력하여 소수 결과값을 출력