import java.util.Calendar;
import java.util.Date;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 기본 타입의 배열은 참조 타입
        int[] m = {1,2,3};
        int[] n = new int[] {1,2,3};

        // 참조타입 - 객체 타입
        String card = "H8";
        Date d = new Date();
        Calendar cal = Calendar.getInstance(); // 오늘
        System.out.println(card);
        System.out.println(d);
        System.out.println(cal);
        }
    }
