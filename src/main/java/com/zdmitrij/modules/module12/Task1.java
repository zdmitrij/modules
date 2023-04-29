package com.zdmitrij.modules.module12;

import java.util.StringJoiner;

public class Task1 {
    int temp = 0;

    public void returnIndexes(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (temp == array[i]) {
                System.out.println("result = [" + (i - 1) + ", " + (i) + "]");
            }
            temp = num - array[i];
        }
    }

    public static void main(String[] args) {
        Task1 task1obj = new Task1();
        int[] array = {3, 8, 15, 17};
        task1obj.returnIndexes(array, 23);
    }
}