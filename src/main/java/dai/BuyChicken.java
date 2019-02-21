import main.java.company.model.Chick;
import main.java.company.model.Chicken;
import main.java.company.model.Cock;
import main.java.company.model.Hen;
import main.java.company.tools.SetChicken;

public class BuyChicken {

    public static void main(String[] args) {
        int wayNumer = 1;
        int sumNumber = 100;
        int sumPrice = 100;
        int k ;
        Chicken cock = new Cock("公鸡");
        Chicken hen = new Hen("母鸡");
        Chicken chick = new Chick("小鸡");
        SetChicken.setChickenNumer(cock, sumNumber);
        SetChicken.setChickenNumer(hen, sumNumber);
        SetChicken.setChickenNumer(chick, sumNumber);
        for (int i = 0; i <= SetChicken.getChickenNumber(cock); i++) {
            for (int j = 0; j <= SetChicken.getChickenNumber(hen); j++) {
                k = 100 - i - j;
                if (i > 0 && (SetChicken.getChickenPrice(cock) * i + SetChicken.getChickenPrice(hen) * j + SetChicken.getChickenPrice(chick) * k == sumPrice)) {
                    System.out.print("方法" + wayNumer++ + ":");
                    System.out.println(SetChicken.getChickenName(cock) + ":" + i + "只 " + SetChicken.getChickenName(hen) + ":" + j + "只 " + SetChicken.getChickenName(chick) + ":" + k + "只 ");
                }
            }
        }

    }


}


