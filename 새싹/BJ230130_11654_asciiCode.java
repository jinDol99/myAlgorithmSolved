import java.util.Scanner;

//메인 메소드 - 입력값을 아스키코드 10진값으로 변환 및 출력
public class BJ230130_11654_asciiCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        System.out.println((int)ch);
        sc.close();
    }
}