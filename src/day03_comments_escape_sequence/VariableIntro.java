package day03_comments_escape_sequence;

public class VariableIntro {

    public static  void main (String[]  args){

// option 1
        int num1; // declared variable called num1 and int data type
        num1 = 6; // assigned value/data into variable
        System.out.println(4);
        System.out.println(num1);
//        int  num1; // in one /same method, we cannot declare same variable name more than once
        num1 = 10; // RE-ASSIGNMENT - i gave another value to a;ready declared variable
        System.out.println(num1);

//        num2 =50; // you cannot declare only variable name without data type

        // option 2
        int num2 = 20;// DECLARED VARIABLE and assigned value/data in one statement
        System.out.println(num2);
        System.out.println(22);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        num2 =40;// 40 int datatype
        System.out.println(num2);

        byte n1 = 4;// 4 (byte datatype)
        short n2 = 4;
        int n3 = 4;
        long n4 = 4;
        long n5 = 800000000000L;

        //------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------");
        System.out.println(4.5); // by default its double

        float d1 = 3.6f;

        double d2 = 3.6;
        System.out.println(d1);
        System.out.println(d2);

        char letter1;
//        letter1 = 'a' // in a single quote we cannot use more than one character
        letter1 = '$';
        System.out.println(letter1);
        String letter2 = "a";
        String letter3 = "aa";

        System.out.println("----------------------");

        boolean varName = true;
        System.out.println(varName);
// sample strings
        String word = "Apple"; // declared String assigned to "Apple" value to it

        System.out.println("----------------------");

        int totalPrice;

        int applePrice = 5;
        int breadPrice = 2;

        totalPrice = applePrice + breadPrice;
        System.out.println(totalPrice);






        }


    }


