package staticVariable_staticMethod_staticClass;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Apply static to count the number of something
        //2. Static variables, methods can be accessed directly
        // using class name and don't need any object reference
        Weather weather1 = new Weather("raining");
        Weather weather2 = new Weather("sun showering");
        System.out.println("count2" + weather1.count2);
        System.out.println(Weather.count);//count = 2
        //3. Static blocks
        List<String> list = Weather.listWeather;
        for (String i : list) {
            System.out.println(i);
        }
    }
}
