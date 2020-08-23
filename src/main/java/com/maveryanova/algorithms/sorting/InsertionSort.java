package com.maveryanova.algorithms.sorting;

public class InsertionSort extends Sort {

    @Override
    public int[] sort() {
        int[] array = copyArray();

        int innerCounter, outerCounter;
        for (outerCounter = 1; outerCounter < array.length; outerCounter++) {
            int temp = array[outerCounter];
            innerCounter = outerCounter;

            while (innerCounter > 0 && array[innerCounter - 1] >= temp) {
                array[innerCounter] = array[innerCounter - 1];
                --innerCounter;
            }
            array[innerCounter] = temp;
        }
        return array;
    }
}
