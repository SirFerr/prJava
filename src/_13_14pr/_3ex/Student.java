package _13_14pr._3ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    String firstName, lastName;
    Date birthday = null;
    String pattern ;

    public Student(String firstName, String lastName, String birthday, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        this.firstName = firstName;
        this.lastName = lastName;
        this.pattern = pattern;
        try {
            this.birthday = simpleDateFormat.parse(birthday);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + simpleDateFormat.format(birthday)+
                '}';
    }
}
