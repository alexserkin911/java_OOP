package classWork2;

import java.util.Arrays;

public class CheckArray {

    public static boolean checkArray(String[][] array) {
        int len = 4;
        if (array.length == len && array[0].length == len) {
            return true;
        } else {
            throw new MyArraySizeException("Массив должен быть 4*4");
        }
    }

    public static int sum(String[][] array) {
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    int number = Integer.parseInt(array[i][j]);
                    sumArray += number;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В элементе массива: [" + i + "] [" + j + "] - '" + array[i][j] + "'");
                }
            }
        }
        return sumArray;
    }

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "5"},
                {"13", "14", "15", "16"}
        };
        try {
            checkArray(array);
            System.out.println("Массив соответствует");
            int result = sum(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
}
