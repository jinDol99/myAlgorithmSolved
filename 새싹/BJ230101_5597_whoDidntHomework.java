import java.util.Scanner;

class AttendanceNum {
    int[] arr = new int[31];    // 30개의 숫자를 담기 위한 배열.
                                // 단, 0번 인덱스는 사용하지 않으므로 31개의 배열을 생성함
    int highNum;                // 출력 값 중 높은 숫자를 저장
    int lowNum;                 // 출력 값 중 낮은 숫자를 저장

    // 배열의 n번째 인덱스에 입력값을 저장하는 메소드 
    public void setNum(int index, int value) {
        arr[index] = value;
    }

    // 두 숫자의 자리를 바꾸는 메소드(번호가 작은게 앞으로 와야 할 때 사용)
    public void swapNum(int high, int low) {
        int temp = 0;
        temp = high;
        high = low;
        low = temp;

        this.highNum = high;
        this.lowNum = low;
    }

    // 배열 속 빈 값(0)이 들어있는 자리의 번호를 저장하는 메소드
    public void findEmptyIndex() {
        for (int i = 1; i <= 30; i++) {
        // 계산의 효율성을 위해 0번 인덱스는 활용하지 않고 1번 인덱스부터 값을 저장함
            if (arr[i] == 0) {
                if(highNum == 0) {
                    this.highNum = i;
                } else {
                    this.lowNum = i;
                }
            }
        }
    }

    // 결과 값을 출력하는 메소드
    public void printResult() {
        if (highNum < lowNum) {
            swapNum(highNum, lowNum);
        }
        System.out.println(lowNum + "\n" + highNum);
    }
}

// 메인 메소드
public class BJ230101_5597_whoDidntHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AttendanceNum an = new AttendanceNum();

        for (int i = 0; i < 28; i++) {
            int inputNum = sc.nextInt();
            an.setNum(inputNum, inputNum);
        }

        an.findEmptyIndex();
        an.printResult();
        sc.close();
    }
}