package homeworks.hw7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StringMethods {
    public static int findSymbolOccurance(String s, char c){
        int amount = 0;
        for (int x = 0; x < s.length(); x++){
            if (s.charAt(x) == c){
                amount++;
            }
        }
        return amount;
    }

    public static int findWordPosition(String source, String target){
        if (source.indexOf(target) != -1){
            return source.indexOf(target);
        }
        else return -1;
    }

    public static String stringReverse(String s){
        String reverse = "";

        char sArrChar[];
        sArrChar = s.toCharArray();
        for (int x = s.length()-1; x>= 0; x--){
            reverse += sArrChar[x];
        }
        return reverse;
    }

    public static boolean isPalindrome(String s1){

        boolean palindrome = true;

        double length = s1.length();
        double lengthDev2 = length/2;


        for (int x = 0; x < lengthDev2; x++){
            if (     !       s1.substring(x,x+1).equals(s1.substring(s1.length() - x -1,s1.length() - x))                   ){
                palindrome = false;
                break;
            }
        }
        /*
        if (palindrome){
            System.out.println("полиндром");
        }
        else System.out.println("не полиндром");

         */

        return palindrome;
    }
    public static void stringGame(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String answer = "";
        String word;
        boolean correct = false;
        String tip = "################";

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        word = words[random.nextInt(words.length)];
        int tmpCount = 1;
        while (correct = true || tip.contains("#")) {
            System.out.println("Спробуй вгадати загадане слово:");
            answer = scanner.next();

            if (answer.equals(word)){
                System.out.println("Перемога");
                correct = true;
                break;
            }
            else System.out.println("Слово невірне");

//            for (int o = 0; o < words.length; o++){
//                if ()
//            }

            String longest = "";
            String shortest;

            if (answer.length() > word.length()) {
                longest = answer;
                shortest = word;
            }
            else {
                longest = word;
                shortest = answer;
            }


            for (int y = 0; y < shortest.length(); y++){
                if (answer.charAt(y) == word.charAt(y)){
                        tip = word.charAt(y + tmpCount -1) + tip.substring(tmpCount + y-2);
                        tmpCount++;
                }
                else break;
            }
            System.out.println(tip);

        }

    }



}


