package day18_loops;

public class CountHi {
    public static void main(String[] args) {
        // Find how many "hi" is in the word

        String word = "aaaahisvshihihihhhiivshisvadhisdvs";
        int count = 0;



        for (int i = 0; i < word.length() - 1 ; i++) {

            if (word.substring(i, i + 2).equals("hi")){
                count++;
            }
//(word.substring(i,i+1) == "hi"
            //word.charAt(i) == 'h' && word.charAt(i+1) == 'i')
        }

        System.out.println("You got " + count + " times \"hi\" in \"" + word + "\"") ;

        //





    }
}