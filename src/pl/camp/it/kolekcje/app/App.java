package pl.camp.it.kolekcje.app;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        m1(list);
        m2(list);
        m3(list);
        m4(list);
    }

    public static void m1(List<Integer> l) {
        l.add(1);
        //l.ensureCapacity(100);
    }

    public static void m2(List<Integer> l) {
        l.add(2);
    }

    public static void m3(List<Integer> l) {
        l.add(3);
    }

    public static void m4(List<Integer> l) {
        l.add(4);
    }

}
