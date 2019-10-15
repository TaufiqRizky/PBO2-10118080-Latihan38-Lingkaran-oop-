/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan38.lingkaran.oop;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Trizky
 */
public class PBO210118080Latihan38LingkaranOop {

    /**
     * @param args the command line arguments
     */
    private static DecimalFormat df = new DecimalFormat("#.##");
    public static void main(String[] args) {
        Lingkaran lk = new Lingkaran();
        System.out.println("========== Perhitungan Lingkaran ==========");
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
        Scanner D = new Scanner(System.in);
        lk.Validasi(D);
        lk.setDiameter(D.nextDouble());
        
        System.out.println("====== Hasil Perhitungan Lingkaran ======");
        System.out.println("Jari-jari Lingkaran \t ="+df.format(lk.getR())+" cm");
        System.out.println("Luar Lingkaran \t\t ="+df.format(lk.LuasLingkaran())+" cm");
        System.out.println("Keliling Lingkaran \t ="+df.format(lk.KelilingLingkaran())+" cm");
        System.out.println("Developed By : Taufiq Rizky");
    }
    
}
