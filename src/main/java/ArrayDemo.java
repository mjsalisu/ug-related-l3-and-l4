/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamil
 */
public class ArrayDemo {

    public static void main(String[] args) {
        String[] anArray; // declares an array of integers
        anArray = new String[10]; // allocates memory for 10 integers
        anArray[0] = "50"; // initialize first element
        anArray[1] = "10"; // initialize second element

        String[] a3 = {new String("1"), "2"};
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {16, 17, 18, 19};
        a = b;

        System.out.println("Element at index 0: " + a[0]);
        System.out.println("Element at index 1: " + a[3]);
// prints values of the first and the second element
    }
}
