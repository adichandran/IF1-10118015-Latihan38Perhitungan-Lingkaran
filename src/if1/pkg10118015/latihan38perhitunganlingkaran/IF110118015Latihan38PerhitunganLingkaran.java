/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan38perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program menghitung lingkaran
 */
public class IF110118015Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double diameter;
        Scanner input = new Scanner(System.in);
        lingkaran lingkaran = new lingkaran();
        System.out.println("=======Perhitungan Lingkaran===========");
	System.out.print("Masukkan nilai diameter lingkaran : ");
        while (!input.hasNextDouble()){
		System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println();
		System.out.print("Masukkan nilai diameter lingkaran : ");
		input.next();
	}
        diameter = input.nextDouble();
        System.out.println("===Hasil Perhitungan Lingkaran===");
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",lingkaran.jari(diameter));
        System.out.printf("Luas Lingkaran = %.2f cm %n",lingkaran.luaslingkaran(diameter));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",lingkaran.kelilinglingkaran(diameter));
    }
    
}
