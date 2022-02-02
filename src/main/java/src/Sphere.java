package src;

/**
 * @author @Jamilusalism & @hauwajibrilibrahim
 */

public class Sphere {
    float radius = 0f;
    static float pi = 3.14159f;

    Sphere() {
        radius = 0f;
    }

    Sphere(float radius) {
        this.radius = radius;
    }

    void setRadius(float radius) {
        this.radius = radius;
    }

    float getRadius() {
        return radius;
    }

    // function to compute Volume of Sphere
    float volume(float r) {
        float vol = ((float) 4 / (float) 3) * (pi * r * r * r);
        return vol;
    }

    float heightContactPoint(float R) {
        float r = getRadius();
        float height = (((float) 2 * R * r) / (R + r));
        return height;
    }
}