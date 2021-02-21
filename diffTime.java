import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class diffTime {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        while(sc.hasNext()) {
            String[] militaryTime = sc.nextLine().split(" ");

            String input1 = militaryTime[0];
            String input2 = militaryTime[1];
            int num1 = Integer.parseInt(input1.replaceFirst(":", ""));
            int num2 = Integer.parseInt(input2.replaceFirst(":", ""));
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            long min, dif, mins;
            Date limitU = format.parse("24:00");
            Date limitL = format.parse("00:00");
            Date time1 = format.parse(input1);
            Date time2 = format.parse(input2);
            if (num2 >= num1) {

                min = (time2.getTime() - time1.getTime()) / 60000;
                System.out.print("\n"+min);
            } else {

                dif = limitU.getTime() - time1.getTime();
                mins = time2.getTime() - limitL.getTime();
                mins += dif;
                System.out.print("\n"+mins / 60000);
            }
        }
    }
}
