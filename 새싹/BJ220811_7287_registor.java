class BOJinfo {                                 // 새로운 BOJinfo 클래스 생성
    int score = 7;                              // 클래스의 속성으로 맞힌 문제 수(score)와
    String ID = "parkmoc21";                    // ID를 가지고 있으며, 이를 7, "parkmoc21"로 초기화

    public String getID() {                     // getID() 메소드로 ID 속성값을 반환함
        return ID;
    }

    public int getScore() {                     // getSocre() 메소드로 score 속성값을 반환함
        return score;
    }
}

public class BJ220811_7287_registor {
    public static void main(String[] args) {    
        BOJinfo BOJ = new BOJinfo();            // 메인 메소드에서 새로운 BOJ 객체(인스턴스)를 생성한 후
        System.out.println(BOJ.getScore());     // getScore() 그리고 getID() 메소드를 사용하여
        System.out.println(BOJ.getID());        // 맞힌 문제 수와 ID 값을 출력함.
    }
}