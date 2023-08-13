package complementary_dna;

import java.util.Arrays;

public class DnaStrand {

    public static void main(String[] args) {


        System.out.println("makeComplement(\"ATCGGCATAT\") = " + makeComplement("ATCGGCATAT"));
    }

    public static String makeComplement(String dna) {

        String[] strings = dna.split("");
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals("A")){
                strings[i] = "T";
            }
            else if(strings[i].equals("T")){
                strings[i] = "A";
            }
            else if(strings[i].equals("C")){
                strings[i] = "G";
            }
            else if(strings[i].equals("G")){
                strings[i] = "C";
            }
        }
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            result.append(string);
        }
        return result.toString();
    }
}

/*
https://www.codewars.com/kata/554e4a2f232cdd87d9000038

Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA"
STRINGSFUNDAMENTALS
 */