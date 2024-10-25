package com.example.strategypattern;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortingContext {
    private SortingStrategy sortingStrategy;

    @Autowired
    public SortingContext(@Qualifier("mergeSort") SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sortArray(int[] array) {
        sortingStrategy.sort(array);
    }
}
