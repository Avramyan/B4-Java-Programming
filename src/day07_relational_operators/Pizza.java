package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {

String typeOfPizza ="Pepperoni";
int numOfSlices = 10;
int numOfPeopleEating = 3;

int slicesPerPerson = numOfSlices / numOfPeopleEating;
int slicesLeftOver = numOfSlices % numOfPeopleEating;
        System.out.println(slicesLeftOver);
String result = "We bought " + typeOfPizza + " pizza. It has " + numOfSlices + " slices. We are "
 + numOfPeopleEating + " people and each of us will eat " + slicesPerPerson + " slices and there will " + slicesLeftOver + " slices leftover.";
        System.out.println(result);

    }
}
