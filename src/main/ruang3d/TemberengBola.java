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
public class TemberengBola extends Bola {
    int tinggi;
    
    public TemberengBola(int tinggi){
        super(tinggi);
    }
    
    @Override
    public double hitungLuas() {
        double luasAlas;
        luasAlas = Math.PI*tinggi*tinggi;
        return (luasAlas + super.hitungLuas()/2);
    }
    
    @Override
    public double hitungVolume() {
        return (super.hitungVolume()/2);
    }
}
