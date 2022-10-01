import java.util.Scanner;

public class BJ221001_2739_timeTable {
    public static void timeTablePrint(int num) {
        for(int i = 1; i <= 9; i++) {
            System.out.print(num + " * " + i + " = " + (num * i));
            if (i != 9) {
                System.out.print("\3n");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        timeTablePrint(sc.nextInt());
        sc.close();
    }
}