public class MatrixMult {
    public static double[][] multiplyMatrices(double[][] firstMatrix, double[][] 
    secondMatrix) {
        if(firstMatrix[0].length!=secondMatrix.length){       //checking wether width and height are the same
            System.out.println("The width of the first Matrix is not equal to the hight of the second Matrix!");
        }
        double [][] product = new double[firstMatrix.length][firstMatrix.length];

        for(int r=0; r < firstMatrix.length; r++){
            for(int c=0; r < secondMatrix[0].length; c++){
                for(int i=0; i < secondMatrix.length; i++){
                    product[r][c] = firstMatrix[r][i]*secondMatrix[c][i];
                }
            }
        }






    
        return null;
    }
}