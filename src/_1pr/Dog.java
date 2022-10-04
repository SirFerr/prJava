package _1pr;
public class Dog {
    private String dogName;
    private int dogAge;
    public Dog(String NameT, int dogAgeT){
        this.dogName=NameT;
        this.dogAge=dogAgeT;
    }
    public void setName (String NameT){
        this.dogName=NameT;
    }
    public String getName (){
        return dogName;
    }
    public void setDogAge (int dogAgeT){
        this.dogAge=dogAgeT;
    }
    public int getDogAge (){
        return dogAge;
    }
    public int dogAgeToHumanAge(){
        return dogAge*7;
    }
    public String toString() {
        return "Name: "+dogName+" Age: "+dogAge;
    }
}
