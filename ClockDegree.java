import java.util.*;

public class ClockDegree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double l = sc.nextDouble();
        double time = (h/ 360) * l;
        int hour = (int) time;
        int minute = (int) ((time - hour) * 60);
        //System.out.println(time+" = "+hour + ":" + minute);
        int min_hand=minute*6;
        int hour_hand=(hour*30)+(minute*min_hand/360);
        System.out.println(Math.abs(min_hand-hour_hand));
    }
}