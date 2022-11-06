package _11_12pr._3ex;

import java.util.Arrays;

public class Shirt{
    String article,name,color,size;
    String[] tmp;
    void set(String shirts) {
        tmp=shirts.split(",");
        article=tmp[0];
        name=tmp[1];
        color=tmp[2];
        size=tmp[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "article='" + article + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size +
                '}';
    }
}
