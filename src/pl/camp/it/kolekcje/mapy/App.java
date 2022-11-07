package pl.camp.it.kolekcje.mapy;

import pl.camp.it.kolekcje.listy.Car;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(5, "piatka");
        mapa.put(9, "dziewiatka");

        String v1 = mapa.get(5);
        System.out.println(v1);

        Map<String, String> mapa2 = new HashMap<>();

        mapa2.put("klucz1", "wartosc1");
        mapa2.put("klucz2", "wartosc2");

        System.out.println(mapa2.get("klucz2"));

        mapa2.putIfAbsent("klucz2", "jakas inna wartosc !!");

        System.out.println(mapa2.get("klucz2"));

        mapa2.replace("klucz2", "wartosc2", "nowa wartosc");

        System.out.println(mapa2.size());

        Set<String> klucze = mapa2.keySet();

        for(String klucz : klucze) {
            System.out.println(klucz);
        }

        Collection<String> wartosci = mapa2.values();

        for(String wartosc : wartosci) {
            System.out.println(wartosc);
        }

        Set<Map.Entry<String, String>> pary = mapa2.entrySet();
        for(Map.Entry<String, String> para : pary) {
            System.out.println("Klucz: " + para.getKey() + " wartosc: " + para.getValue());
        }


        Map<String, Car> carMap = new HashMap<>();

        carMap.put("KR11", new Car("BMW", "3", "KR11"));
        carMap.put("KR22", new Car("BMW", "5", "KR22"));
        carMap.put("KR33", new Car("BMW", "7", "KR33"));

        Car car = carMap.get("KR33");
        System.out.println(car);

        Map<String, String> properties = new HashMap<>();
        properties.put("db.ip", "123.123.123.123");
        properties.put("app1.ip", "234.234.234.234");

        System.out.println(properties.get("app1.ip"));
    }
}
