class cat {                                     // 고양이 아스키아트를 출력하는 cat 클래스를 선언
    void printCat() {                           // 아래 4개의 문장을 출력하는 printCat() 메소드 선언
        System.out.println("\\    /\\");    // 이 때, "\"는 특수 문장기호로 인식하기 때문에
        System.out.println(" )  ( ')");     // "\" 앞에 "\"를 한번 더 붙혀줘야 함.
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }
}

public class BJ220811_10171_cat {
    public static void main(String[] args) {
        cat mycat = new cat();                  // 메인 메소드에서 cat 객체를 만들어
        mycat.printCat();                       // printCat()을 이용해 아스키아트를 출력함.
    }
}