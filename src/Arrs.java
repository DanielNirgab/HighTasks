import java.util.Arrays;

public class Arrs {
    public static void main(String[] args) {
        //Task1
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
        //Task2
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

        //Task3
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

        //Task4
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

        System.out.println();
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i-1] - arr1[i] == -2) {
                System.out.println("Парой чисел, которые в сумме дают -2, являются: " + arr1[i-1] + " & " + arr1[i]);
            } else if (i == arr1.length - 1) {
                System.out.println("Таких пар нет");
            }
        }

    }
}
