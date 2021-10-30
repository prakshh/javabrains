package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain1 {
    public static void main(String[] args) {

        //create a list and filter all even numbers from the list

        // different ways to create a list

        // 1. List.of - an unmodifiable list
        List<Integer> list1 = List.of(2,4,50,21,22,67);
        // list1.add(45);                                // cannot add any element as it is unmodifiable list
        System.out.println("list1 : " + list1);

        // ArrayList - traditional way of creating list
        List<Integer> list2 = new ArrayList<>();
        list2.add(92);
        list2.add(29);
        list2.add(86);
        list2.add(22);
        list2.add(77);
        list2.add(83);
        System.out.println("list2 : " + list2);

        // 3. Array.asList - another unmodifiable list
        List<Integer> list3 = Arrays.asList(122, 334, 987, 657, 101, 100);
        // list3.add(879);  // cannot add any element as it is also unmodifiable list
        System.out.println("list3 : " + list3);

        // filter out the even numbers from the list 1

        // without stream - traditional method using ArrayList and for-each
        List<Integer> list1Even = new ArrayList<>();
        for(Integer i : list1){
            if(i%2 == 0) {
                list1Even.add(i);
            }
        }
        System.out.println("Even numbers of list1 using ArrayList : " + list1Even);

        // using Stream
//        Stream<Integer> stream= list1.stream();
//        List<Integer> streamList1Even = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(streamList1Even);
        List<Integer> streamList1Even = list1.stream().filter(j -> j % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers of list1 using Stream : " + streamList1Even);
        System.out.println("Even numbers of list2 using Stream : " + list2.stream().filter(j -> j % 2 == 0).collect(Collectors.toList()));
        System.out.println("Even numbers of list3 using Stream : " + list3.stream().filter(j -> j % 2 == 0).collect(Collectors.toList()));

        //filter out numbers greater than 50 from list1
        System.out.println("Numbers greater than 50 in list1 using Stream : " + list1.stream().filter(k -> k > 50).collect(Collectors.toList()));
        System.out.println("Numbers greater than 50 in list2 using Stream : " + list2.stream().filter(k -> k > 50).collect(Collectors.toList()));
        System.out.println("Numbers greater than 50 in list3 using Stream : " + list3.stream().filter(k -> k > 50).collect(Collectors.toList()));


    }
}

/*
output:

list1 : [2, 4, 50, 21, 22, 67]
list2 : [92, 29, 86, 22, 77, 83]
list3 : [122, 334, 987, 657, 101, 100]
Even numbers of list1 using ArrayList : [2, 4, 50, 22]
Even numbers of list1 using Stream : [2, 4, 50, 22]
Even numbers of list2 using Stream : [92, 86, 22]
Even numbers of list3 using Stream : [122, 334, 100]
Numbers greater than 50 in list1 using Stream : [67]
Numbers greater than 50 in list2 using Stream : [92, 86, 77, 83]
Numbers greater than 50 in list3 using Stream : [122, 334, 987, 657, 101, 100]

 */