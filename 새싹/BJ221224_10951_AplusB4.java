import java.util.Scanner;

public class BJ221224_10951_AplusB4 {
    private static void sum(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        while(true) {
            try{
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int y = sc.nextInt();
                sum(x, y);
                sc.close();
            } catch ( java.util.NoSuchElementException e ) {
                break;
            }
        }
    }
}
