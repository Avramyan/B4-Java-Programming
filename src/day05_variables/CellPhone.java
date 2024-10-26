package day05_variables;

public class CellPhone {

    public static void main(String[] args) {

        String brand = "Apple";
        String model = "IPhone 15";
        String color = "White";
        double price = 777.77;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I just bought an Iphone 15 from Apple");
        System.out.println("I just bought an " + model + " from " + brand);
        System.out.println("It is in the color of $color and it has $storage");
        System.out.println("It is in the color of " + color + "and it has" + storage);
        System.out.println("It has sim card and with the camera being $hascamra, $thetotal price\n\n");
        System.out.println("It has " + sim + " sim card and with the camera being " + hasCamera + " the total price $" + price);

    }
}
