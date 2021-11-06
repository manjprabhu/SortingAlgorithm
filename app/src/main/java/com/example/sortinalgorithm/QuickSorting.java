package com.example.sortinalgorithm;

import android.util.Log;

public class QuickSorting {

    int a[] = {17, 4, 6, 9, 5,  1, 32, 66,8,2};
    int low = 0, high = a.length-1;
    int pivot;

    public void StartSorting() {

        QuickSort(low,high);
        for(int i=0;i<a.length;i++) {
            Log.v("QuickSort:","Sorted element:"+a[i]);

        }
    }

    private void  QuickSort(int low, int high) {
        if (low < high) {
            int pos = partition(low, high);
             QuickSort(low, pos-1);
             QuickSort(pos+1, high);
        }
    }

    private int partition(int low, int high) {
        int i = low, j = high;
        pivot = a[low];
        while (i < j) {

            while(a[i] < pivot) {
                i++;
            }

            while (a[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = pivot;
        pivot = a[j];
        a[j] = temp;
        return j;
    }
}
