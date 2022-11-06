package _11_12pr._1ex;

import java.util.Scanner;

public class Person {
    String first,second,last;

    public Person(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First name: ");
        first=scanner.nextLine();
        System.out.print("Second name: ");
        second=scanner.nextLine();
        System.out.print("Last name: ");
        last=scanner.nextLine();
        System.out.println(getFIO());
    }
    public String getFIO(){
        return first+" "+second+" "+last;
    }
}
