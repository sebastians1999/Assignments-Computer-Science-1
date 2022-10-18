

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
    
    int [][]        Matrix = {{1, 3},
                              {2, 5},
                              {4, 7},
                              {6, 9},
                              {8, 10}};
                              


    int Array[] = {1,0,0,0,2,3,4,5,6,7,8};
    
    //diagonalPrint(Matrix);
    System.out.println(allNumsWithin(Array, 9));


    }

    public static int allNumsWithin(int[] A, int k) {
       
        //two base cases
        //would be the smallest possible Array of AllNumsWithin 
        if(A.length<k){
            return 0;
        }
       
        
        //checking whether all numbers are there  //contains
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
                //to iterate through columns
                int c = 0;
                //b counts down from its row 
                //c < M[0].length makes sure to stop early enough (or we could get an error out of bounds)
                for(int b = a; b >= 0 && c < M[0].length ;b--){
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
