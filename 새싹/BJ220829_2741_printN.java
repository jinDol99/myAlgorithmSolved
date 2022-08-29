import java.util.*;

public class BJ220829_2741_printN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();

        for (int i = 1; i <= repeatNum; i++) {
            System.out.println(i);
        }
        sc.close();
    }
    // 메인 메소드 - 입력받은 값 만큼 1부터 n번째 까지 출력함
}
