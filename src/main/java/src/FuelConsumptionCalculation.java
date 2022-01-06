package src;

class SimpleCar {
    private String maker; // Honda Toyota, Nissan, etc.
    private int distance = 0; // distance travelled
    private float fuelEconomy; // Table 2, Column 2

    public SimpleCar(String maker, float fuelEconomy) {
        this.maker = maker;
        this.fuelEconomy = fuelEconomy;
    }

    public void setData(int distance) {
        this.distance = distance;
    }

    public String getMaker() {
        return maker;
    }

    public int getDistance() {
        return distance;
    }

    public float getfuelEconomy() {
        return fuelEconomy;
    }

    public float calculateFuelConsumptionOldRegulations() {
        return distance / fuelEconomy;
    }

    public float calculateFuelConsumptionNewRegulations() {
        return calculateFuelConsumptionOldRegulations();
    }
}

class AdvancedCar extends SimpleCar {
    private float acFuel;
    private int beginWork = 0; // time to begin work
    private int endWork = 0;

    // time to end work
    public AdvancedCar(String maker, float fuelEconomy, float acFuel) {
        super(maker, fuelEconomy);
        this.acFuel = acFuel;
    }

    public void setData(int beginWork, int endWork, int distance) {
        super.setData(distance);
        this.beginWork = beginWork;
        this.endWork = endWork;
    }

    public float getAcFuel() {
        return acFuel;
    }

    public float calculateFuelConsumptionOldRegulations() {
        return super.calculateFuelConsumptionOldRegulations() + (endWork - beginWork) / acFuel;
    }

    public float calculateFuelConsumptionNewRegulations() {
        return calculateFuelConsumptionOldRegulations();
    }
}

class DeluxeCar extends AdvancedCar {
    private int timeWithPassengers = 0;

    public DeluxeCar(String maker, float fuelEconomy, float acFuel) {
        super(maker, fuelEconomy, acFuel);
    }

    public void setData(int beginWork, int endWork, int distance, int timeWithPassengers) {
        super.setData(beginWork, endWork, distance);
        this.timeWithPassengers = timeWithPassengers;
    }

    public float calculateFuelConsumptionOldRegulations() {
        return super.calculateFuelConsumptionOldRegulations();
    }

    public float calculateFuelConsumptionNewRegulations() {
        return getDistance() / getfuelEconomy() + timeWithPassengers / getAcFuel();
    }
}

public class FuelConsumptionCalculation {
    private double fuelConsumptionOldRegulation = 0;
    private double fuelConsumptionNewRegulation = 0;
    private SimpleCar[] cars;

    public FuelConsumptionCalculation() {
        final int MAX_CARS = 4;
        cars = new SimpleCar[MAX_CARS];
        cars[0] = new DeluxeCar("Honda", 14f, 10.5f);
        
        ((DeluxeCar) cars[0]).setData(7, 18, 300, 10);
        cars[1] = new AdvancedCar("Toyota", 15.5f, 9.5f);
        
        ((AdvancedCar) cars[1]).setData(7, 18, 200);
        cars[2] = new SimpleCar("Nissan", 13.0f);
        
        cars[2].setData(350);
        cars[3] = new DeluxeCar("Van (Nissan)", 10.5f, 6f);
        
        ((DeluxeCar) cars[3]).setData(7, 18, 400, 7);
        calculateFuelconsumption();
    }

    public FuelConsumptionCalculation(SimpleCar[] cars) {
        this.cars = cars;
        calculateFuelconsumption();
    }

    private void calculateFuelconsumption() {
        fuelConsumptionOldRegulation = 0;
        fuelConsumptionNewRegulation = 0;
        for (int i = 0; i < cars.length; i++) {
            fuelConsumptionOldRegulation += cars[i].calculateFuelConsumptionOldRegulations();
            fuelConsumptionNewRegulation += cars[i].calculateFuelConsumptionNewRegulations();
        }
    }

    // Question 1
    double getFuelConsumptionOldRegulation() {
        return fuelConsumptionOldRegulation;
    }

    double getFuelConsumptionNewRegulation() {
        return fuelConsumptionNewRegulation;
    }

    // Question 2
    public static void main(String[] args) {
        FuelConsumptionCalculation cars = new FuelConsumptionCalculation();
        // Question 3
        System.out.println("Old Fuel Consumption is: " + cars.getFuelConsumptionOldRegulation());
        System.out.println("New Fuel Consumption is: " + cars.getFuelConsumptionNewRegulation());
        // Question 4
        double amountOfFuelSaved;
        amountOfFuelSaved = cars.getFuelConsumptionOldRegulation() - cars.getFuelConsumptionNewRegulation();

        System.out.println("Amount of fuel saved is: " + amountOfFuelSaved);

    }
}