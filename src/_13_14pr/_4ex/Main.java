package _13_14pr._4ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 11-8-2022 10:30
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M-d-y h:m");
        try {
            Date date = simpleDateFormat.parse(scanner.nextLine());
            System.out.println(date);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            System.out.println(calendar);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }



    }
}
