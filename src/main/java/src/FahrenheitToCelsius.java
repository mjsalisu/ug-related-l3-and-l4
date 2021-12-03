package src;

/**
 * @author Jamilusalism
 */

//Tesing Class
class FahrenheitToCelsius {
    public static void main(String[] args) {
        //creating an object
        FahrenheitToCelsiusLab3 fahr_to_cels = new FahrenheitToCelsiusLab3();
        
        fahr_to_cels.setFarh(4);
        fahr_to_cels.fahToCelsius() ;
    }
}// end FahrenheitToCelsiusDemo class


class FahrenheitToCelsiusLab3 {
    float cels = 0, fahr = 0;
	
    public void setFarh(float fahr) {
        this.fahr = fahr;
    } //end method setFarh
        
    public float getFarh() {
        return fahr;
    } //end method getFarh
	
    public void fahToCelsius() {
        cels =(( 5 *(getFarh() - 32)) / 9);
        //cels = (5/9) * (fahr - 32);
        
        System.out.println(fahr + " degree Fahrenheit is equivalent to " + cels + " in Celsius");
    } //end method printTemperature
	
}//end FahrenheitToCelsius class