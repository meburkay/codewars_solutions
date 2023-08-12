package list_filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static void main(String[] args) {

        List<Object> objectList = new ArrayList<>(List.of(1, 2, "a", "b"));

        System.out.println("filterList(objectList) = " + filterList(objectList));

    }

    public static List<Object> filterList(final List<Object> list) {

//        return list.stream()
//                .filter(object -> !(object instanceof String))
//                .collect(Collectors.toList());
        List<Object> result = new ArrayList<>();
        for (Object o : list) {
            if(!(o instanceof String)){
                result.add(o);
            }
        }
        return result;
    }
}

/*
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

Example
Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)
LISTS FILTERING  DATA STRUCTURES  FUNDAMENTALS
 */