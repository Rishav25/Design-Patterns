import basepizza.*;
import topping.*;

class Main {
    public static void main(String[] args){
        
        BasePizzaAbstract pizza1 = new BasePizzaChickenSausage();
        pizza1 = new ToppingBarbequeChicken(pizza1);
        pizza1 = new ToppingExtraCheese(pizza1);

        System.out.println("Cost of Pizza 1 : " + pizza1.cost());

        BasePizzaAbstract pizza2 = new BasePizzaMargherita();
        pizza2 = new ToppingMushroom(pizza2);
        pizza2 = new ToppingExtraCheese(pizza2);

        System.out.println("Cost of Pizza 2 : " + pizza2.cost());
        
    }
}
