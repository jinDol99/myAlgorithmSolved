import java.util.Scanner;

public class BJ230728_27866_printString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        char[] StringArr = new char[inputString.length()];
        
        // 입력받은 문자열을 배열에 한 character씩 분리하여 저장
        for(int i = 0; i<StringArr.length; i++) {
            StringArr[i] = inputString.charAt(i);
        }

        int outputStringNum = sc.nextInt();
        sc.close();

        System.out.println(StringArr[outputStringNum-1]);
    }
}
