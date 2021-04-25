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
public class Bola extends Lingkaran {
    public Bola(double r){
        super(r);
    }
    
    @Override
    public double hitungLuas(){
        return (4*super.hitungLuas());
    }
    
    double hitungVolume(){
        return (Math.PI*Math.pow(r, 3)*4/3);
    }
}
