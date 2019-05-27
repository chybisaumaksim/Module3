import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        ArrayWorker arrayWorker = new ArrayWorker();
        arrayWorker.initializeArray();
        ArrayList list = new ArrayList();
        list.iterator();
        list.clear();
        list.spliterator();
        list.removeAll(list);
        Object t[] = new Object[2];
        System.out.println(list.toArray(t));
//        System.out.println(arrayWorker.contains(5));
////        System.out.println(arrayWorker.iterator());
////        System.out.println(arrayWorker.iterator());
//        System.out.println(Arrays.toString(arrayWorker.toArray()));
//        arrayWorker.add(5);
    }
}
