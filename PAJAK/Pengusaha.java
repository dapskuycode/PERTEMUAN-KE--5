/* Nama File    : Pengusaha.java
 * Deskripsi    : Class Pengusaha Turunan class Manusia
 * Pembuat      : 24060123120039 / M. Daffa' Atstsaqif
 * Tanggal      : 24 Maret 2025
 */


import java.time.LocalDate;

public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha;

    // Konstruktor
    public Pengusaha() {
        super();
        npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Selektor (getter)
    public String getNpwp() {
        return npwp;
    }
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Mutator (setter)
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
    public static void setCounterPengusaha(int counterPengusaha) {
        Pengusaha.counterPengusaha = counterPengusaha;
    }

    // NIM : 24060123120039
    public int hitungMasaKerja() {
        return (LocalDate.now().getYear() - tgl_mulai_kerja.getYear()) + 3;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=====================================");
        super.cetakInfo();
        System.out.println("NPWP                : " + getNpwp());
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("=====================================");
    }

    public double hitungPajak() {
        return this.getPendapatan() * 0.15;
    }
}
