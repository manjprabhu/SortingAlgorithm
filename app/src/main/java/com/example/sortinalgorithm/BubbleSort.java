package com.example.sortinalgorithm;

import android.util.Log;

public class BubbleSort {

    private final String TAG = BubbleSort.class.getSimpleName();

    int a[] = {17, 4, 6, 9, 5,  1, 32, 66,8,2};
    int n = a.length;

    public BubbleSort() {

        for(int i=0;i<n;i++) {

            for(int j=0;j<n-i-1;j++) {

                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int i=0;i<n;i++) {
            Log.v(TAG,"Bubble Sort:"+a[i]);
        }
    }
}
