package com.pk.Collections.Misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Get an iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        System.out.println(numbers);
        // Iterate over the elements using the iterator
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
        }
        System.out.println(numbers);
    }
}
