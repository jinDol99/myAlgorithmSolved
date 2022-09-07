import java.util.*;

/******* 지식이 늘었따 *******
Vector 배열은 초기의 배열 크기를 모를 때 요긴하게 사용됨.
Vector 클래스는 java.util 패키지 안에 있어, 라인 1과 같이 import를 함.

Vector의 생성은 라인 17와 같이 Vector<타입> 벡터명 = new Vector<타입>(크기, 증가량); 의 형식으로
선언할 수 있으며, new Vector 뒤의 타입과 크기, 증가량은 생략 가능함.

리스트에 값 삽입은 라인 28과 같이 벡터명.add(); 의 형태로 리스트의 맨 뒤에 값을 삽입할 수 있음.

리스트 속 값의 출력은 고전적인 방법으로는, for문 조건식에 벡터명.size(); (벡터의 크기 값)입력 후
반복 코드로 벡터명.get(i); 를 사용하는 방법이 있음.
또 다른 방법으로는 라인 33과 같이 for-each문을 사용해 i를 출력하는 방법도 있음.

Vector 그리고 for-each문에 대한 설명은 아래 두 개의 웹사이트를 참고하였음.
https://wikidocs.net/264 | https://psychoria.tistory.com/775
******************************/

public class BJ220907_10952_AplusB5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> result = new Vector<>();
        int A, B;
        while (true) {
            A = sc.nextInt();
            B = sc.nextInt();
            if (A == 0 && B == 0)
                break;
            else
                result.add(A+B);
        }

        for(int i : result) {
            System.out.println(i);
        }
        sc.close();
    }
    // 메인 메소드 - 입력받은 두 값을 각각 변수 A, B에 넣고 A+B의 결과를 배열에 넣는것을
    //               두 입력값이 모두 0일 때 까지 계속 반복하고, 반복이 멈추면 결과를 차례로 출력
}