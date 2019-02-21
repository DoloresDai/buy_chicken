package main.java.company.model;

public abstract class Chicken implements Chicken2 {
    private int number=1;
    public String name;
    Chicken(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return this.number;
    }
    public abstract double getPrice(String name);

}
