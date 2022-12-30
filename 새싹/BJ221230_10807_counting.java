import java.util.Scanner;

class myInteger {
    int[] arr;
    int maxNum;

    public void setArraySize(int maxNum) {
        arr = new int[maxNum];
        this.maxNum = maxNum;
    }
    // setArraySize 메소드 - 배열의 크기를 지정

    public void setArrayValue(int i, int nextInt) {
        arr[i] = nextInt;
    }
    // setArrayValue 메소드 - 배열의 i번째에 nextInt를 저장

    public void findArrayValue(int targetInt) {
        int count = 0;
        int correctCount = 0;
        while (count < maxNum) {
            if (arr[count] == targetInt) {
                correctCount++;
            }
            count++;
        }
        System.out.println(correctCount);
    }
    // findArrayValue 메소드 - 배열 내부의 targetInt 값을 세어 콘솔에 출력
}

public class BJ221230_10807_counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myInteger mi = new myInteger();

        int maxNum = sc.nextInt();
        mi.setArraySize(maxNum);
        
        for (int i = 0; i < maxNum; i++) {
            mi.setArrayValue(i, sc.nextInt());
        }

        mi.findArrayValue(sc.nextInt());

        sc.close();
    }
}