package Collection;

import java.util.Iterator;

public class MyVector2 extends MyVector implements Iterator {
    int cursor = 0;
    int lastRet = -1;

    public MyVector2(int capacity) {
        super(capacity);
    }

    public MyVector2() {
        this(10);
    }
    public Iterator iterator() {
        cursor = 0;
        lastRet = -1;
        return this;
    }

    @Override
    public boolean hasNext() {
        return cursor != size();
    }

    @Override
    public Object next() {
        Object next = get(cursor);
        lastRet = cursor++;
        return next;
    }
}
