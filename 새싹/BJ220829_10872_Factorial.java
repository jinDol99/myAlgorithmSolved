import java.util.*;

public class BJ220829_10872_Factorial {
    public static int facto(int inputNum) {
        int result = 1;
        if (inputNum == 0) {
            return result;
        } else {
            for (int i = 1; i <= inputNum; i++)
                result *= i;
            return result;
        }
    }
    // facto() 메소드 - int 타입의 정수를 가져와 그 값 만큼 반복하여 곱연산을 한 후 결과를 반환함.
    //                  이 때, 반복 초기값 및 곱연산 대상은 1로 지정함.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(facto(sc.nextInt()));

        sc.close();
    }
    // 메인 메소드 - facto()로 생성된 결과값을 출력함
}
