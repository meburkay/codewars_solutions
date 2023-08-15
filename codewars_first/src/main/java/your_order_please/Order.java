package your_order_please;

import java.util.ArrayList;
import java.util.List;

//There are good solutions for this problem. Mine is too long. I can look later for the solutions of this problem.
public class Order {

    public static void main(String[] args) {

        System.out.println("order(\"hd4 ac2 yz3 de1\") = " + order("hd4 ac2 yz3 de1"));
    }

    public static String order(String words) {

        String[] strings = words.split(" "); //[ksjdfl,klsdjkfls,lkjsdf]

        if(words.isEmpty()){
            return "";
        }
        else{
            List<Integer> list = new ArrayList<>(); // [3,2,5,4,1]

            for (String word : strings) {
                String[] chars = word.split("");


                for (String aChar : chars) {
                    boolean bool = false;
                    int number = 0;
                    try {
                        number = Integer.parseInt(aChar);
                        bool = true;
                    } catch (NumberFormatException ignored) {
                    }

                    if (bool) {
                        list.add(number);
                        break;
                    }
                }
            }

            String[] resultArray = new String[strings.length];

            for (int i = 0; i < strings.length; i++) {
                resultArray[list.get(i) - 1] = strings[i];
            }
            String result = "";
            for (String s : resultArray) {
                result += " " + s;
            }


            return result.trim();
        }


    }
}

/*
https://www.codewars.com/kata/55c45be3b2079eccff00010f

Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
STRINGSFUNDAMENTALS
 */
