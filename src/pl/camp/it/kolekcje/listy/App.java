package pl.camp.it.kolekcje.listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        System.out.println(lista);
        System.out.println(lista.size());

        lista.add("ABC");
        lista.add("COS");

        System.out.println(lista);
        System.out.println(lista.size());

        System.out.println(lista.get(0));

        lista.remove(0);

        System.out.println(lista);
        System.out.println(lista.size());

        System.out.println(lista.get(0));


        lista.set(0, "ASDF");

        System.out.println(lista);

        //lista.ensureCapacity(1000);

        lista.add("ASDF");

        Integer[] tab = {1,2,3,4,5};
        List list = Arrays.asList(tab);
        System.out.println(list);

        ArrayList lista2 = new ArrayList();
        lista2.addAll(list);
        System.out.println(lista2);

        lista2.add(6);

        System.out.println(lista2);

        ArrayList lista3 = new ArrayList(Arrays.asList(tab));
        lista3.add(6);
        System.out.println(lista3);
    }
}
