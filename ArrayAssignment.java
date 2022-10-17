

import java.math.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayAssignment{



    public static void main(String[] args){

    int [][] secondtMatrix = {{1, 3, 6, 10, 14},
                              {2, 5, 9, 13, 17},
                              {4, 8, 12, 16, 19},
                              {7, 11, 15, 18, 20}};
    
    int [][]        Matrix = {{1, 3, 5, 7, 9},
                              {2, 4, 6, 8, 10}};
                              


    int Array[] = {0,2,0,2,0,2,2,1,1,0};
    
    //diagonalPrint(Matrix);
    System.out.println(allNumsWithin(Array, 3));


    }

    public static int allNumsWithin(int[] A, int k) {
       
        //two base cases
        //would be the smallest possible AllNumsWithin List
        if(A.length<k){
            return A.length;
        }   
        
        //checking whether all numbers are there
        boolean[] check = new boolean[k];
        for(int a = 0; a < A.length;a++){
            check[A[a]]=true;
        }

        

        //if not we return 0
        for( int a = 0; a < check.length; a++){
            if(check[a]==false){
                return 0;
            }
        }
        
        //creating new arrays with new boundaries
        int[] TestLeftSideArray = new int[A.length-1];
        int[] TestRightSideArray = new int[A.length-1];
        //copying arrays 
       System.arraycopy(A,0, TestLeftSideArray, 0, A.length-1);
       System.arraycopy(A, 1, TestRightSideArray, 0, A.length-1);
        

        //recursion
        int l = allNumsWithin(TestLeftSideArray, k);
        int r = allNumsWithin(TestRightSideArray, k);

        if(l==0 && r==0){
            return A.length;
        }
        else if(l== 0){
            return r;
        }
        else if (r== 0){
            return l;
        }
        //needed since one side could be smaller
        else{
            return Math.min(l,r);
        }
    }


    public static void diagonalPrint(int[][] M) {
        
            for(int a = 0; a < M.length; a++){
                int c = 0;
                for(int b = a; b >= 0;b--){
                    System.out.print(" "+ M[b][c]);
                    c++;
                }
                }
            for(int c = 1; c <= M[0].length-1; c++){
              int a = c;
              int b = M.length-1;

               while(a<=M[0].length-1 && b >= 0){
                   System.out.print(" "+ M[b][a]);
                  a++;
                 b--;
              }
            }   
    }
}
