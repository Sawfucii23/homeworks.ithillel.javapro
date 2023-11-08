package homeworks.hw8;

import java.text.ParseException;

public class ArrayValueCalculator {
    public static void doCalc(String[][]arr)throws ArraySizeException, ArrayDataException{
        for (int i = 0; i < arr.length; i++) { // цикл по рядках
            for (int j = 0; j < arr[i].length; j++) { // цикл по стовпцях
                int tmp = Integer.parseInt(arr[i][j]);
                System.out.print(tmp);
            }
            System.out.println();
        }
    }


    public static class ArraySizeException extends ArrayStoreException {
        @Override
        public String getMessage() {
            return "Невірний формат масиву";
        }
    }

    public static class ArrayDataException extends NumberFormatException {
        @Override
        public String getMessage() {
            return "Невірне значення масиву";
        }
    }
}
