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
public class Kerucut extends Lingkaran {
    int tinggi;
    
    public Kerucut(int r, int tinggi){
        super(r);
        this.tinggi = tinggi;
    }
    
    double hitungKemiringan() {
        return Math.sqrt(Math.pow(tinggi, 2)+Math.pow(r, 2));
    }
    
    @Override
    public double hitungLuas() {
        return(super.hitungLuas() + Math.PI*r*hitungKemiringan());
    }
    
    public double hitungVolume() {
        return(super.hitungLuas()*tinggi/3);
    }
}
