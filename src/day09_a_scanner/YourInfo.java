package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.print("Please enter your favourite book: ");
       String book = info.nextLine();
        System.out.println(book);

        System.out.print("Please enter your age: ");
        byte age = info.nextByte();

        System.out.print("Please enter your favourite long number");
        long favNum = info.nextLong();
        System.out.println("\nInfo you entered ");
    }
}
