import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows and columns between 1 and 10 : ");
        int rows = scan.nextInt();
        int columns = rows;

        // Adding Two matrices
        int[][] addingFirstMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(" Enter the number of position " + i + "," + j + " in FIRST matrix");
                addingFirstMatrix[i][j] = scan.nextInt();
            }
        }
        int[][] addingSecondMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(" Enter the number of position " + i + "," + j + " in SECOND matrix");
                addingSecondMatrix[i][j] = scan.nextInt();
            }
        }

        // sum of two matrices
//        int[][] sum = new int[rows][columns];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                sum[i][j] = addingFirstMatrix[i][j] + addingSecondMatrix[i][j];
//            }
//        }
//
//         sum
//        System.out.println("Sum of two matrices is: ");
//        for (int[] row : sum) {
//            for (int column : row) {
//                System.out.print(column + "    ");
//            }
//            System.out.println();
//        }
        System.out.println("Two matrix one next to the other");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < addingFirstMatrix.length; j++) {
                System.out.print(addingFirstMatrix[i][j] + "  ");
            }
            System.out.print(" | ");
            for (int j = 0; j < addingSecondMatrix.length; j++) {
                System.out.print(addingSecondMatrix[i][j] + "  ");
            }
            System.out.println(" \t ");
        }


        sum(addingFirstMatrix, addingSecondMatrix);


//        directsum
        System.out.println("Direct sum of matrixs ");
        int[][] emptyMatrix = new int[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                emptyMatrix[r][c] = 0;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < addingFirstMatrix.length; j++) {
                System.out.print(addingFirstMatrix[i][j] + "  ");
            }
            System.out.print("\t ");
            for (int j = 0; j < emptyMatrix.length; j++) {
                System.out.print(emptyMatrix[i][j] + "  ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < emptyMatrix.length; j++) {
                System.out.print(emptyMatrix[i][j] + "  ");
            }
            System.out.print("\t ");
            for (int j = 0; j < addingSecondMatrix.length; j++) {
                System.out.print(addingSecondMatrix[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }


    private static void sum(int[][] firstMatrix, int[][] secondMatrix) {
        int row = firstMatrix.length;
        int col = secondMatrix.length;
        int[][] sum = new int[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                sum[r][c] = firstMatrix[r][c] + secondMatrix[r][c];
            }
        }

        System.out.println("Sum of Matrices: ");
        printArray(sum);
    }

    private static void printArray(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + "\t ");
            }
            System.out.println();
        }
    }
}