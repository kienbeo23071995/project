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
public class AreaCalculator {
    public static double Area(Shape[] shape){
        double area = 0;
        for(Shape o : shape){
            area += o.area();
        }
        return area;
    }
}
