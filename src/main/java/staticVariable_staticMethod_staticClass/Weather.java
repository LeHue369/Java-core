package staticVariable_staticMethod_staticClass;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    public String name;
    public static int count;
    public int count2;
    public static List<String> listWeather = new ArrayList<>();

    public Weather() {
    }

    public Weather(String name) {
        this.name = name;
        count++;
        count2++;
    }
    static{
        listWeather.add("Cloudy");
        listWeather.add("Rainy");
        listWeather.add("Sunny");
        System.out.println("first");
    }

    public static void main(String[] args) {
        System.out.println("second");
    }
}
