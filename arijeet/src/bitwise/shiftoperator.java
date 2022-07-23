/**
 * The left-shift and right-shift operators are equivalent to multiplication and division by 2 respectively.
 * Eg. 12 << 3 ======> 12*(2^3) = 96
 * Eg 16 >> 4 =======> 16 /(2^4) = 1
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

    public static void main(String[] args) {
        ArrayList<Integer> result = binary(12, new ArrayList<>());
        Collections.reverse(result);
        System.out.println(result);
    }
}
