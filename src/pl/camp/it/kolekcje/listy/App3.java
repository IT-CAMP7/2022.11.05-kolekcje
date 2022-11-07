package pl.camp.it.kolekcje.listy;

import java.util.ArrayList;
import java.util.Collections;

public class App3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(4);
        lista.add(0);
        lista.add(10);
        lista.add(3);

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3"));
        cars.add(new Car("Audi", "A5"));
        cars.add(new Car("Toyota", "Corolla"));

        System.out.println(cars);

        //Collections.sort(cars);
    }
}
