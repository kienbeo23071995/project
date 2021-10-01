/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenClosedPriciple;

/**
 *
 * @author Admin
 */
public class Circle extends Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return radius * radius * Math.PI; //To change body of generated methods, choose Tools | Templates.
    }
    
}
