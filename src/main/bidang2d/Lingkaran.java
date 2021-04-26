/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.bidang2d;

/**
 *
 * @author Owner
 */
public class Lingkaran implements Bidang2d {
    public int r;
    double keliling, luas;
    
    public Lingkaran(int r){
        this.r = r;
    }
    
    @Override
    public double hitungKeliling() {
        keliling = 2*Math.PI*r;
        return(keliling);
    }

    @Override
    public double hitungLuas() {
        luas = Math.PI*r*r;
        return(luas);
    }
    
}
