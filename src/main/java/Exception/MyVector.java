package Exception;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List {
    Object[] data = null;
    int capacity = 0;
    int size = 0;

    public MyVector(int capacity) {
        if(capacity<0)
            throw new IllegalArgumentException("유효하지 않는 갑십니다. : "+capacity);
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyVector() {
        this(10);
    }

    public void ensureCapacity(int minCapacity) {
        if(minCapacity - data.length >0)
            setCapacity(minCapacity);
    }

    public int capacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        if(this.capacity==capacity) return;
        Object[] tmp = new Object[capacity];
        System.arraycopy(data,0,tmp,0,size);
        data = tmp;
        this.capacity = capacity;
    }

    public void trimToSize() {
        setCapacity(size);
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        ensureCapacity(size+1);
        data[size++] = o;
        return true;
    }

    @Override
    public boolean remove(Object obj) {
        for(int i=0; i<size; i++) {
            if(obj.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        for(int i=0; i<size; i++)
            data[i] = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        Object oldObj = null;
        if(index<0 || index>=size)
            throw new IndexOutOfBoundsException("범위 초과!");
        oldObj = data[index];
        if(index!=size-1)
            System.arraycopy(data,index+1,data,index,size-index-1);
        data[size-1] = null;
        size--;
        return oldObj;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}