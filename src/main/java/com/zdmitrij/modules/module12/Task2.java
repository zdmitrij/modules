package com.zdmitrij.modules.module12;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class Task2 {
    private int position;
    private int temp;
    String phrase = "Дубликатов нет. Result: false";

    public void ArrayDublicates(int[] array) {
        sort(array);
        for (int i = 0; i < array.length; i++) {
            position = binarySearch(array, array[i]);
            if (array[position] == temp) {
                phrase = ("Число " + array[i] + " повторяется 2 раза. result = true");
                break;
            }
            temp = array[position];
        }
        System.out.println(phrase);
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int[] arr1 = {4, 5, 6, 6, 8};
        task2.ArrayDublicates(arr1);
        Task2 task3 = new Task2();
        int[] arr2 = {4, 5, 6, 7, 8};
        task3.ArrayDublicates(arr2);
    }
}