package Belajar.Sesi4.Tugas;

import java.util.Scanner;

public class Level4b {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan N: ");
        int n = inputan.nextInt();

        int[][]pascal = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                if (j==0 || j==i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
        inputan.close();
    }
}