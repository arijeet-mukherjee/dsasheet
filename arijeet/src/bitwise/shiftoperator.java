/**
 * The left-shift and right-shift operators are equivalent to multiplication and division by 2 respectively.
 * Eg. 12 << 3 ======> 12*(2^3) = 96
 * Eg 16 >> 4 =======> 16 /(2^4) = 1
 * 
 * one left shift is just double of number eg: 2 << 1 ======> 4
 * one right shift is just half of number eg: 2 >> 1 ======> 1
 * 
 * The & operator can be used to quickly check if a number is odd or even. The value of expression (x & 1) would be non-zero only if x is odd, otherwise the value would be zero.
 */
package bitwise;
import java.util.*;
public class shiftoperator {
    static ArrayList<Integer> binary(int n , ArrayList<Integer> res){
        if (n == 0) {
            return res;
        }
        else{
            int temp = n % 2;
            res.add(temp);
            n = n /2 ;
            binary(n, res);
            return res;
        }
    }

    static int power(int x, int y) {
        // Initialize result
        int res = 1;

        while (y > 0) {
            // If y is odd,
            // multiply
            // x with result
            if ((y & 1) == 1)
                res = res * x;

            // y must be even now
            y = y >> 1; // y = y/2
            x = x * x; // Change x to x^2
        }
        return res;
    }
    
    static int leftShift(int n , int totalbitshift){
        return n*power(2,totalbitshift);
    }

    static int rightShift(int n, int totalbitshift) {
        return n / power(2, totalbitshift);
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = binary(12, new ArrayList<>());
        Collections.reverse(result);
        System.out.println(result);
        System.out.println(leftShift(8, 2));
        System.out.println(rightShift(16, 4));
    }
}
