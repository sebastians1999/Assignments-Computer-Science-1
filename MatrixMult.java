public class MatrixMult {



    public static void main(String[] args) {

        double [][] firstMatrix = {{3, 4, 2}};
        double [][] secondtMatrix = {{13.0, 9.0, 7.0, 15.0},
                                     {8.0, 7.0, 4.0, 6.0},
                                     {6.0, 4.0, 0.0, 3.0}};
        double [][] product;

       
        product = multiplyMatrices(firstMatrix,secondtMatrix);
        if(product!=null){
            for(int r=0; r < product.length; r++){
                for(int b=0; b < product[r].length; b++){  
                   System.out.println(product[r][b]);
                }
            }
        }
    }

    public static double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
        if(firstMatrix[0].length!=secondMatrix.length){       //checking wether width and height are the same
            System.out.println("The width of the first Matrix is not equal to the hight of the second Matrix!");
            return null;
        }
        else{
        double [][] product = new double[firstMatrix.length][secondMatrix[0].length];
         
         for(int r=0; r < firstMatrix.length; r++){
                for(int b=0; b < secondMatrix[0].length; b++){                     
                    for(int c=0; c < secondMatrix.length; c++){                   
                       product[r][b]+=firstMatrix[r][c]*secondMatrix[c][b];                 
                    }
                }
         }
        return product;
        }
    }
}