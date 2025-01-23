package com.mohancode.cart.Interviewprep;

import java.util.Arrays;

public class MinCostPath {
    public static void main(String[] args) {
        int[][] cost = {{1, 2, 3},
                     {4, 8, 2},
                     {1, 5, 3}};
        int m=2,n=2;
        System.out.println("Minimum cost to reach (" + m + ", " + n + ") is " + Arrays.deepToString(minCost(cost, m, n)));
    }
    static int[][] minCost(int[][] cost, int m, int n) {
        int[][] res = new int[m+1][n+1];

        return res;
    }
}
