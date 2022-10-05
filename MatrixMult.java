







public class MatrixMult {



    public static void main(String[] args) {

        double [][] firstMatrix = {{3, 4, 2}};                  //Test Matrixes
        double [][] secondtMatrix = {{13.0, 9.0, 7.0, 15.0},
                                     {8.0, 7.0, 4.0, 6.0},
                                     {6.0, 4.0, 0.0, 3.0}};
        double [][] product;

       
        product = multiplyMatrices(firstMatrix,secondtMatrix);   //testing the method and printing out the array of products to see if it worked
        if(product!=null){
            for(int r=0; r < product.length; r++){
                for(int b=0; b < product[r].length; b++){  
                   System.out.println(product[r][b]);
                }
            }
        }
    }

    public static double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
        if(firstMatrix[0].length!=secondMatrix.length){         //checking wether width and height are the same
            System.out.println("The width of the first Matrix is not equal to the hight of the second Matrix!");
            return null;                                        // if Matrixes don't meet the standards it returns null to stop the method
        }
        else{
        double [][] product = new double[firstMatrix.length][secondMatrix[0].length];           //creating an array with the right length and heigth for the product of the two Matrixes
         
         for(int r=0; r < firstMatrix.length; r++){                                           //runs the rows of Matrix A and the product (storage for product)
                for(int b=0; b < secondMatrix[0].length; b++){                              //runs the columns of Matrix B and product                 
                    for(int c=0; c < secondMatrix.length; c++){                             //for itterating through every value of the columns or rows        
                       product[r][b]+=firstMatrix[r][c]*secondMatrix[c][b];                 
                    }
                }
         }
        return product;
        }
    }
}