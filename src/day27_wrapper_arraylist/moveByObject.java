package day27_wrapper_arraylist;

import java.util.ArrayList;

public class moveByObject {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(100);
        nums.add(1);
        nums.add(1010);
        nums.add(0);
        nums.add(1);
        nums.add(10);
        nums.remove((Integer) 1010);
        System.out.println(nums);
        System.out.println(nums.size());
    }

}
