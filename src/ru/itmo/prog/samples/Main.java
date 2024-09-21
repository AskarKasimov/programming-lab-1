package ru.itmo.prog.samples;

import java.util.Random;

public class Main {
    static int[] d = new int[20];
    static double[] x = new double[13];

    private static boolean exists(int[] array, int value) {
        for (int j : array) {
            if (j == value) {
                return true;
            }
        }
        return false;
    }

    private static double calculateRow(int i, int j) {
        if (d[i] == 10) return Math.cos(Math.log1p(Math.pow(Math.sin(x[j]), 2)));
        else {
            if (exists(new int[]{1, 2, 3, 4, 5, 7, 11, 12, 17, 19}, d[i]))
                return Math.log1p(Math.acos(Math.pow(x[j] / 14, 2)));
            else
                return Math.log1p(Math.pow(Math.pow(Math.tan(Math.pow(Math.E, Math.pow(Math.E, x[j]))), 2) / 2, 2));
        }
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] i : matrix) {
            for (double j : i) {
                System.out.print(String.format("%.2f", j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // task #1
        for (int i = 0; i < d.length; i++) {
            d[i] = i + 1;
        }

        // task #2
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            //if (r.nextBoolean()) {
              //  x[i] = 7.0; // including 7.0 (lol)
               // continue;
            //}
            x[i] = -7 + (14) * r.nextDouble();
        }

        // task #3
        double[][] p = new double[20][13];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                p[i][j] = calculateRow(i, j);
            }
        }

        printMatrix(p);
    }
}