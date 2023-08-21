package Directions_Reduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DirReduction {

    public static void main(String[] args) {

        String[] arr = {"NORTH", "WEST", "SOUTH", "EAST"};
        System.out.println("dirReduc(arr) = " + Arrays.toString(dirReduc(arr)));
    }

    public static String[] dirReduc(String[] arr) {

/*      this is an interesting solution. I must analyze this later.


        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);*/

//        Map<String,Integer> map = new HashMap<>();
//        ArrayList<String> arr2 = new ArrayList<>();
//
//        for (String s : arr) {
//            if(!map.containsKey(s)){
//                map.put(s,1);
//            }
//            else{
//                map.put(s,map.get(s)+1);
//            }
//        }
//
//        for (String s : arr) {
//            arr2.add(s);
//        }
//
//        if(map.get("SOUTH") >= map.get("NORTH")){
//            for (int i = 0; i < map.get("NORTH"); i++) {
//                arr2.remove("NORTH");
//                arr2.remove("SOUTH");
//            }
//
//        }else {
//            for (int i = 0; i < map.get("SOUTH"); i++) {
//                arr2.remove("NORTH");
//                arr2.remove("SOUTH");
//            }
//        }
//
//        if(map.get("EAST") >= map.get("WEST")){
//            for (int i = 0; i < map.get("WEST"); i++) {
//                arr2.remove("WEST");
//                arr2.remove("EAST");
//            }
//
//        }else {
//            for (int i = 0; i < map.get("EAST"); i++) {
//                arr2.remove("EAST");
//                arr2.remove("WEST");
//            }
//        }
//        return arr2.toArray(new String[arr2.size()]);





        ArrayList<String> arr2 = new ArrayList<>();
        for (String s : arr) {
            arr2.add(s);
        }
        boolean check = true;
        int count = 0;
        while (check) {
            for (int i = 0; i < arr2.size()-1; i++) {
                if ((arr2.get(i).equals("NORTH") && arr2.get(i + 1).equals("SOUTH")) ||
                        (arr2.get(i).equals("SOUTH") && arr2.get(i + 1).equals("NORTH")) ||
                        (arr2.get(i).equals("WEST") && arr2.get(i + 1).equals("EAST")) ||
                        (arr2.get(i).equals("EAST") && arr2.get(i + 1).equals("WEST")) ) {
                    arr2.set(i,"");
                    arr2.set(i+1,"");
                    count++;
                }
            }
            arr2.removeIf(e -> e.equals(""));
            if(count == 0){
                check = false;
            }else{
                count = 0;
            }
        }
        return arr2.toArray(new String[arr2.size()]);
    }
}
/*
https://www.codewars.com/kata/550f22f4d758534c1100025a

Once upon a time, on a way through the old wild mountainous west,…
… a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too.

Going to one direction and coming back the opposite direction right away is a needless effort. Since this is the wild west, with dreadful weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst!

How I crossed a mountainous desert the smart way.
The directions given to the man are, for example, the following (depending on the language):

["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"].
or
{ "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
or
[North, South, South, East, West, North, West]
You can immediately see that going "NORTH" and immediately "SOUTH" is not reasonable, better stay to the same place! So the task is to give to the man a simplified version of the plan. A better plan in this case is simply:

["WEST"]
or
{ "WEST" }
or
[West]
Other examples:
In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming back right away.

The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other, therefore, the final result is [] (nil in Clojure).

In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they become directly opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].

Task
Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).

The Haskell version takes a list of directions with data Direction = North | East | West | South.
The Clojure version returns nil when the path is reduced to nothing.
The Rust version takes a slice of enum Direction {North, East, West, South}.
See more examples in "Sample Tests:"
Notes
Not all paths can be made simpler. The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible. "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST" are not directly opposite of each other and can't become such. Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
if you want to translate, please ask before translating.
FUNDAMENTALS
 */
