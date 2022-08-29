import java.util.*;
import java.math.*;
// java.math.* - ABS() 함수를 사용하기 위해 math 클래스를 import 함.

public class BJ220829_2420_SafariWorld {
    public static void fame(long num1, long num2) {
        long result = Math.abs(num1 - num2);
        System.out.println(result);
    }
    // fame() 메소드 - 두 개의 long 타입 정수를 가져와 n-m 한 값의 절대값을 출력함.
    //                 숫자의 절대값을 반환하는 함수 Math.abs를 활용함.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        fame(sc.nextLong(), sc.nextLong());
        sc.close();
    }
    // 메인 메소드 - 두 정수를 입력받아 fame()에게 넘겨줌
}