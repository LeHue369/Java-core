package collection_stream;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) throws IOException {
        //1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();
        // result: 123456789

        //2. Integer stream with skip
        IntStream
                .range(1, 10)
                .skip(5)// skip from 1 to 5
                .forEach(x -> System.out.print(x));
        System.out.println();
        // result: 6789

        //3. Integer stream with sum
        System.out.println(
                IntStream
                        .range(1, 5)// the sum of 1 to 4 = 10
                        .sum()
        );
        System.out.println();

        //4. Stream.of, sorted and findFirst
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //5. Stream from Array, sort, filter and print
        String[] names = {"AL", "Ankit", "Kushal", "Brent", "Sarika"
        , "amanda", "Hans", "Stella"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        //6. Average of squares of an int array
        System.out.println("Average of squares of an int array");
        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);

        //7. Stream from List, filter and print
        List<String> people = Arrays.asList("AL", "Ankit", "Kushal", "Brent", "Sarika"
                        , "amanda", "Hans", "Shivika");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

        //8. Stream rows from text file, sort, filter, and print
        Stream<String> bands = Files.lines(Paths.get("C:\\Users\\Hue Le Thi\\IdeaProjects\\Java_core_NCC\\src\\main\\java\\collection_stream\\bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();

        // 9. Stream rows from text file and save to List
        List<String> bands2 =  Files.lines(Paths.get("C:\\Users\\Hue Le Thi\\IdeaProjects\\Java_core_NCC\\src\\main\\java\\collection_stream\\bands.txt"))
                .filter(x -> x.contains("old"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println("+" + x));

        // 10. Stream rows from file and count
        Stream<String> rows1 = Files.lines(Paths.get("C:\\Users\\Hue Le Thi\\IdeaProjects\\Java_core_NCC\\src\\main\\java\\collection_stream\\data.txt"));
        int rowCount = (int)rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();

        // 11. Stream rows from file, parse data from rows
        Stream<String> rows2 =  Files.lines(Paths.get("C:\\Users\\Hue Le Thi\\IdeaProjects\\Java_core_NCC\\src\\main\\java\\collection_stream\\data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0]+" "+x[1]+" "+ x[2]));
        rows2.close();

        //12. Stream rows from file, store fields in HashMap
        Stream<String> row3 =  Files.lines(Paths.get("C:\\Users\\Hue Le Thi\\IdeaProjects\\Java_core_NCC\\src\\main\\java\\collection_stream\\data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = row3
                .map(x -> x.split(" "))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
        row3.close();
        for (String key: map.keySet()){
            System.out.println("row is " + key + " " + map.get(key));
        }

        //13. Reduction - sum
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);// 0.0 is the start value
        System.out.println("Total = " + total);

        // 14. Reduction - summary statistics
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary);

    }
}
