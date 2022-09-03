package collections.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(9);
        list.add(1);

        Collections.sort(list);
        System.out.println(list);

    }
}
