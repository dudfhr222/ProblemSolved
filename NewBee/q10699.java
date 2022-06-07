package BackJoon.NewBee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class q10699 {
    public static void main(String[] args) {
    Date date = new Date();
    String nowDate = date.toString();
    System.out.println("nowDate = " + nowDate);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String today = sdf.format(date);
    System.out.println(today);
    }

}
