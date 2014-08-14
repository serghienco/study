package com.slava.skiena.sort;

/**
 * Created by vserghienco on 8/14/14.
 */
public class InsertionSort {

    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void sort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j2 = i; j2 > 0; j2--) {
                int j1 = j2 - 1;
                if (list[j1] > list[j2]) {
                    swap(list, j1, j2);
                } else {
                    break;
                }
            }
        }
    }
}
