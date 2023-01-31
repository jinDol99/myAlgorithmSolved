import java.util.Scanner

fun main {
    before45min();
}

// 입력 시간(hh와 mm)에서 45분 이전의 시각을 출력하는 함수
fun before45min() {
    val sc = Scanner(System.`in`)
    var hh:Int = sc.nextInt()
    var mm:Int = sc.nextInt() -45

    if (mm < 0) {
        mm += 60;
        hh--;
    }

    if (hh < 0) {
        hh += 24;
    }

    print("$hh $mm")
    sc.close()
}