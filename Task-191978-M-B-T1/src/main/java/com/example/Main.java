package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.example.strategypattern.AppConfig;
import com.example.strategypattern.SortingContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SortingContext sortingContext = context.getBean(SortingContext.class);

        int[] array = {9, 14, 3, 2, 43, 11, 58, 22};
        sortingContext.sortArray(array);
    }
}
