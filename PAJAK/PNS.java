/* Nama File    : PNS.java
 * Deskripsi    : Class PNS turunan class Manusia
 * Pembuat      : 24060123120039 / M. Daffa' Atstsaqif
 * Tanggal      : 24 Maret 2025
 */


import java.time.LocalDate;

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS;

    // Konstruktor
    public PNS() {
        super();
        nip = "";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selektor (getter)
    public String getNip() {
        return nip;
    }
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Mutator (setter)
    public void setNip(String nip) {
        this.nip = nip;
    }
    public static void setCounterPNS(int counterPNS) {
        PNS.counterPNS = counterPNS;
    }

    // NIM : 24060123120039
    public int hitungMasaKerja() {
        return (LocalDate.now().getYear() - super.getTglMulaiKerja().getYear()) + 9;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=====================================");
        super.cetakInfo();
        System.out.println("NIP                 : " + getNip());
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("=====================================");
    }

    public double hitungPajak() {
        return this.getPendapatan() * 0.1;
    }
}
