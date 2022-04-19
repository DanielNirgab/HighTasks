package ArrsTasks;

import java.util.Arrays;

public class Arrs {
    public static void main(String[] args) {
        //Task5
        int [][] wrongsArray = new int[3][3];
        for (int i = 0; i < wrongsArray.length; i++) {
            for (int j = 0; j < wrongsArray[i].length; j++) {
                wrongsArray[i][j] = 1;
            }
        }
        for (int[] row : wrongsArray) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        //Task6
        int [] wrongArray = {5, 4, 3, 2, 1};
        int [] correctArray = new int[wrongArray.length];
        System.out.println("Первоначальный массив: " + Arrays.toString(wrongArray));
        System.out.println("Второй массив: " + Arrays.toString(correctArray));
        for (int i = correctArray.length; i > 0; i--) {
            for (int j = correctArray.length-i; j < correctArray.length; j++) {
                correctArray[j] = wrongArray[i-1];
            }
        }
        System.out.println("Корректный массив: " + Arrays.toString(correctArray));

        //Task7
        System.out.println();
        System.out.println("Первоначальный массив следующей задачи: " + Arrays.toString(wrongArray));
        for (int i = 0; i < wrongArray.length; i++) {
            for (int j = i + 1; j < wrongArray.length; j++) {
                int temp = 0;
                temp = wrongArray[i];
                wrongArray[i] = wrongArray[j];
                wrongArray[j] = temp;
            }
        }
        System.out.println("Корректный массив следующей задачи: " + Arrays.toString(wrongArray));

        //Task8
        System.out.println();
        int [] arr1 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i-1] - arr1[i] == -2) {
                System.out.println("Парой чисел, которые в сумме дают -2, являются: " + arr1[i-1] + " & " + arr1[i]);
                break;
            } else if (i == arr1.length - 1) {
                System.out.println("Таких пар нет");
            }
        }
        // Task9
        System.out.println();
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int pairs = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 1; j < arr1.length; j++) {
                boolean condition1 = arr1[i] - arr1[j] == -2;
                boolean condition2 = arr1[i] + arr1[j] == -2;
                if (condition1 && arr1[j] > 0 || condition2 && arr1[j] > 0) {
                    System.out.println("Парой чисел, которые в сумме дают -2, являются: " + arr1[i] + " & " + arr1[j]);
                    pairs++;
                } else if (i == arr1.length - 1 && pairs==0) {
                    System.out.println("Таких пар нет");
                }
            }
        }
    }
}
