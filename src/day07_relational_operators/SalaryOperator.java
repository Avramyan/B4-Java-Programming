package day07_relational_operators;

public class SalaryOperator {

    public static void main(String[] args) {


        double salary = 100_000.00;
        double state_Tax_Rate = 0.08;
        double federal_Tax_Rate = 0.21;
//         double stateTaxAmount;
        double stateTaxAmount = salary * state_Tax_Rate;
        double federalTaxAmount = salary * federal_Tax_Rate;
        double total_Tax_Amount = stateTaxAmount + federalTaxAmount;
        double salaryAfterTax = salary - total_Tax_Amount;
         String taxReport ="Tax info: \n\tSalary: $" + salary + "\n\tState Tax Rate: " + state_Tax_Rate + "\n\tFederal tax Rate: " + federal_Tax_Rate + "\n\t|-------------------------|\n\tAfter Tax: $" + salaryAfterTax;
        System.out.println(taxReport);


    }
}
