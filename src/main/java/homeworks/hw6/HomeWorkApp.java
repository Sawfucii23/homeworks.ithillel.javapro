package homeworks.hw6;

public class HomeWorkApp {
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b){
        if ((a + b) < 0){
            System.out.println("Сумма негативна");
        }
        else System.out.println("Сумма позитивна");
    }

    public static void printColor(int value){
        if (value < 0){
            System.out.println("Червоний");
        }
        else if (value >= 0 || value <= 100){
            System.out.println("Жовтий");
        }
        else if (value > 100){
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers(int a, int b){
        if (a <= b){
            System.out.println("a <= b");
        }
        else System.out.println("a > b");
    }

    public static boolean ifSumBetweenTenAndTwenty(int a, int b){
        boolean between;
        if (  (a+b) >= 10 || (a+b) <= 20){
            between = true;
        }
        else between = false;
        return between;
    }

    public static void soutIsPositive(int a){

        if (a >= 0){
            System.out.println("Число додатнє");
        }
        else System.out.println("Число від'ємнє");

    }
    public static boolean isPositive(int a){
        boolean isPositive;
        if (a >= 0){
            isPositive = true;
        }
        else isPositive = false;
        return isPositive;
    }
    public static void soutAmountOfString(int a, String s){
        for (int x = 0; x < a; a++){
            System.out.println(s);
        }
    }



}
