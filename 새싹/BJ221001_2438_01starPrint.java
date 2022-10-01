import java.util.Scanner;

public class BJ221001_2438_01starPrint {
    public static void starPrint(int height) {
        for(int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if(i != height) {
                System.out.println();
            }
            
        }
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        starPrint(sc.nextInt());
        sc.close();
    }
}