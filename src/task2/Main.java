package task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        date.setYear(2019);
        date.setMonth(11);
        date.setDate(27);
        date.setHours(15);
        date.setMinutes(10);
        date.setSeconds(30);
        System.out.println(date);
        System.out.println(dateToLocalDate(date));
        System.out.println(dateToLocalTime(date));
        System.out.println(dateToLocalDateTime(date));
    }

    public static LocalDate dateToLocalDate(Date date){
        LocalDate ld = LocalDate.of(date.getYear(), date.getMonth(), date.getDay());
        return ld;
    }

    public static LocalTime dateToLocalTime(Date date){
        LocalTime lt = LocalTime.of(date.getHours(), date.getMinutes(), date.getSeconds());
        return lt;
    }

    public static LocalDateTime dateToLocalDateTime(Date date){
        LocalDateTime ldt = LocalDateTime.of(date.getYear(), date.getMonth(), date.getDay(), date.getHours(),
                date.getMinutes(), date.getSeconds());
        return ldt;
    }
}
