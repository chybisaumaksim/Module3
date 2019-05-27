import java.util.*;

public class ArrayWorkerAbstract<T> implements Collection {

    private static final int STRINGS_NUMBER = (int) (Math.random() * 10) + 1;
    private static final int ROWS_NUMBER = (int) (Math.random() * 10) + 1;

    private T array[][];
    private T t;

    public ArrayWorkerAbstract() {
    }

    public T[][] getArray() {
        return array;
    }

    public void setArray(T[][] array) {
        this.array = array;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    T[][] initializeArray() {
        for (int i = 0; i < STRINGS_NUMBER; i++) {
            for (int j = 0; j < ROWS_NUMBER; j++) {
                array[i][j] = t;
            }
        }
        return array;
    }

    @Override
    public int size() {
        return array[0].length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        boolean result = false;
        for (int i = 0; i < STRINGS_NUMBER; i++) {
            for (int j = 0; j < ROWS_NUMBER; j++) {
                if ((array[i][j] == o)) {
                    result = true;
                }
            }
        }
        return result;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public boolean add(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        for (int i = 0; i < STRINGS_NUMBER; i++) {
            for (int j = 0; j < ROWS_NUMBER; j++) {
                array[i][j] = null;
            }
        }
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0][];
    }
}
