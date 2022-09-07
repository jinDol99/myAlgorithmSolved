import java.util.*;

public class BJ220907_10950_AplusB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[sc.nextInt()];

        for (int i = 0; i < result.length; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            result[i] = A + B;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
    // 메인 메소드 - 입력받은 값 만큼의 크기 배열을 만든 후 해당 배열에 입력값 만큼의 두 숫자를
    //              반복하여 삽입하고 결과값을 다시 차례대로 반복하여 출력함
}