package src;

/**
 * @author @Jamilusalism & @hauwajibrilibrahim
 */

class CarDemo {
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

class Car {
    int horsePower;
    int speed;
    int fuelConsumption;
    int gasTank;
    int travelledTimeUp;

    // contructor
    Car() {
        // horsePower (hp)
        horsePower = 50;
        speed = 0;
        // fuelConsumption (km/liter)
        fuelConsumption = 20;
        gasTank = 200;
        travelledTimeUp = 0;
    }

    // methods
    void speedUp(int increment) {
        speed += increment;
    }

    void applyBrakes(int decrement) {
        speed -= decrement;
    }

    void travelledTimeUp(int increment) {
        travelledTimeUp += increment;
    }

    void printStateTank() {
        System.out.println(gasTank - speed * travelledTimeUp / fuelConsumption);
    }

}// end class Car
