package FactoryPattern.Pizza;

import FactoryPattern.Model.*;
import FactoryPattern.Model.NYStyle.NYStyleCheesePizza;
import FactoryPattern.Model.NYStyle.NYStyleClamPizza;
import FactoryPattern.Model.NYStyle.NYStylePepperoniPizza;
import FactoryPattern.Model.NYStyle.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String item) {
        if(item.equals("cheese"))
            return new NYStyleCheesePizza();
        else if(item.equals("veggie"))
            return new NYStyleVeggiePizza();
        else if(item.equals("clam"))
            return new NYStyleClamPizza();
        else if(item.equals("pepperoni"))
            return new NYStylePepperoniPizza();
        else
            return null;
    }
}
