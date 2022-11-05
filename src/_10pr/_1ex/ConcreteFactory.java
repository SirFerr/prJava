package _10pr._1ex;

public class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        return new Complex(1, 0);
    }
    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
