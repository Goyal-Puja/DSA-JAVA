package StringBuilder_StringBuffer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifferenceCal {
    public static void main(String[] args){
        LocalDate date1 = LocalDate.of(2024, 11, 20);
        LocalDate date2 = LocalDate.of(2024, 11,24);

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(daysBetween);
    }
}
