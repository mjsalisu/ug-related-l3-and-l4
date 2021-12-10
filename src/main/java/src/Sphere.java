package src;

/**
 * @author Jamilusalism
 */

public class Sphere {
    float radius = 0f;
    static float pi = 3.14159f;
    
    Sphere()  {
        radius = 0f;
    }
    
    Sphere(float radius) {
        this.radius = radius;
    }
    
    void setRadius(float radius) {
        this.radius = radius;
    }
    
    // function to compute Volume of Sphere
    float volume(float r) {
        float vol = ((float)4 / (float)3) * (pi * r * r * r);
        return vol;
    }
    
    // function to calculate surface Area of Sphere
    float surfaceArea(float r) {
        return 4 * pi * r * r;
    }
    
    // Driver tester
    public static void main(String[] args) {
        
        Sphere sphere = new Sphere(12);
        
        float vol = sphere.volume(sphere.radius);
        float sur_area = sphere.surfaceArea(sphere.radius);
        
        System.out.println("Radius of Sphere :" + sphere.radius);
        System.out.println("Volume of Sphere :" + vol);
        System.out.println("Surface Area of Sphere :" + sur_area);
    }
    
//    float heightContactPoint(Sphere secondSphere) {
//        return 0;
//    }
    
}
