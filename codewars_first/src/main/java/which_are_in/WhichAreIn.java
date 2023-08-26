package which_are_in;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class WhichAreIn {

    public static void main(String[] args) {

        String[] array1 = {"tarp", "mice", "bull"};
        String[] array2 = {"lively", "alive", "harp", "sharp", "armstrong"};

        String[] result = inArray(array1, array2);
        System.out.println(Arrays.toString(result));


    }

    public static String[] inArray(String[] array1, String[] array2) {


        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(array1));
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(array2));
        ArrayList<String> resultArray = new ArrayList<>();

        for (String s : arrayList1) {
            for (String s1 : arrayList2) {
                if (s1.contains(s)) {
                    resultArray.add(s);
                    break;
                }
            }

        }
        resultArray.sort(Comparator.naturalOrder());
        return resultArray.toArray(new String[0]);

    }

}
/*
https://www.codewars.com/kata/550554fd08b86f84fe000a58

Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.

Example 1:
a1 = ["arp", "live", "strong"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns ["arp", "live", "strong"]

Example 2:
a1 = ["tarp", "mice", "bull"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns []

Notes:
Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
Beware: In some languages r must be without duplicates.
ARRAYSLISTSSTRINGSREFACTORING
 */
