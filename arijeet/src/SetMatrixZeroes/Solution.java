package SetMatrixZeroes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Set<Integer> zeroRowCount = new HashSet<Integer>();
        Set<Integer> zeroColumnCount = new HashSet<Integer>();

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                int value = matrix[i][j];
                if (value == 0) {
                    zeroRowCount.add(i);
                    zeroColumnCount.add(j);
                }
            }
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (zeroRowCount.contains(i) || zeroColumnCount.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        List<List<Integer>> list = Arrays.stream(matrix)
                .map(internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());
        
        System.out.println(list);
        
    }

    
    public static void main(String[] args) {
        setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
    }
    
}
