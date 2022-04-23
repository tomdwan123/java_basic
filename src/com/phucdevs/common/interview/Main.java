package com.phucdevs.common.interview;

import java.util.Arrays;

/**
 * @author Phuc.Le
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Matrix with N = 2");
        printMatrixSpiral(2);

        System.out.println("Matrix with với N = 4");
        printMatrixSpiral(4);

        System.out.println("Matrix with với N = 5");
        printMatrixSpiral(5);

    }


    static void printMatrixSpiral(int n) {
        if (n < 2) return;

        int[][] matrix = createMatrixSpiral(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0;  j < n; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] createMatrixSpiral(int n) {
        int[][] matrix = new int[n][n];
        int sIndex = 0;
        int cValue = 1;
        int cRow = n-1;
        int cColumn = n - 1;

        while (sIndex <= n / 2) {
            // print top rows
            for (int tr = sIndex; tr <= cColumn; tr++)
                matrix[sIndex][tr] = cValue++;

            // print right columns
            for (int rc = sIndex + 1; rc <= cRow; rc++)
                matrix[rc][cColumn] = cValue++;

            // print bottom rows
            for (int br = cColumn - 1; br >= sIndex; br--)
                matrix[cRow][br] = cValue++;

            // print left columns
            for (int lc = cRow - 1; lc > sIndex; lc--)
                matrix[lc][sIndex] = cValue++;

            sIndex++;
            cRow--;
            cColumn--;
        }

        return matrix;
    }
}
