package _1pr;

public class Main {
    public static void main(String[] args) {
       Dog Collie = new Dog("Jojo", 5);
       System.out.println(Collie.toString());
       System.out.println(Collie.dogAgeToHumanAge());;
       Collie.setName("Greg");
       Collie.setDogAge(4);
       System.out.println(Collie.getName());
       System.out.println(Collie.getDogAge());
    }
}
