import java.util.Scanner;

public class BJ230731_9086_printBothEndOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        String[] stringArray = new String[testCases];

        for (int i = 0; i < testCases; i++)
            stringArray[i] = sc.next();

        for(String str:stringArray) {
            System.out.print(str.charAt(0));
            System.out.println(str.charAt(str.length()-1));
        }
            
        sc.close();
    }
}
