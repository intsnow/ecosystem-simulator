import main.java.com.ecosystemsimulator.core.beings.LiveBeing;

import java.util.*;

// Main funcionando para casos de main.java.com.ecosystemsimulator.core.beings.LiveBeing NAO abstrato!

public class Main
{
    public static void main(String[] args)
    {
        int cont = 1;
        List<String> popular_names = Arrays.asList("human","mushroom","ameba","cat","coconut");

        System.out.println("\n Starting Live Beings display...");



        for (String name: popular_names) {
            System.out.printf("\n  Live_Being #%d \n", cont);
            LiveBeing livebeing = new LiveBeing(name);
            cont++;
        }

    }

    public static List<Object> fromName_toType(List<String> popularNames){

        List<Object> beings = new ArrayList<>();

        for (String name: popularNames){



        }

        return beings;
    }

}