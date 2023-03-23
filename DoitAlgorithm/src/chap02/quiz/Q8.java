package chap02.quiz;

class YMD {
    int y;
    int m;
    int d;

    YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    YMD after(int n) { // n일 뒤의 날짜를 반환
        YMD a = new YMD(y, m, d);
        m += n / 31;
        d += n % 31;
        int restd = d / 31;
        m += restd;
        int restm = m / 12;
        y += restm;

        d = d & 31;
        m = m % 12;

        return a;
    }

}
public class Q8 {
    public static void main(String[] args) {
        YMD ymd = new YMD(1994, 7, 25);
        ymd.after(1000);


        System.out.println(ymd.y + "년 " + ymd.m + "월 " + ymd.d + "일");
    }
}
