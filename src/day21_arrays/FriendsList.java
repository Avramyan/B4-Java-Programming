package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsList {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("");

        String [] friendsList = new String[key.nextInt()];
        key.nextLine();
        for (int i = 0; i < friendsList.length; i++) {

            System.out.println("Ples");
         friendsList[i] = key.nextLine();


        }
        System.out.println(Arrays.toString(friendsList));
    }
}
