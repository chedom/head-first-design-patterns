package chapter_7;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumeratorIterator implements Iterator {
    Enumeration enumeration;

    public EnumeratorIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
