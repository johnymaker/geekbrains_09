package com.company;

public class ArraySummator {

    public static final int SIZE = 4;

    public static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != SIZE) {
            throw new MyArraySizeException("Мне нужен массив только 4х4");
        }
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x].length != SIZE) {
                throw new MyArraySizeException("Мне нужен массив только 4х4");
            }
            for (int y = 0; y < arr[x].length; y++) {
                try {
                    sum += Integer.parseInt(arr[x][y]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(String.format("В ячейке не целое числовое значение [%d][%d]", x + 1, y + 1));
                }
            }
        }
        System.out.println("Сумма равна " + sum);
        return sum;
    }
}
