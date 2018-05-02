package FactoryPattern.Pizza;

import FactoryPattern.Model.Pizza;

public abstract class PizzaStore {

    /**
     * 获得一个Pizza
     * @param item
     * @return
     */
    public abstract Pizza createPizza(String item);

    /**
     * 订购Pizza
     * @param item
     * @return
     */
    public Pizza orderPizza(String item){
        Pizza pizza;
        pizza = createPizza(item);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
