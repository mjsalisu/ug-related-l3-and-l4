/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamil
 */
class Bicycle {

    // fields or attributes
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    Bicycle() {
        // constructor
        cadence = 0;
        speed = 0;
        gear = 1;
    } // methods

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("Cadence " + cadence + "\tSpeed: " + speed + "\tGear: " + gear);
    }
} // end of the Bicycle class

public class BicycleDemo {

    public static void main(String[] args) {
        String s1 = new String("this is a String");
        String s2 = "this is another String";
        String s3 = null; // no String object assigned
        
        s1 = "MJ";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Create two different Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        bike1.speedUp(10); // Invoke methods on those
        bike1.printStates(); // objects
        bike2.changeCadence(50);
        bike2.speedUp(15);
        bike2.printStates();
    }
}
