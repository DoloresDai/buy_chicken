package main.java.company.model;

public class Chick extends Chicken {
    public Chick(String name){
        super(name);
    }
    public double getPrice(String name) {
        double num=3;
        double price=1;
        return price/num;
    }
}
