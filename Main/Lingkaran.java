/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author gilym
 */
public class Lingkaran extends variabel implements MenghitungBidang {
  public Lingkaran(double p,double l,double t,double r){
        super(p,l,t,r);
}
    @Override
    public void luas() {
        double luasLing;
        luasLing = 3.14 * r * r ;
        System.out.println("Luas Lingkaran     =   " + luasLing);
    }

    @Override
    public void keliling() {
        double keliling;
        keliling = 2 * 3.14 * r;
        System.out.println("Keliling Lingkaran =   "+ keliling);
        
    }
    
}
