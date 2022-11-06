package _11_12pr._2ex;

public class Address {
    String country, region, city, street, house, building, apartment;
    String[] temp;
    public void set(String address){
        temp=null;
        try {
            if (address.contains(", "))
                temp=address.split(", ");
            else if (address.contains(". "))
                temp=address.split(". ");
            else if (address.contains("; "))
                temp=address.split("; ");
            else if (address.contains("- "))
                temp=address.split("- ");
            country=temp[0];
            region=temp[1];
            city=temp[2];
            street=temp[3];
            house=temp[4];
            building=temp[5];
            apartment=temp[6];
        }
        catch (Exception e){
            System.out.println("ERR");
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
