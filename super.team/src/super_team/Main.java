package super_team;

import com.google.gson.GsonBuilder;

import java.util.Arrays;

public class Main {
    public static final GsonBuilder GSON_BUILDER = new GsonBuilder();


    public static void main(String[] args) {
        Drivers [] drivers = {
                Drivers.makeDrivers(1,"Jake","Volvo"),
                Drivers.makeDrivers(1,"Tom","Renault"),
                Drivers.makeDrivers(1,"Kim","DAF XT")
        };
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
        Arrays.stream(drivers).filter(x ->x.getId() == 1).forEach(System.out::println);
        Arrays.stream(drivers).filter(x ->x.getId() == 2).forEach(System.out::println);
        Arrays.stream(drivers).filter(x ->x.getId() == 3).forEach(System.out::println);
    }
    }
