package date;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate gms = new MyDate(8, 8, 2022);
        if(gms.isVaild())
            System.out.println("유효");
        else System.out.println("유효하지 않음");
    }
}
