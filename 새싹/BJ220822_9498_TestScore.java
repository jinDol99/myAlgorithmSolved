import java.util.*;

public class BJ220822_9498_TestScore {
    public static void whatsMyScore(int num) {
        if (num >= 90)
            System.out.println("A");
        else if (num >= 80 && num < 90)
            System.out.println("B");
        else if (num >= 70 && num < 80)
            System.out.println("C");
        else if (num >= 60 && num < 70)
            System.out.println("D");
        else
            System.out.println("F");
    }
    // whatsMyScore() 메소드 - 입력받은 int 값의 범위에 따라 특정 문자를 출력함
    // 이처럼 같은 클래스 내에서 작성한 메소드를 바로 다른 메소드에서 사용 가능함.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        whatsMyScore(sc.nextInt());
    }
}
