package pl.camp.it.kolekcje.zbiory;

import pl.camp.it.kolekcje.listy.Car;

import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Janusz");
        set.add("Artur");
        set.add("Zbyszek");
        set.add("Ireneusz");

        System.out.println(set);

        for(String s : set) {
            System.out.println(s);
        }

        set.remove("Artur");

        System.out.println(set);

        set.add("Janusz");

        System.out.println(set);

        System.out.println(set.contains("Janusz"));

        TreeSet<Car> set1 = new TreeSet<>();
        set1.add(new Car("BMW", "3"));
        set1.add(new Car("Audi", "A3"));

        System.out.println(set1);
    }
}
