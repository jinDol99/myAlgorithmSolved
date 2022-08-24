import java.util.*;

public class BJ220824_2753_LunaYear {
    public static void isLunaYear(int year) {
        if (year % 4 == 0 && year % 100 != 0)
            System.out.println(1);
        else if (year % 400 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
    // isLunaYear() 메소드 - 년도 값을 판단하여 윤년이면 1을, 아니면 0을 출력함

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isLunaYear(sc.nextInt());
        sc.close();
    }   
    // 메인 메소드 - 사용자로부터 값을 입력받아 위의 메소드에 대입함
}