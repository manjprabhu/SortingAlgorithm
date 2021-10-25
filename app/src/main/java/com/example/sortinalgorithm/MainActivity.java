package com.example.sortinalgorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QuickSorting quickSorting = new QuickSorting();
        quickSorting.StartSorting();

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.StartSelectionSort();
    }
}