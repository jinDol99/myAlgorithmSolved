class sprout {                                                          // 새싹 아스키아트를 출력하는 sprout 클래스를 선언
    void printSprout() {                                                // 아래 코드를 출력하는 printSprout() 메소드를 선언
        System.out.println("         " + ",r\'\"7");                    // \, ", ' 처럼 특수기호는 앞에 \를 붙혀 일반 문자처럼
        System.out.println("r`-_" + "   " + ",\'" + "  " + ",/");       // 출력하도록 지정하고, 공백의 경우 쌍따옴표를 사용해
        System.out.println(" " + "\\." + " " + "\"." + " " + "L_r\'");  // 공백 문자를 별도로 출력하도록 설정함.
        System.out.println("   " + "`~\\/");
        for (int i = 0; i < 2; i++)                                     // 중복된 내용의 문자열이 발생하는 경우
            System.out.println("      " + "|");                         // for 반복문을 이용하여 출력하도록 함.
    }
}

public class BJ220812_25083_sprout {
    public static void main(String[] args) {                            // 메인 메소드에서 printSprout()을 실행함
        sprout mySprout = new sprout();
        mySprout.printSprout();
    }
}