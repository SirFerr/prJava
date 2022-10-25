package _9pr;

import java.util.ArrayList;

public class Main extends Exception {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("A a A", 1, 5.0));
        arr.add(new Student("B b B", 2, 3.52));
        arr.add(new Student("C c C", 3, 2.94));
        arr.add(new Student("D d D", 4, 4.78));
        arr.add(new Student("E e E", 5, 0));
        new LabClassUI(arr);
    }   
}