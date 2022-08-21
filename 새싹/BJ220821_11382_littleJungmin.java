import java.util.*;

class tripleSum {
    int A, B, C;
    // public void setABC(int a, int b, int c) {
    //     this.A = a;
    //     this.B = b;
    //     this.C = c;
    // }

    public void setA(int a) { A = a; }
    public void setB(int b) { B = b; }
    public void setC(int c) { C = c; }

    // public void printSum() {
    //     System.out.println(A + B + C);
    // }

    int getResult() {
        return A + B + C;
    }
}

public class BJ220821_11382_littleJungmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tripleSum ts = new tripleSum();

        ts.setA(sc.nextInt());
        ts.setB(sc.nextInt());
        ts.setC(sc.nextInt());

//        ts.setABC(sc.nextInt(), sc.nextInt(), sc.nextInt());
//        ts.printSum();
        System.out.println(ts.getResult());

        sc.close();
    }
}