package day31_custom_classes;
// Template Class

    /*

    Create a coffee class with these instance variables:
         price, size(oz), brand, types

         ex types: black, cappuccino, latte, mocchiato....

    instance methods:

        - make a toString to print all the information of the coffee objects

        - drink(): print: drinking $type type of coffee

        - refill(amount in oz): print refilling x oz
            add the number of oz to the total size

     */

public class Coffee {
    // Instance variables - each obj has its own copy of these
    double price;
    double sizeInOz;
    String brand;
    String type;



    public void drink () {
        System.out.println( "Drinking " + type + " type of coffee" );
    }

    public void refill (double addOz ) {
        System.out.println("Refilling " + addOz + " oz.");
        sizeInOz += addOz;
    }



    public String toString() {
        return  "Coffee: " +
                "\n\tprice: $" + price +
                "\n\tsize in OZ: " + sizeInOz +
                "\n\tbrand: " + brand +
                "\n\ttype: " + type;
    }
}
