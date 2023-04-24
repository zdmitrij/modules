package com.zdmitrij.modules.module12;

import java.util.StringJoiner;

public class Task1 {

    public void returnIndexes(int[] array, int num) {
        StringJoiner join = new StringJoiner(",");
        int helper = 0;
        for (int i = 0; i < array.length; i++) {
            if (helper == array[i]) {
                join.add(Integer.toString(i - 1));
                join.add(Integer.toString(i));
                break;
            }
            helper = num - array[i];
        }
        System.out.println("result = " + join);
    }


    public static void main(String[] args) {
        Task1 task1obj = new Task1();
        int[] array = {3, 8, 15, 17};
        task1obj.returnIndexes(array, 23);
    }
}