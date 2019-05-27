import java.util.*;

public class ArrayWorker implements Collection {

    private static final int STRINGS_NUMBER = (int) (Math.random() * 10) + 1;
    private static final int ROWS_NUMBER = (int) (Math.random() * 10) + 1;

    private int array[][];

    public ArrayWorker() {
        this.array = new int[STRINGS_NUMBER][ROWS_NUMBER];
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    int[][] initializeArray() {
        for (int i = 0; i < STRINGS_NUMBER; i++) {
            for (int j = 0; j < ROWS_NUMBER; j++) {
                array[i][j] = (int) (Math.random() * 10);
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
                if ((array[i][j] == (int) o)) {
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
                array[i][j] = 0;
            }
        }
    }


    @Override
    public Spliterator spliterator() {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < STRINGS_NUMBER; i++) {
            for (int j = 0; j < ROWS_NUMBER; j++) {
                sb.append(array[i][j] + "\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
