package homeworks.hw8;

import homeworks.hw8.Exeptionshw8.ArrayDataException;
import homeworks.hw8.Exeptionshw8.ArraySizeExeption;

import java.text.ParseException;

public class ArrayValueCalculator {
    public static int doCalc(String[][] arr) throws ArraySizeExeption, ArrayDataException {
        for (int x = 0; x < 4; x++) {
            if (arr.length != 4 || arr[x].length != 4) {
                throw new ArraySizeExeption(arr.length);
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // цикл по рядках
            for (int j = 0; j < arr[i].length; j++) { // цикл по стовпцях

//                if (j == 0){
//                    throw new ArraySizeException();
//                }
//                Integer tmp = Integer.parseInt(arr[i][j]);
//                if (tmp instanceof Integer) {
                try {
                    int value = Integer.parseInt(arr[i][j]);
                    sum += value;
                }
                catch (NumberFormatException ex) {
                    throw new ArrayDataException(j, i);


                    //sum += Integer.parseInt(arr[i][j]);
//                } else {
//                    throw new ArrayDataException();
//                }


                }
//            System.out.println();
            }

        }

//    public static class ArraySizeException extends ArrayStoreException {
//        @Override
//        public String getMessage() {
//            return "Невірний формат масиву";
//        }
//    }
//
//    public static class ArrayDataException extends NumberFormatException {
//        @Override
//        public String getMessage() {
//            return "Невірне значення масиву";
//        }
//    }
    return sum;
    }
}
