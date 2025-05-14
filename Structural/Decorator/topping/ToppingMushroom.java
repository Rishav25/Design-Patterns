package topping;

import basepizza.BasePizzaAbstract;

public class ToppingMushroom extends ToppingAbstract{
    
    BasePizzaAbstract pizza;

    // this is used to assign the topping to a BasePizza
    public ToppingMushroom(BasePizzaAbstract pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return this.pizza.cost() + 30;
    }

}
