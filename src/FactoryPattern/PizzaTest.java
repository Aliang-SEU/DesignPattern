package FactoryPattern;

import FactoryPattern.Model.Pizza;
import FactoryPattern.Pizza.ChicagoStylePizzaStore;
import FactoryPattern.Pizza.NYStylePizzaStore;
import FactoryPattern.Pizza.PizzaStore;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");

    }
}
