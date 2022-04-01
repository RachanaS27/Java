import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

public class dateApiEx {
    public static void main(String[] args) {
        
        System.out.println(LocalDate.of(1998, Month.MAY, 27));
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.ofEpochDay(10));

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIDNIGHT);
 
        System.out.println(TimeZone.getTimeZone("IST").toString());
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
        Timer t = new Timer();
        int n =4;
        while(n>0){
        t.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("hello");                
            }
            
        }, 2000);
        n--;
    }
    }
}
