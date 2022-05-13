package Test.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String entertime = "08:00";
        String exitTime = "11:00";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d = null;
//      Exception例外處理 → try catch
        try{
            d = sdf.parse(entertime);
        }catch (Exception e){
            System.out.println("Wrong format!");
        }
        System.out.println(d);
        System.out.println(d.getTime());
//        long ms = 3*60*60*1000;
        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins = (int)(d2.getTime() - d.getTime())/1000/60;
//                   = (int)((d2.getTime() - d.getTime())/1000/60);
            System.out.println(mins);
            int fee = 30*(mins/60);
            System.out.println("Fee:"+fee);

//            3:14 → $90 , 3:15 → $120

            if (mins < 195 ){
                int fee2 = 90;
                System.out.println("Fee2:"+fee2);
            }else{
                int fee2 = 120;
                System.out.println("Fee2:"+fee2);
            }

//            3:15-3:30 → $105

            if (mins < 195 ){
                int fee3 = 90;
                System.out.println("Fee3:"+fee3);
            }else if (mins >= 195 && mins < 210 ){
                int fee3 = 105;
                System.out.println("Fee3:"+fee3);
            }
            else{
                int fee3 = 120;
                System.out.println("Fee3:"+fee3);
            }

        }catch (Exception e){
            System.out.println("Exit wrong format!");
        }
//        d2.setTime(d.getTime()+ms);
    }
}
