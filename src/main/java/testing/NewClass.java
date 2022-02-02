/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author jamil
 */
class NewClass {

    public static void main(String[] agrs) {
        Pig p = new Pig();
        Animal a = new Pig();
        p.animalSound();
        a.animalSound();
    }
}

class Animal {

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {

    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {

    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
