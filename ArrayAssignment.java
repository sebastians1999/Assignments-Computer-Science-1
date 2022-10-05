

import java.math.*;

public class ArrayAssignment{



    public static void main(String[] args){

    int [][] secondtMatrix = {{1, 3, 6, 10, 14},
                              {2, 5, 9, 13, 17},
                              {4, 8, 12, 16, 19},
                              {7, 11, 15, 18, 20}};
    
    int [][]        Matrix = {{1, 3, 5, 7, 9},
                              {2, 4, 6, 8, 10}};
                              



    
    diagonalPrint(Matrix);
    }

    public static int allNumsWithin(int[] A, int k) {
        return 0;
    }
    public static void diagonalPrint(int[][] M) {
        for(int a = 0; a < M.length; a++){
            for(int b = 0; b <= a;b++){  // a = 1
                System.out.println(M[Math.abs(a-b)][b]);
            }
        }
        int i = M.length;
        
        for(int c = 1; c <= M[0].length; c++){
            for(int d = c; d < M[0].length; d++){
                //System.out.println(M[Math.abs(i-d)][d]);
            }
            i++;
         }

    }
}
