package _10pr._1ex;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Complex complexNum = concreteFactory.createComplex(5, 1);

        complexNum = complexNum.plus(new Complex(1, 2));
        System.out.println(complexNum.toString());
    }
}
