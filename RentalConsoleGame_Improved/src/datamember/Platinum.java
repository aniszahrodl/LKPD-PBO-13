/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamember;

/**
 *
 * @author acer
 */
public class Platinum extends Member {
    protected int diskon = 3;
    protected int poin = 10;
    int totalPoin;
    int totalSewa;
    protected int cashback = 10000;
    protected int bonus = 5000;
    int bonusPulsa;
    
    Platinum(Data data){
        super.data = data;
        super.hargaSewa = 45000;
    }
    
    void hitungBiaya(){
        hitungPeminjaman();
        totalSewa = hargaSewa*lama;
        int potongan = diskon/100*totalSewa;
        totalSewa -= potongan;
        totalPoin = poin*lama;
        bonusPulsa = bonus*lama;
    }
    
    void printPlatinum(){
        this.pinjamKembali();
        System.out.println("Total Biaya Rental: Rp"+totalSewa);
        System.out.println("Jumlah Poin: "+totalPoin);
        System.out.println("Cashback: Rp"+cashback);
        System.out.println("Bonus Pulsa: Rp"+bonusPulsa);
    }
}
