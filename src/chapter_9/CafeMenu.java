package chapter_9;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Vegie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99);
        addItem("Sou[ of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
