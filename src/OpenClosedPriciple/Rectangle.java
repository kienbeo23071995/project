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
public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double area() {
        return width * height; //To change body of generated methods, choose Tools | Templates.
    }
    
}
