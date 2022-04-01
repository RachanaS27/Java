import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class temporalAdjustEx {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1998, Month.MAY, 30);
        LocalDate date1 = LocalDate.of(2022, Month.APRIL, 1);

        TemporalAdjuster ta = t -> t.plus(Period.ofDays(10));
        System.out.println(date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY)));
        System.out.println(date1.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println(date.with(ta));
        ta = t -> t.minus(Period.ofMonths(2));
        System.out.println(date.with(ta));
        LocalTime t = LocalTime.now();
        date.atTime(t);
        System.out.println(date.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(date.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println(date.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY)));
        System.out.println(date.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY)));
        System.out.println("date formats");
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("uuuu-MMM-dd");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("uuuu-MMMM-dd");
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("d/MMM/uuuu");
        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("dd/MMMM/uu");
        DateTimeFormatter df5 = DateTimeFormatter.ofPattern("MMM/d/uu");
        DateTimeFormatter df6 = DateTimeFormatter.ofPattern("MMMM/dd/uuuu");
        DateTimeFormatter df7 = DateTimeFormatter.ofPattern("MMM/dd/uuuu");
        DateTimeFormatter df8 = DateTimeFormatter.ofPattern("uuuu/MMM/dd");

        System.out.println(date1.format(df1));
        System.out.println(date1.format(df2));
        System.out.println(date1.format(df3));
        System.out.println(date1.format(df4));
        System.out.println(date1.format(df5));
        System.out.println(date1.format(df6));
        System.out.println(date1.format(df7));
        System.out.println(date1.format(df8));



    }
}
