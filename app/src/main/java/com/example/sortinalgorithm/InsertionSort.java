package com.example.sortinalgorithm;

import android.util.Log;

public class InsertionSort {

    private final String TAG = InsertionSort.class.getSimpleName();

    int a[] = {17, 4, 6, 9, 5,  1, 32, 66,8,2};
    int n = a.length;

    public InsertionSort() {

        for(int i=1;i<n;i++) {
            int key = a[i];
            int j = i-1;

            while(j>=0 && a[j] > key) {
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
        }
        for(int i=0;i<n;i++) {
            Log.v(TAG,""+a[i]);
        }

    }

}
