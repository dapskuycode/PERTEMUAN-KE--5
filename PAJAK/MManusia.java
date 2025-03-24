/* Nama File    : MManusia.java
 * Deskripsi    : Main class Manusia
 * Pembuat      : 24060123120039 / M. Daffa' Atstsaqif
 * Tanggal      : 24 Maret 2025
 */

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        // Create objects with new names
        PNS p1 = new PNS("Daffa", LocalDate.of(2005, 5, 19), "Jl. Tentara Pelajar", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Tsaqif", LocalDate.of(2005, 10, 12), "Jl. Gajahmada", 100000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("M. Daffa", LocalDate.of(2005, 11, 29), "Jl. Veteran V", 6500000, "wonogiri");
        PNS p2 = new PNS("Daptod", LocalDate.of(2000, 5, 17), null, 25000000, "198004212010041002");

        p2.setAlamat("Jl. Baskoro Raya 83 Tembalang");
        
        System.out.println("\n========== STATISTIK MANUSIA ==========");
        System.out.println("Total Manusia\t: " + Manusia.getCounterMns() + " orang");
        System.out.println("Total PNS\t: " + PNS.getCounterPNS() + " orang");
        System.out.println("Total Pengusaha\t: " + Pengusaha.getCounterPengusaha() + " orang");
        System.out.println("Total Petani\t: " + Petani.getCounterPetani() + " orang");
        
        System.out.println("\n========== INFORMASI PAJAK ==========");
        System.out.printf("Pajak PNS (%s)\t: Rp %,.2f%n", p1.getNama(), p1.hitungPajak());
        System.out.printf("Pajak Pengusaha (%s)\t: Rp %,.2f%n", pe1.getNama(), pe1.hitungPajak());
        System.out.printf("Pajak Petani (%s)\t: Rp %,.2f%n", pt1.getNama(), pt1.hitungPajak());
        
        System.out.println("\n========== MASA KERJA ==========");
        System.out.printf("%-10s\t: %d tahun%n", p1.getNama(), p1.hitungMasaKerja());
        System.out.printf("%-10s\t: %d tahun%n", pe1.getNama(), pe1.hitungMasaKerja());
        System.out.printf("%-10s\t: %d tahun%n", pt1.getNama(), pt1.hitungMasaKerja());
        
        System.out.println("\n========== INFORMASI LENGKAP ==========");
        p1.cetakInfo();
        System.out.println("----------------------------------------");
        p2.cetakInfo();
        System.out.println("----------------------------------------");
        pe1.cetakInfo();
        System.out.println("----------------------------------------");
        pt1.cetakInfo();
    }
}

