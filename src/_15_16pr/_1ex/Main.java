package _15_16pr._1ex;

public class Main {
    public static void main(String[] args) {
        Drink drink= new Drink(100, "Name1", "Description1");
        System.out.println(drink.getCost()+" "+ drink.getName()+" "+ drink.description);

        drink= new Drink( "Name2", "Description2");
        System.out.println(drink.getCost()+" "+ drink.getName()+" "+ drink.description);
    }
}
