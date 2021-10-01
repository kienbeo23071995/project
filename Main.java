/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(5.6,6.8);
        HinhTron ht = new HinhTron(3.4);
        System.out.printf("Chu vi hcn = %.2f\n",hcn.chuVi());
        System.out.printf("Dien tich hcn = %.2f\n",hcn.dienTich());
        System.out.printf("Chu vi ht = %.2f\n",ht.chuVi());
        System.out.printf("Dien tich ht = %.2f\n",ht.dienTich());
    }
}
