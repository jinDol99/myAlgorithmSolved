class printString {                             // 새 클래스 생성: printString
    void printHelloWorld() {                    // 리턴값이 없는(void) printHelloWorld() 메소드를 생성
        System.out.println("Hello World!"); // 해당 메소드는 "Hello World"를 출력하는 문장을 실행하는
    }                                           // 역할을 지님.
}

public class BJ220810_2557_HelloWorld {
    public static void main(String[] args) {    // main 메소드를 생성
        printString print = new printString();  // printString 클래스를 선언
        print.printHelloWorld();                // printHelloWorld() 메소드를 실행
    }
}