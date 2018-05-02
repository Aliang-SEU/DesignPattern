package FactoryPattern.Model;

import java.util.ArrayList;

/**
 * 披萨基准类
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    public Pizza(){
        this.name = "普通披萨";
    }

    public void prepare(){
        System.out.println("Prepare" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for(int i = 0; i < toppings.size(); i++){
            System.out.println("  " + toppings.get(i));
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza on offical PizzaStore box");
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
