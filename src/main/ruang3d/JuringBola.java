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
public class JuringBola extends Bola {
    int derajat;
    
    public JuringBola(int r, int derajat){
        super(r);
        this.derajat = derajat;
    }
    
    @Override
    public double hitungLuas() {
        double luasSelimut; //bidang lengkung bola
        luasSelimut = derajat/360 * super.hitungLuas();
        return (super.hitungLuas() + luasSelimut);
    }
    
    public double hitungVolume() {
        return (derajat/360 * super.hitungVolume());
    }
}
