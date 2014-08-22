package com.slava.skiena.sort;

/**
 * Created by slavic on 8/21/14.
 */
public class SelectionSort {

    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void sort(int[] list) {
        for (int i = 0, len = list.length - 1; i < len; i++) {
            int minIdx = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[minIdx] > list[j]) {
                    minIdx = j;
                }
            }
            swap(list, i, minIdx);
        }
    }
}
