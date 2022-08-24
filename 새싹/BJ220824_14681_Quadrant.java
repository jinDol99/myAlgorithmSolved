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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        whatQuadrantIsIt(sc.nextInt(), sc.nextInt());
        sc.close();
    }
}