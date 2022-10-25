package _9pr;

public class StudentNotFoundException extends Exception {
    StudentNotFoundException(String nameStudent) {
        super("Студент " + nameStudent + " не найден");
    }
}
