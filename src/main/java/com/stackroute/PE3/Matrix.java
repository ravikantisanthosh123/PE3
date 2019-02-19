package com.stackroute.PE3;

public class Matrix {

    public int[][] addMatrix(int m,int n, int[][] a,int[][] b)
    {

        int sum[][] = new int[m][n];
        for (int c = 0; c < m; c++)
            for (int d = 0; d < n; d++)
                sum[c][d] = a[c][d] + b[c][d];
            return sum;
    }


}
