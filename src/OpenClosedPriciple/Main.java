/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenClosedPriciple;


import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[10];
        for(int i = 0;i < shape.length;i+=2){
            shape[i] = new Rectangle(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt());
        }
        for (int i = 1; i < shape.length; i+=2) {
            shape[i] = new Circle(new Scanner(System.in).nextInt());
        }
        System.out.println(AreaCalculator.Area(shape));
    }
}
