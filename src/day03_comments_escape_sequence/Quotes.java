package day03_comments_escape_sequence;

public class Quotes {

    public static void main(String[] args){
        System.out.println("Everyone loves \"Java\"");
        System.out.println("\"Everyone loves Java\"");

        /*
        Q: How if I want to print it with the double quotes like below
        - Everyone love "Java" programming
         */


        /*
        Q: since we use \ slash as part of thr syntax, then how to type "\" itself
         */
        System.out.println("\\\\");
        // forward slash doesn't require any ESCAPE SEQUENCE
        System.out.println("\\\\");
    }
}
