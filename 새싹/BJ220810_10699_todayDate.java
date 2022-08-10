import java.time.*;                             // 현재 날짜 및 시간을 표현하는 time 패키지를 가져옴

class Date {                                    // Date 클래스를 생성
    void setDate() {                            // 날짜를 출력할 setDate() 메소드를 생성
        LocalDate now = LocalDate.now();        // time 패키지 속LocatDate 클래스의 now() 메소드를 사용해
        System.out.println(now);                // 현재 시스템 시간을 가져온 후 출력함.
    }
}

public class BJ220810_10699_todayDate {
    public static void main(String[] args) {    // main 메소드에서 setDate() 메소드를 실행함.
        Date date = new Date();
        date.setDate();
    }
}
