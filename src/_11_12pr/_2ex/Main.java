package _11_12pr._2ex;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.set("1, 2, 3, 4, 5, 6, 7");
        System.out.println( address.toString());
        address.set("1. 2. 3. 4. 5. 6. 7");
        System.out.println( address.toString());
        address.set("1; 2; 3; 4; 5; 6; 7");
        System.out.println( address.toString());
        address.set("1- 2- 3- 4- 5- 6- 7");
        System.out.println( address.toString());
    }
}
