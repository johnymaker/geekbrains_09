package com.company;

public class Main {

    public static void main(String[] args) {
        //Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
        // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
        //Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
        // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
        // должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
        //В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
        // и вывести результат расчета.

        String[][] arr1 = new String[][] {
                {"4", "8", "14", "8"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "tr"},
                {"549", "1001", "-47", "-800"}};

        String[][] arr2 = new String[][]{
                {"4", "8", "14", "8", "13"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "tr", "24"},
                {"549", "1001", "-47", "-800"}};

        String[][] arr3 = new String[][]{
                {"4", "8", "14", "8"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "5"},
                {"549", "1001", "-47", "-800"}};

        try {
            ArraySummator.sum(arr1);
        } catch (MyArrayDataException ex) {
            ex.printStackTrace();
        } catch (MyArraySizeException ex) {
            ex.printStackTrace();
        }

        try {
            ArraySummator.sum(arr2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            ArraySummator.sum(arr3);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
