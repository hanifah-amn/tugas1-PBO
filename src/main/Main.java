/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

import main.ruang3d.Tabung;
import main.ruang3d.Kerucut;
import main.ruang3d.Bola;

import main.ruang3d.KerucutTerpancung;
import main.ruang3d.JuringBola;
/**
 *
 * @author Owner
 */
public class Main {
    public static void main(String[] args){
        do{
            Scanner input = new Scanner(System.in);
            int pilihan;
            System.out.println("APLIKASI BANGUN RUANG TURUNAN LINGKARAN");
            System.out.println("1. Tabung");
            System.out.println("2. Kerucut");
            System.out.println("3. Bola");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            pilihan = input.nextInt();
            System.out.println("");
            
            switch(pilihan){
                case 1 : tabung(); break;
                case 2 : kerucut(); break;
                case 3 : bola(); break;
                case 4 : System.exit(0); break;
                default: break;
            }
            System.out.println("");
        } while(true);
    }

    private static void tabung() {
        Scanner input = new Scanner(System.in);
        int r, tinggi;
        System.out.println("TABUNG");
        System.out.print("Jari-jari = ");
        r = input.nextInt();
        System.out.print("Tinggi = ");
        tinggi = input.nextInt();
        
        Tabung tabung = new Tabung(r,tinggi);
        System.out.println("Luas tabung = " + tabung.hitungLuas());
        System.out.println("Volume tabung = " + tabung.hitungVolume());
    }

    private static void kerucut() {
        Scanner input = new Scanner(System.in);
        int r1, tinggi1, r2, tinggi2;
        System.out.println("KERUCUT");
        System.out.print("Jari-jari = ");
        r1 = input.nextInt();
        System.out.print("Tinggi = ");
        tinggi1 = input.nextInt();
        
        Kerucut kerucut1 = new Kerucut(r1,tinggi1);
        System.out.println("Luas kerucut = " + kerucut1.hitungLuas());
        System.out.println("Volume kerucut = " + kerucut1.hitungVolume());
        
        int pilihan;
        System.out.println("\n1. Hitung kerucut terpancung");
        System.out.println("2. Kembali");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        
        if(pilihan==1){
            //input kerucut kecil yang memotong
            System.out.println("Masukkan atribut kerucut kecil");
            System.out.print("Jari-jari = ");
            r2 = input.nextInt();
            System.out.print("Tinggi = ");
            tinggi2 = input.nextInt();
            
            KerucutTerpancung kerucut2 = new KerucutTerpancung(r2,tinggi2,kerucut1);
            System.out.println("Luas kerucut terpancung = " + kerucut2.hitungLuas());
            System.out.println("Volume kerucut terpancung = " + kerucut2.hitungVolume()); 
        }
        //else kembali ke menu awal
    }

    private static void bola() {
        Scanner input = new Scanner(System.in);
        int r;
        System.out.println("BOLA");
        System.out.print("Jari-jari = ");
        r = input.nextInt();
                
        Bola bola = new Bola(r);
        System.out.println("Luas bola = " + bola.hitungLuas());
        System.out.println("Volume bola = " + bola.hitungVolume());
        
        int pilihan;
        System.out.println("\n1. Hitung cincin bola");
        System.out.println("2. Hitung juring bola");
        System.out.println("3. Hitung tembereng bola");
        System.out.println("4. Hitung keratan bola");
        System.out.println("5. Kembali");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1 : break;
            case 2 : 
                int derajat;                
                System.out.print("Derajat juring = ");
                derajat = input.nextInt();

                JuringBola juringBola = new JuringBola(r,derajat);
                System.out.println("Luas kerucut terpancung = " + juringBola.hitungLuas());
                System.out.println("Volume kerucut terpancung = " + juringBola.hitungVolume());
                break;
            case 3 : break; //input tinggi tembereng
            case 4 : break;
            case 5 : break;
            default: break;
        }
    }
}
