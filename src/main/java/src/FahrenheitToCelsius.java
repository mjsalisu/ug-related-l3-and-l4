package src;

/**
 * @author Jamilu_Salisu_CST_19_SWE_00409
 */

class FahrenheitToCelsius {
    double celsius = 0.0;
    
    double fahToCelsius (double fahrenheit) {
        return celsius = (5/9) * (fahrenheit - 32);
    }
    
    public static void main (String [] agrs) {
        FahrenheitToCelsius fahToCal = new FahrenheitToCelsius();
        System.out.println("The Temperature in Celsius is: " + fahToCal.fahToCelsius(50.0));
    }
}
