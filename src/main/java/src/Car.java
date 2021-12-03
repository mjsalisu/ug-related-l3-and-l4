package src;

/**
 * @author Jamilusalism
 */

class CarDemo {
    public static void main (String [] agrs) {
        Car first_car = new Car();
        Car second_car = new Car();
        Car third_car = new Car();
        
        first_car.speedUp(180);
        first_car.ravelledTimeUp(4);
    }
}

class Car {
    int horsePower = 0;
    int speed = 0;
    int fuelConsumption = 0;
    int gasTank = 0;
    int travelledTime = 0;
        
    //contructor
    Car() {
        //horsePower (hp);
        speed = 0;
        //fuelConsumption (km/liter);
        gasTank = 8;
        travelledTime = 0;
    }
    
    //methods
    void speedUp(int increment) {
       speed += increment;
    }
    
    void applyBrakes(int decrement) {
        speed -= decrement;
    }
    
    void ravelledTimeUp(int hour) {
        travelledTime = hour;
    }
    
    void printStateTank () {
        //speed, fuelConsumption, travelledTime and initial value of the gasTank
        System.out.println();
    }
    
}//end class Car