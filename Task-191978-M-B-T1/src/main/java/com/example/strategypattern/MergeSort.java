package com.example.strategypattern;

import org.springframework.stereotype.Component;

@Component("mergeSort")
public class MergeSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        // Merge sort logic here
        System.out.println("Sorting using Merge Sort");
    }
}

