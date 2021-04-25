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
public class TemberengBola extends Bola {
    double tinggiTembereng;
    
    double hitungLuas() {
        
    }
    
    @Override
    double hitungVolume() {
        return (Math.PI*tinggiTembereng*tinggiTembereng*(3*r-tinggiTembereng)/3);
    }
}
