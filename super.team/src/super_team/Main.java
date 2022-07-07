package super_team;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;

public class Main {
    public static final GsonBuilder GSON_BUILDER = new GsonBuilder();
    public static final Gson GSON = GSON_BUILDER.setPrettyPrinting().create();
    public static void main(String[] args) {
        Lorry [] lorries = {
                Lorry.makeLorry(1,"Volvo", "Jake", State.BASE),
                Lorry.makeLorry(2, "Renault", "Tom", State.BASE),
                Lorry.makeLorry(3, "DAF XT", "Kim", State.BASE)
        };
        String json = GSON.toJson(lorries);

        System.out.println("#  | Bus       | Driver   | State ");
        System.out.println("---|-----------|----------|--------");
        Arrays.stream(lorries).filter(x ->x.getId() == 1).forEach(System.out::println);
        Arrays.stream(lorries).filter(x -> x.getId() == 2).forEach(System.out::println);
        Arrays.stream(lorries).filter(x -> x.getId() == 3).forEach(System.out::println);

        System.out.println(json);
    }
    }
