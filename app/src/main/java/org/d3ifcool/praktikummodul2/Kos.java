package org.d3ifcool.praktikummodul2;

/**
 * Created by user on 3/9/2017.
 */
public class Kos {
    private String namaKost;
    private String lokasiKos;
    private String hargaKos;
    private String kategoriKos;
    private String pemilikKos;
    private String kelola_kos;
    private String nama_pemesan;
    private String tgl_pesan;
    private String total;
    private int nGambar;

    public Kos(){}

    public Kos(int gambar, String nama, String lokasi, String harga, String kategori) {
        nGambar = gambar;
        namaKost = nama;
        lokasiKos = lokasi;
        hargaKos = harga;
        kategoriKos = kategori;
    }

    public Kos(int gambar, String nama, String lokasi, String harga, String kategori, String nKelola ) {
        nGambar = gambar;
        namaKost = nama;
        lokasiKos = lokasi;
        hargaKos = harga;
        kategoriKos = kategori;
        kelola_kos = nKelola;
    }

    public Kos(String nama_pemesan, String tgl_pesan, String nHarga) {
        this.tgl_pesan = tgl_pesan;
        this.nama_pemesan = nama_pemesan;
        total = nHarga;
    }

    public String getTotal() {
        return total;
    }

    public Kos(int gambar, String pemilik){
        nGambar = gambar;
        pemilikKos = pemilik;
    }

    public String getNama_pemesan() {
        return nama_pemesan;
    }

    public String getTgl_pesan() {
        return tgl_pesan;
    }

    public String getPemilikKos(){
        return pemilikKos;
    }

    public int getGambar(){
        return nGambar;
    }

    public String getNamaKost() {

        return namaKost;
    }

    public String getLokasiKos() {

        return lokasiKos;
    }

    public String getHargaKos(){
        return hargaKos;
    }

    public String getKategoriKos(){
        return kategoriKos;
    }

    public String getKelola_kos() {
        return kelola_kos;
    }
}
