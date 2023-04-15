package com.zdmitrij.modules.module12;

import java.util.StringJoiner;

public class Task1 {

    public void returnIndexes(int[] array, int num) {
        StringJoiner join = new StringJoiner(",");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    join.add(Integer.toString(i));
                    join.add(Integer.toString(j));
                    break;
                }
            }
        }
        System.out.println("result = " + join);
    }

    public static void main(String[] args) {
        Task1 task1obj = new Task1();
        int[] array = {3, 8, 15, 17};
        task1obj.returnIndexes(array, 23);
    }
}