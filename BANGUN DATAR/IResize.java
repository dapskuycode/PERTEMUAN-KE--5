/* Nama File    : IResize.java
 * Deskripsi    : mengubah ukuran bangun datar
 * Pembuat      : 24060123120039 / M. Daffa' Atstsaqif
 * Tanggal      : 24 Maret 2025
 */

public interface IResize {
    // menambahkan ukuran menjadi 10% lebih besar 
    public void zoomIm();
    
    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menskalakan ukuran menjadi sesuai inputan
    public void zoomIm(int percent );

}