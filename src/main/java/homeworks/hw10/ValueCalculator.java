package homeworks.hw10;

import homeworks.hw8.Exeptionshw8.ArraySizeExeption;

public class ValueCalculator {

    private int[]arr;

    private int length;
    private int half;
    public ValueCalculator(int length) throws ArraySizeExeption {
        int arr1[] = new int[length];
        this.arr = arr1;
        length = arr.length;
        half = arr.length/2;
        if (arr.length >= 1000000) {
            this.length = arr.length;
        }
        else {
            throw new ArraySizeExeption(arr.length);
        }
    }


    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getArrLength() {
        return length;
    }

    public int getArrHalfLegth() {
        return half;
    }

    public int[] method(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i ++){
            arr[i] = 1;
        }
        int[]a1 = new int[half];
        int[]a2 = new int[half];

        System.arraycopy(arr, 0 , a1, 0, half);

        System.arraycopy(arr, half, a2, 0, half);

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < half; i++) {
                    a1[i] = (int) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < half; i++) {
                    a2[i] = (int) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, half);
        System.arraycopy(a2, 0, arr, half, half);


        long end = System.currentTimeMillis();
        long time = end - start;

        System.out.println("Витрачений час: " + time + " мс");

        return arr;
    }

}
