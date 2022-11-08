package _13_14pr._2ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
        try {
            System.out.println(
                    new Date(System.currentTimeMillis()).getTime()>
                            //10-8-2021
                            //10-8-2023
                    simpleDateFormat.parse(scanner.nextLine()).getTime()
                            ? "system > input" : "system < input");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
