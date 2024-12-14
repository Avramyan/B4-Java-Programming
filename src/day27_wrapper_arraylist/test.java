package day27_wrapper_arraylist;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String [] arr = {"my", "name", "is"};
        System.out.println(Arrays.toString(addElemInArray(arr,"Artem")) );
        String str = "asda";

    }
    public static String [] addElemInArray (String [] arr, String str ) {
        String [] addedArr = Arrays.copyOf(arr, arr.length+1);
        addedArr[addedArr.length - 1] = str;

        return  addedArr;
    }
}
