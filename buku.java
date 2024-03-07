public class buku {
    private String judul;
    private String penulis;
    private int tahun;

    

    public buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    public String getJudul() {
        return this.judul;
    }
    public String getPenulis() {
        return this.penulis;
    }
    public int getTahun() {
        return this.tahun;
    }

    @Override
    public String toString() {
        return " Judul Buku : " + judul + "\n Penulis : " + penulis + "\n Tahun : " + tahun + "\n" + "\n";
    }
}