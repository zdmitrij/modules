package com.zdmitrij.modules.module12;

public class Task2 {
    boolean result = false;
    private int number;

    public void ArrayDublicates(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    result = true;
                    number = array[i];
                    break;
                }
            }
        }
        String phrase = result ? "Число " + number + " повторяется 2 раза. " : "Дубликатов нет.";
        System.out.println("result = " + result);
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