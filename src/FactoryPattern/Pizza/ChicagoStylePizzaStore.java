package FactoryPattern.Pizza;

import FactoryPattern.Model.*;
import FactoryPattern.Model.Chicago.ChicagoStyleCheesePizza;
import FactoryPattern.Model.Chicago.ChicagoStyleClamPizza;
import FactoryPattern.Model.Chicago.ChicagoStylePepperoniPizza;
import FactoryPattern.Model.Chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String item) {
        if(item.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        else if(item.equals("veggie"))
            return new ChicagoStyleVeggiePizza();
        else if(item.equals("clam"))
            return new ChicagoStyleClamPizza();
        else if(item.equals("pepperoni"))
            return new ChicagoStylePepperoniPizza();
        else
            return null;
    }
}
