package day04_variables;

public class PrintDate {


    public static void main(String[] args) {

        int month = 10;
        int day = 23;
        int year = 2024;


        System.out.println(month +"/"+ day+"/"+year);


        System.out.println(month +"\\"+ day+"\\"+year);


        System.out.println(month +"|"+ day+"|"+year);

        System.out.println(month + day + year); // ----> 2057


        System.out.println(""+month + day + year);




    }
}
