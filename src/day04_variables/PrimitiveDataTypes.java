package day04_variables;

public class PrimitiveDataTypes {

    /*
    data types:
        1) primitive
            a) integer type
            - byte
            -short
            -int
            -long
           b) floating type
           - float
           - double
           c) Single Character
           -chat
           d)

        2) non-primitive
     */
    public static void main(String[] args) {

        byte age = 34; // declaire variable called age and data type is byte and assigned value
        System.out.println("age");// "age" ist. a variable. its. value itself
        System.out.println(age);// age is a variable here. data type is byte
        System.out.println(34); // 34 is a value and by DEFAULT its an int datatype

        // byte b2 = 200 will be an error because  byte can hold -128 to 127
        System.out.println("-------------");

        short year; //declared variable called year
        year = 2024; // assigned  a value of 2024 to the variable called year
        System.out.println(2024); // 2024 is a value and by default its int
        System.out.println("-------------");

        int ipNumber = 123456;// declare a variable called ipNumber and data type is int
        System.out.println(ipNumber);// ipNumber is a variable and data type is int
        System.out.println(123456);// 123456b is a value and by Deafault its int
        System.out.println("-------------");


        long accNumber = 12423535643646L;// declare a variable and data. type is long and assigned with having "L" at the end of value
        System.out.println(accNumber); //accNumber is variable
        System.out.println();




    }
}
