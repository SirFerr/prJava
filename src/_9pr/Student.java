package _9pr;

public class Student {
    private String name;
    private int id;
    private double avgPoint;
    Student(String name, int id, double avgPoint) {
        this.name = name;
        this.id = id;
        this.avgPoint = avgPoint;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getAvgPoint() {
        return avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", avgPoint=" + avgPoint +
                '}';
    }
}