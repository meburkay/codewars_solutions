package sum_of_digits_digital_root;

public class DRoot {

    public static void main(String[] args) {

        System.out.println("digital_root(5) = " + digital_root(55));

    }
    public static int digital_root(int n) {
        // ...

        while(n>=10){
            int sum = 0;
            while(n>=10){
                sum += n%10;//sum = 6 + 5 =11       //sum 3
                n /=10;     //n = 25  ->2           // n 1
            }

            sum += n; //sum =13          // sum 4
            n = sum;  //n =13             // n 4
        }

        return n;
    }
}
/*
https://www.codewars.com/kata/541c8630095125aba6000c00

DESCRIPTION:
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

MATHEMATICS ALGORITHMS
 */
