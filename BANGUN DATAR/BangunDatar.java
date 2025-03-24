/* Nama File    : BangunDatar.java
 * Deskripsi    : super class bangun datar
 * Pembuat      : 24060123120039 / M. Daffa' Atstsaqif
 * Tanggal      : 24 Maret 2025
 */

public abstract  class BangunDatar{
    protected int jmlsisi;
    protected String warna;
    protected String border;
    private  static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlsisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    public int getJmlSisi(){
        return jmlsisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlsisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }
    

    public void printInfo(){
        System.out.println("jumlah sisi : " + jmlsisi);
        System.out.println("warna : " + warna);
        System.out.println("Border : " + border);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }

    public static void printCounterBangunDatar(){
        System.out.println("jumlah objek bangun datar : " + counterBangunDatar);
    }
    
    // abtrak 
    public abstract double getLuas();

    public abstract double getKeliling();

    // Membuat method yang memanfaatkan superclass
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}


//JAWABAN
/*SOAL 1*/
/*Ya, karena method isEqualLuas() didefinisikan dalam superclass BangunDatar, 
  sehingga dapat digunakan untuk membandingkan luas dari berbagai jenis bangun datar yang merupakan turunannya.*/

/*SOAL 2*/
/*Tidak, karena setiap bangun datar memiliki rumus luas dan keliling yang berbeda. Jika BangunDatar bukan abstract class,
  maka tidak mungkin mendefinisikan implementasi umum untuk kedua method tersebut. */

/*SOAL 3*/
/*Dengan menjadikan BangunDatar sebagai abstract class, kita dapat mendefinisikan method abstrak yang harus diimplementasikan oleh subclass, 
  memastikan bahwa setiap bentuk bangun datar memiliki rumus luas dan kelilingnya sendiri.*/ 
