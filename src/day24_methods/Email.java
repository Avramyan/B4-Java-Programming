package day24_methods;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner key  = new Scanner(System.in);

        String fullName = key.nextLine().trim();



        String domain = key.nextLine();//.gmail.com -- .outlook.com

        if(fullName.contains(" " )  && domain.startsWith("@") ) {


            // tjerry@gmai.com

            // fullName.substring(0,1) + fullName.substring( fullName.indexOf(" ") + 1 ) + "@" + domain;

            buildEmail(fullName, domain); // calling buildEMail() method and passing 2 arguments.
            buildEmail("Micky Mouse", "outlook.com");
        }else {
            if( !(fullName.contains(" " ) ) ){
                System.out.println("Should contain 2 words.");
            }
            if ( !(domain.startsWith("@")) ) {
                System.out.println("Should start with \"@\"");
            }
        }


    }


    public static void buildEmail (String fullName, String domain) { // I declare custom method which accepts 2 parameters







        String result = (fullName.substring(0,1) + fullName.substring( fullName.indexOf(" ") + 1 )  + domain).toLowerCase();

        System.out.println(result);

    }



}
