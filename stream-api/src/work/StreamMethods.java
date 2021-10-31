package work;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

    public static void main(String[] args) {

        /*
        filter method(predicate)
            - boolean value function
            - e -> e > 10

         map (function)
            - each element operation
         */

        // display names starting with J - filter() method
        List<String> names = List.of("John Wick", "John Carter", "Tom Hardy", "John Cena", "Keanu Reeves");
        List<String> namesWithJ = names.stream().filter(e -> e.startsWith("J")).collect(Collectors.toList());
        System.out.println(namesWithJ);
        // above in one line
        // System.out.println(List.of("John Wick", "John Carter", "Keanu Reeves", "Tom Hardy").stream().filter(e->e.startsWith("J")).collect(Collectors.toList()));

        // display squares of given numbers - map() method
        List<Integer> numList = List.of(15, 20, 10, 5, 11);
        List<Integer> squareNumList = numList.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(squareNumList);
        // above in one line
        // System.out.println(List.of(2, 5, 10, 15, 20).stream().map(j->j*j).collect(Collectors.toList()));

        System.out.println(names);  // display as a list
        names.stream().forEach(e->{
            System.out.println(e);  // display as a stream
        });
        names.stream().forEach(e-> System.out.println(e)); // shortening above code
        names.stream().forEach(System.out::println); // more shortening, replacing Lambda with Method Reference

        // sort the names and numbers in names and numList
        names.stream().sorted().forEach(System.out::println);
        numList.stream().sorted().forEach(System.out::println);

        // min & max value
        Integer minInteger = numList.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("min value in numList : " + minInteger);

        System.out.println("max value in numList : " + numList.stream().max((x,y)->x.compareTo(y))); // returns Optional[20]
        System.out.println("max value in numList : " + numList.stream().max((x,y)->x.compareTo(y)).get()); // returns 20

        System.out.println("max value in numList : " + numList.stream().max(Integer::compareTo).get()); // Method reference

        /*

        [John Wick, John Carter, John Cena]
        [225, 400, 100, 25, 121]
        [John Wick, John Carter, Tom Hardy, John Cena, Keanu Reeves]
        John Wick
        John Carter
        Tom Hardy
        John Cena
        Keanu Reeves
        John Wick
        John Carter
        Tom Hardy
        John Cena
        Keanu Reeves
        John Wick
        John Carter
        Tom Hardy
        John Cena
        Keanu Reeves
        John Carter
        John Cena
        John Wick
        Keanu Reeves
        Tom Hardy
        5
        10
        11
        15
        20
        min value in numList : 5
        max value in numList : Optional[20]
        max value in numList : 20
        max value in numList : 20

        */


    }
}
