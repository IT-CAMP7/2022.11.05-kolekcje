package pl.camp.it.kolekcje.listy;

import java.util.ArrayList;
import java.util.LinkedList;

public class App2 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add("ABC");
        list.add(true);
        list.add(34.4);

        System.out.println(list);

        Integer i = 5;
        Boolean b = true;
        Double d = 34.3;

        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        list2D.add(new ArrayList<>(){{add(3);add(4);add(5);}});

        System.out.println(list2D);

        list2D.add(new ArrayList<>(){{add(234);add(5346);add(2345);add(234);add(23423);}});

        System.out.println(list2D);

        System.out.println(list2D.get(1).get(2));

        ArrayList<ArrayList<ArrayList<Integer>>> lists = new ArrayList<>();
    }
}
