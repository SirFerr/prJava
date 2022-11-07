package _13_14pr._2ex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                new Date(System.currentTimeMillis()).getTime()>
                        //1212121212121L
                new Date(1212121212121L).getTime()
                        ? "system > input" : "system < input");
    }
}
