package _3pr;

public class Square extends Rectangle{
    private double side;

    public Square(){}
    public Square(double side){
        this.side=side;
    }
    public Square(double side, String color,boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.side=side;
    }

    @Override
    public void setLength(double side) {
        this.side=side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
