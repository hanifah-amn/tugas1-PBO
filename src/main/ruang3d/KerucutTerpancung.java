/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ruang3d;

/**
 *
 * @author Owner
 */
public class KerucutTerpancung extends Kerucut {
    Kerucut kerucut1; //kerucut awal sebelum dipotong
    
    public KerucutTerpancung(int r, int tinggi, Kerucut kerucut1){
        super(r,tinggi);
        this.kerucut1 = kerucut1;
    }
    
    double hitungLuasSelimut(){
        //menghitung luas selimut kerucut yang memotong
        double kemiringan;
        kemiringan = kerucut1.hitungKemiringan() - hitungKemiringan();
        return (Math.PI*kemiringan*(r+kerucut1.r));
    }
    
    public double hitungLuas(){
        return (kerucut1.hitungLuas() - hitungLuasSelimut() + super.hitungLuas());
    }
    
    @Override
    public double hitungVolume(){
        return (kerucut1.hitungVolume() - super.hitungVolume());
    }
    
}
