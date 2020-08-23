package com.maveryanova.algorithms.sorting;

public abstract class Sort {
    private int[] array;
    private int length;

    public Sort() {
        setArray(new int[0]);
    }

    public abstract int[] sort();

    public void setArray(int[] array) {
        this.array = array;
        this.length = array.length;
    }

    public int[] getArray() {
        return this.array;
    }

    public int getLength() {
        return this.length;
    }

    protected void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}