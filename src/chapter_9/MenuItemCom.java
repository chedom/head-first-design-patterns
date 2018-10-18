package chapter_9;

import java.util.Iterator;

public class MenuItemCom extends MenuComponent  {
    String name;
    String description;
    boolean vegeterian;
    double price;

    public MenuItemCom(String name,
                       String description,
                       boolean vegeterian,
                       double price)
    {
        this.name = name;
        this.description = description;
        this.vegeterian = vegeterian;
        this.price = price;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public void print() {
        System.out.print(" " + getName());
        if (isVegeterian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("   -- " + getDescription());
    }
}
