package super_team;

import com.google.gson.GsonBuilder;

import java.util.Arrays;

public class Main {
    public static final GsonBuilder GSON_BUILDER = new GsonBuilder();

    public static void main(String[] args) {
        Lorry [] lorries = {
                Lorry.makeLorry(1,"Volvo", "Jake", State.BASE),
                Lorry.makeLorry(2, "Renault", "Tom", State.BASE),
                Lorry.makeLorry(3, "DAF XT", "Kim", State.BASE)
        };
        System.out.println("#  | Bus       | Driver   | State ");
        System.out.println("---|-----------|----------|--------");
        Arrays.stream(lorries).filter(x ->x.getId() == 1).forEach(System.out::println);
        Arrays.stream(lorries).filter(x -> x.getId() == 2).forEach(System.out::println);
        Arrays.stream(lorries).filter(x -> x.getId() == 3).forEach(System.out::println);
        System.out.println("#  | Driver       | Bus");
        System.out.println("---|--------------|---------");
        Arrays.stream(lorries).filter(x ->x.getId() == 1).forEach(Lorry::drivers);
        Arrays.stream(lorries).filter(x ->x.getId() == 2).forEach(Lorry::drivers);
        Arrays.stream(lorries).filter(x ->x.getId() == 3).forEach(Lorry::drivers);   //метод списка водителей
        System.out.printf("");
        Arrays.stream(lorries).filter(x ->x.getId() == 3).forEach(Lorry::changeDriver); // замена водителя и вывод водителя с транспортом
        System.out.printf("");
        Arrays.stream(lorries).filter(x ->x.getId() == 3).forEach(Lorry::startDriving);  // метод вождения имя + транспорт

    }
    }
