package activities;

public class Activity1 {
    public static void main(String[] args)
    {
        Car carName=new Car();
        carName.make=2014;
        carName.colour="black";
        carName.transmission="manual";

        carName.displayCharacteristics();
        carName.accelerate();
        carName.brake();
    }
}
