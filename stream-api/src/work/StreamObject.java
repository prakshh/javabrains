package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        // Stream api can be used to process Collections
        //                           process group of objects
        // below are different ways to do this

        // 1. blank
        Stream<Object> emptyStream = Stream.empty();
        String names1[] = {"John", "Keanu", "Reeves"};
        Stream<String> stream1 = Stream.of(names1);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        // 2. array, object, collection

        String  names2[] = {"Wolverine", "Hugh", "Jackman"};
        Stream<String> stream2 = Stream.of(names2);
        stream2.forEach( e -> {
            System.out.println(e);
        });
        
        String names3[] = {"Salt", "Angelina", "Jolie"};
        Stream<String> stream3 = Stream.of(names3);
        stream3.forEach(e->{
            System.out.println(e);
        });

        Stream.of(new String[]{"Naruto", "Sasuke", "Sakura"}).forEach(e-> System.out.println(e));

        // builder
        Stream<Object> streamBuilder = Stream.builder().build();

        // Arrays.stream()
        IntStream intstream = Arrays.stream(new int[]{10, 87, 22, 98, 83});
        intstream.forEach(e-> System.out.println(e));

        // using objects of List, set
        List<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(77);
        list2.add(86);
        list2.add(25);
//        System.out.println(list2);
        Stream<Integer> list2Stream = list2.stream();
        list2Stream.forEach(e-> System.out.println(e));


    }
}
