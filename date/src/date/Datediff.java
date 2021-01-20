package date;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;
 
public class Datediff {
 
    public static void main(String[] args) {
        System.out.println( getDaysInJava9(LocalDate.now(), LocalDate.now().plusDays(11)) );
        System.out.println( getDaysInJava9Weeks(LocalDate.now(), LocalDate.now().plusMonths(100)) );
    }
     
    //Stream of dates with 1 day difference
    public static long getDaysInJava9(LocalDate start, LocalDate end) {
        long l=start.datesUntil(end).count();//.collect(Collectors.toList());
        return l;
    }
     
    //Stream of dates with 1 week difference
    public static long getDaysInJava9Weeks(LocalDate start, LocalDate end) {
        long l= start.datesUntil(end, Period.ofMonths(1)).count();
        return l;
    }
}