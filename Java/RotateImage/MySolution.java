package Java.RotateImage;

import java.util.Arrays;

public class MySolution {

    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int length = matrix.length;
        System.out.println("**Original Matrix**");

        printMatrix(matrix);

        rotateImage(matrix);
    }

    private static void printMatrix(int[][] matrix){
        for (int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }

    private static void rotateImage(int[][] matrix) {
        int length = matrix.length;

        // Transpose a matrix
        for(int i=0; i<length;i++){
            for(int j=i; j<length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("**After Transposing Matrix**");

        printMatrix(matrix);

        // Flip the matrix
        for(int i=0; i<length;i++){
            for(int j=0; j<length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }

        System.out.println("**After Flipping Matrix**");

        printMatrix(matrix);
    }
}
