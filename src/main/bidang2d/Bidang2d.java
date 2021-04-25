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
public interface Bidang2d {
    double R=0;
    double PANJANG=0, LEBAR=0, TINGGI=0;
    double KELILING=0, LUAS=0;
    
    double hitungKeliling();
    double hitungLuas();
}
