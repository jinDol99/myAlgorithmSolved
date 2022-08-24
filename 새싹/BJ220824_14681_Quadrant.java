import java.util.*;

public class BJ220824_14681_Quadrant {
    public static void whatQuadrantIsIt(int x, int y) {
        if (x > 0) {
            if (y > 0)
                System.out.println(1);
            if (y < 0)
                System.out.println(4);
        }
        if (x < 0) {
            if (y > 0)
                System.out.println(2);
            if (y < 0)
                System.out.println(3);
        }
    }
    // whatQuadrantIsIt() 메소드 - x, y 두 개의 값을 가져와 음수와 양수인지 판단하여
    //                            상황에 맞는 값을 출력함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        whatQuadrantIsIt(sc.nextInt(), sc.nextInt());
        sc.close();
    }
    // 메인 메소드 - 값을 입력받아 whatQuad...It() 메소드에 넘겨줌
}