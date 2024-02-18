package homework15From14022024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.remove(2);
        Collections.sort(list);
        System.out.println(list.get(0)*list.size());
    }
}
