package com.example.sortinalgorithm;

import android.util.Log;

public class SelectionSort {

    int a[] = {7, 4, 56, 9, 5, 1, 32, 66};

    public void StartSelectionSort() {

        //Move the boundary of unsorted array

        int min_index;
        for (int i = 0; i < a.length; i++) {

            min_index = i;

            //Find the minimum element in unsorted array.
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }

                int temp = a[min_index];
                a[min_index] = a[i];
                a[i] = temp;
            }
        }

        for (int i = 0; i < a.length; i++) {
            Log.v("StartSelectionSort:","sorted array:"+a[i]);
        }

    }
}
