package make_the_dead_fish_swim;

import java.util.ArrayList;
import java.util.Arrays;

public class DeadFish {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(parse("iiisdoso")));
    }


    public static int[] parse(String data) {
        String[] split = data.split("");

        int count = 0;
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {

            switch(split[i]){
                case "i":
                    count++;
                    break;
                case "d":
                    count--;
                    break;
                case "s":
                    count *= count;
                    break;
                case "o":
                    resultList.add(count);
                    break;
            }

        }
        int[] resultArray = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}
/*
https://www.codewars.com/kata/51e0007c1f9378fa810002a9

Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.

Deadfish.parse("iiisdoso") =- new int[] {8, 64};
 */
