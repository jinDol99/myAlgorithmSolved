import java.util.Scanner;

public class BJ230201_10871_LessThenX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int targetNum = sc.nextInt();

        int[] arr = new int[arrLen];

        for (int i = 0; i < arrLen; i++) {            
            arr[i] = sc.nextInt();
            //System.out.println("배열의 " + i + "번째에 " + arr[i] + "값을 입력하였습니다.");
            if (arr[i] < targetNum) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
