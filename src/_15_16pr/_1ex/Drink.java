package _15_16pr._1ex;

final public class Drink {
 private int cost=0;
 private String name, description;

 public Drink(int cost, String name, String description) {
  this.cost=cost;
  this.name = name;
  this.description = description;
 }
 public Drink(String name, String description) {
  this.name = name;
  this.description = description;
 }

 public int getCost() {
  return cost;
 }

 public String getName() {
  return name;
 }

 public String getDescription() {
  return description;
 }
}
