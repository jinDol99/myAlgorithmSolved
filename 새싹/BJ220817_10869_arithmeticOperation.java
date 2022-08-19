import java.util.*;

class calc {
    int A, B;
    public void setA(int a) { A = a; }
    public void setB(int b) { B = b; }
    
    void plus()     { System.out.println(A+B); }
    void minus()    { System.out.println(A-B); }
    void times()    { System.out.println(A*B); }
    void devide()   { System.out.println(A/B); }
    void devRemn()  { System.out.println(A%B); }
}
// clac 클래스 - 두 정수를 입력받아 저장하고 사칙연산 계산 값을 출력함
// setA() 및 setB() 메소드 - 입력받은 값을 변수에 저장
// plus(), minus() ... devRemn() 메소드 - 저장된 변수로 사칙연산한 결과값을 출력함

public class BJ220817_10869_arithmeticOperation {
    public static void main(String args[]) {
      calc cl = new calc();
      Scanner sc = new Scanner(System.in);
      
      cl.setA(sc.nextInt());
      cl.setB(sc.nextInt());
      
      cl.plus();
      cl.minus();
      cl.times();
      cl.devide();
      cl.devRemn();

      sc.close();
    }
}
// 메인 메소드 - 값을 입력받고, 사칙연산한 결과값을 순서대로 출력