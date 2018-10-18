package chapter_9;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position += 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size() > position;
    }
}
