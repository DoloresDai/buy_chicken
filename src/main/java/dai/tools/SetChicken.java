package main.java.company.tools;

import main.java.company.model.Chicken;

public class SetChicken {
    public static void setChickenNumer(Chicken chicken, int sumNumber) { chicken.setNumber((int) ((sumNumber) / getChickenPrice(chicken)));
    }

    public static double getChickenPrice(Chicken chicken) {
        return chicken.getPrice(chicken.name);
    }

    public static String getChickenName(Chicken chicken) {
        return chicken.getName();
    }

    public static int getChickenNumber(Chicken chicken) {
        return chicken.getNumber();
    }
}
