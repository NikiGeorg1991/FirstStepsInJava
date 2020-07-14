import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTask {
    public static void main(String[] args) {


        System.out.println("Today is " + DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now()));
        System.out.println("Now is " + DateTimeFormatter.ISO_LOCAL_TIME.format(LocalTime.now()) + " o`clock");
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE.format(LocalDate.now().atStartOfDay(ZoneId.of(" EET"))));
    }
}
