package day37_a_abstraction.car;

public class Tesla extends ElectricCar{
    @Override
    public void charge() {
        System.out.println("Tesla charged");
    }

    @Override
    public void start() {
        System.out.println("Tesla starting");
    }
}
