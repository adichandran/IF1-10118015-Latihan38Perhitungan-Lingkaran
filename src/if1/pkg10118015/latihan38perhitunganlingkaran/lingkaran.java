/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan38perhitunganlingkaran;

/**
 *
 * @author ACER
 */
public class lingkaran {
    public double r; //jari-jari
    public double L; //luas
    public double K; //keliling
    
    public double jari(double diameter){
        return r = diameter/2;
    }
    
    public double kelilinglingkaran(double r){
        return K = Math.PI*r*r;
    }
    
    public double luaslingkaran(double r){
        return L = 2*Math.PI*r;
    }
}
