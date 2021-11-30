/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamember;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Member {

    public Data data;
    LocalDate waktuPinjam;
    LocalDate waktuKembali;
    int lama;
    int hargaSewa;
    ArrayList<Data> dataMember = new ArrayList<>();
    
    public void dataMember() {
        dataMember.add(new Data("M001", "Mr. X", "Silver"));
        dataMember.add(new Data("M002", "Mr. Y", "Gold"));
        dataMember.add(new Data("M003", "Mr. Z", "Platinum"));
    }
    
    private void cariMember(String Id) {
        boolean ada = false;
        int ke = -1;
            for(int i = 0; i < dataMember.size(); i++) {
                if(dataMember.get(i).Id.equals(Id)){
                    ada = true;
                    ke = i;
                    }
            }   
            if(ada == true) {
                data = dataMember.get(ke);
            } else {
                System.out.println("Member tidak terdaftar");
                System.exit(0);
            }
    }
    
    public Data inputMember() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member Anda : ");
        cariMember(input.nextLine());
        return data;
    }
    
    protected void hitungPeminjaman() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Peminjaman : ");
        int tglPeminjaman = input.nextInt();
        System.out.print("Masukkan Bulan Peminjaman : ");
        int blnPeminjaman = input.nextInt();
        System.out.print("Masukkan Tahun Peminjaman : ");
        int thnPeminjaman = input.nextInt();
        waktuPinjam = LocalDate.of(thnPeminjaman, blnPeminjaman, tglPeminjaman);
        
        System.out.print("Masukkan Tanggal Pengembalian : ");
        int tglPengembalian = input.nextInt();
        System.out.print("Masukkan Bulan Pengembalian : ");
        int blnPengembalian = input.nextInt();
        System.out.print("Masukkan Tahun Pengembalian : ");
        int thnPengembalian = input.nextInt();
        System.out.println("");
        waktuKembali = LocalDate.of(thnPengembalian, blnPengembalian, tglPengembalian);
        
        long days = ChronoUnit.DAYS.between(waktuPinjam, waktuKembali);
        lama = Math.toIntExact(days);
    }  
    
    protected void pinjamKembali() {
        data.printData();
        System.out.println("Tanggal Peminjaman : " + waktuPinjam);
        System.out.println("Tanggal Pengembalian : " + waktuKembali);
        System.out.println("Lama Peminjaman : " + lama + " hari");
        System.out.println("");
    }
    
}
