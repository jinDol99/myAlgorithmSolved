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

public class BJ220817_10869_ arithmeticOperation {
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
    }
}
