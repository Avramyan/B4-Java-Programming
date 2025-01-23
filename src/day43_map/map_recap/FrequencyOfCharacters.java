package day43_map.map_recap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String input1 = "loopcamp";
        String input12 = "poopclam";
        String input2 = input12;
        for (int i = 0; i < input1.length(); i++) {
            char eachChar = input1.charAt(i);
            for (int j = 0; j < input12.length(); j++) {
                if (eachChar == input12.charAt(i)) {
                    input2 = input2.replaceFirst(eachChar + "", "");
                }

            }
        }
        if (input2.isEmpty()) {
            System.out.println("Empty String");

        } else {
            System.out.println(input2);
            Map<Character, Integer> map = new HashMap<>();

        }
    }
}
