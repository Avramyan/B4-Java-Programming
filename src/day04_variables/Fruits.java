package day04_variables;

public class Fruits {

    public static void main(String[] args) {

        // have a 3 container.  and each cont will have "x number" os appls, grapes, bananas
        // have a 3 container.  and each cont will have "x price worth" of appls, grapes, bananas


        int apples = 70;
        int grapes = 80;
        int bananas = 100;

        System.out.println("This is how many apples i have: " + 60);// value 60 HARDCODED
        System.out.println("This is how many apples i have: " + apples);// apples is variables  --->.  dynamically
        System.out.println(grapes);// grape.sout
        System.out.println("grapes = " + grapes); //grape.soutv
        System.out.println("bananas = " + bananas);


        // REASSIGNMENT
        // I sold 30 apples
        System.out.println("I sold 30 apples");
        apples = 40;
        System.out.println("This is how many apples i have after sale : " + apples);
        System.out.println("------------------");

        double price = 15.99;
        System.out.println("The discounted price for the leftover apples is $" + "15.99"); // 15.99 hardcoded
        System.out.println("The discounted price for the leftover apples is $" + price); //  dynamic
        System.out.println("-------------");


        //CONCATENATION vs psus (math)
        System.out.println(50 + 50);
        System.out.println("50" + 50);
        System.out.println(10 + 10 + "10" + 10 + 10);   //
        System.out.println("10" + 10 + "10" + 10 + 10);   // after String everything becomes String ----> everything become concatenation
        System.out.println("10" + 10 + " " + 10 + 10);   // after String everything becomes String ----> everything become concatenation


    }
}
