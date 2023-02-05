import java.util.Scanner;

public class BJ230205_2744_ConvUpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] strArr = new char[str.length()];

        int asciiNum = 0;
        
        // System.out.println(str.length() + "\n");
        for (int i = 0; i < str.length(); i++) {
            asciiNum = (int)str.charAt(i);

            if (asciiNum >= 65 && asciiNum <= 90) {
                asciiNum += 32;   
            }
            else if (asciiNum >= 97 && asciiNum <= 122) {
                asciiNum -= 32;
            }    
            // System.out.print(asciiNum);
            strArr[i] = (char)asciiNum;
            // System.out.println(" | " + strArr[i]);       
        }
        String result = new String(strArr);
        System.out.println(result);
        sc.close();
    }
}