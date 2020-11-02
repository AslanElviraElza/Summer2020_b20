package day33_LocalDataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class TimeFormatting {
    public static void main(String[] args) {
/*
        year: yy, yyyy
		Month: MM(number), MMM(three letters), MMMM(full Name)
		days: dd
		days name: E(three letters), EEEE(full name)
 */
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM/dd/yyyy, EEEE");

            LocalDate ld = LocalDate.of(2020,7,26);

            System.out.println(ld);
            System.out.println(  ld.format(dateFormat)  );

    /*
        hours: hh
		minutes: mm
		seconds: ss
		am/pm: a
     */

            DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
            LocalTime now =   LocalTime.now();
            System.out.println(now);
            System.out.println( now.format(timeFormat)  );

            // May/20/2019 Dayname 4:30 pm

        }
    }

