package com.example.strategypattern;

import org.springframework.stereotype.Component;

@Component("bubbleSort")
public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        // Bubble sort logic here
        System.out.println("Sorting using Bubble Sort");
    }
}

