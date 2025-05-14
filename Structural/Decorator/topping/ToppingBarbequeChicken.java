package topping;

import basepizza.BasePizzaAbstract;

public class ToppingBarbequeChicken extends BasePizzaAbstract{
    
    BasePizzaAbstract pizza;

    // this is used to assign the topping to a BasePizza
    public ToppingBarbequeChicken(BasePizzaAbstract pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return this.pizza.cost() + 75;
    }

}
