class dog {                                     // 강아지 아스키아트를 출력하는 dog 클래스를 선언
    void printDog() {                           // 아래 5개 문장을 출력하는 printDog() 메소드 선언
        System.out.println("|\\_/|");           // 이 때, "\" 문자는 특수부호로 인식하므로
        System.out.println("|q p|   /}");       // 앞에 "\"를 입력하여 일반 문장부호로 인식하게끔 설정
        System.out.println("( 0 )\"\"\"\\");    // ' " '(큰따옴표)도 마찬가지로 앞에 "\"를 붙혀
        System.out.println("|\"^\"`    |");     // 일반 부호로 인식하도록 설정.
        System.out.println("||_/=\\\\__|");
    }
}

public class BJ220812_10172_dog {
   public static void main(String[] args) {     // 메인 메소드에서 위의 printDog() 메소드를 실행
        dog myDog = new dog();
        myDog.printDog();
   } 
}