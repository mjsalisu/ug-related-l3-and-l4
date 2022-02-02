/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamil
 */
class Car {

    int horsePower;
    int speed;
    int fuelConsumption;
    int gasTank;
    int travelledTime;

    Car() {
        horsePower = 0;
        speed = 1;
        fuelConsumption = 220;
        gasTank = 20;
        travelledTime = 0;
    }

    void speedUp(int newData) {
        speed += newData;
    }

    void applyBrakes(int newData) {
        speed -= newData;
    }

    void travelledTimeUp(int newData) {
        travelledTime += newData;
    }

    void printStateTank() {
        System.out.println(gasTank - speed * travelledTime / fuelConsumption);
    }

}

public class CarDemo {
public static void main(String[] args) {
        Car motor1 = new Car();
        Car motor2 = new Car();
        Car motor3 = new Car();
        motor1.speedUp(30);
        motor1.travelledTimeUp(12);
        motor1.printStateTank();
        motor2.speedUp(40);
        motor2.travelledTimeUp(15);
        motor2.printStateTank();
        motor3.speedUp(50);
        motor3.travelledTimeUp(20);
        motor3.printStateTank();
    }
}
