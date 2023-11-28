package homeworks.hw12;

import java.util.*;

public class CollectionMethodsHw12 {
    public static int countOccurance(String[]arr, String target){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(target)){
                count++;
            }
        }
        return count;
    }

    public static <T> List<T> toList(T[] arr) {
        List<T> list = Arrays.asList(arr);
        return list;
    }

    public static ArrayList<Integer>findUnique(ArrayList<Integer>integerList){
        ArrayList<Integer>newIntegerList = new ArrayList<Integer>();
        newIntegerList.add(integerList.get(0));
        for (int x = 0; x < integerList.size(); x++){
            if (!newIntegerList.contains(integerList.get(x))){
                newIntegerList.add(integerList.get(x));
            }
        }
        return newIntegerList;
    }
}
