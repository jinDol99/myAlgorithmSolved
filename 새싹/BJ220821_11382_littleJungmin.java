import java.util.*;

class tripleSum {
    long A = 0;
    long B = 0;
    long C = 0;
    public void setABC(long a, long b, long c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public void printSum() {
        System.out.println(A + B + C);
    }
}
// tripleSum 클래스 - 숫자 3개를 저장해 계산하여 출력함
// setABC() 메소드 - 3개의 long 타입의 숫자를 저장
//                  setA(), setB()처럼 하나하나 세터를 설정하지 않고
//                  매개변수를 여러개를 한번에 설정할 수 있음!
// printSum() 메소드 - 값 3개를 더한 값을 출력

public class BJ220821_11382_littleJungmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tripleSum ts = new tripleSum();

        ts.setABC(sc.nextLong(), sc.nextLong(), sc.nextLong());
        ts.printSum();

        sc.close();
    }
}
// 메인 메소드 - 3개의 값을 입력받아 결과값을 출력함

/*** 지식이 늘었다 ***
문제의 입력 조건 중, 1부터 10^12 까지의 값을 입력하라고 명시되어 있음.
Int 타입으로 코딩할 경우 범위 밖(1 ~ 약 10^9 조금 넘게)이라
Runtime Error (InputMismatchException)가 발생하므로, Long 타입으로
변수를 설정해야 입력 조건에 만족할 수 있음.
*********************/