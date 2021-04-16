package com.adilah.bubble;

public class Selection {
    static void sorting(int [] arr) {
        int a = arr.length;
        for (int b = 0; b < a; b++) {
            int min_index = b;
            for (int c = b + 1; c < a; c++)
                if (arr[c] < arr[min_index])
                    min_index = c;

            // Pertukaran
            int temp = arr[min_index];
            arr[min_index] = arr[b];
            arr[b] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 20, 2, 95, 48};

        System.out.println("Array Before Selection Sort");
        for (int x = 0; x < arr.length; x++ ) {
            System.out.print(arr[x] + " ");
        }

        System.out.println("\n");

        sorting(arr);

        System.out.println("Array After Selection Sort");
        for (int y = 0; y < arr.length; y++ ) {
            System.out.print(arr[y] + " ");
        }
        System.out.println();
    }
}