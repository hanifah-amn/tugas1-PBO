/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ruang3d;
import main.bidang2d.Lingkaran;
/**
 *
 * @author Owner
 */
public class Tabung extends Lingkaran {
    double tinggi;
    
    public Tabung(double r, double tinggi){
        super(r);
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas() {
        return(2*super.hitungLuas() + super.hitungKeliling()*tinggi);
    }
    
    double hitungVolume() {
        return(super.hitungLuas()*tinggi);
    }
}
