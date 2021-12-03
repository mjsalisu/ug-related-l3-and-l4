package src;

/**
 * @author Jamilu_Salisu_CST_19_SWE_00409
 */

class FahrenheitToCelsius {
    double celsius = 0.0;
    void fahToCelsius (double fahrenheit) {
        //celsius = (5/9) * (fahrenheit - 32);
        celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        
        System.out.println(fahrenheit + " degree Fahrenheit is equivalent to " + celsius + " in Celsius");
    }
    
    public static void main (String [] agrs) {
        FahrenheitToCelsius fahToCal = new FahrenheitToCelsius();
        fahToCal.fahToCelsius(50.0);
    }
}
