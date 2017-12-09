package aplikasibaru.myapplication;

/**
 * Created by wahmang on 12/9/2017.
 */

public class DataBarang {
    public int ivdatabarang;
    public String tvkode;
    public String tvnama;
    public String tvtanggal;
    public String tvjumlah;




    public DataBarang(int ivdatabarang, String tvkode, String tvnama, String tvtanggal, String tvjumlah ){
        this.ivdatabarang = ivdatabarang;
        this.tvkode = tvkode;
        this.tvjumlah = tvjumlah;
        this.tvnama=tvnama;
        this.tvtanggal=tvtanggal;
    }


    public int getIvdatabarang() {
        return ivdatabarang;
    }

    public void setIvdatabarang(int ivdatabarang) {
        this.ivdatabarang = ivdatabarang;
    }

    public String getTvtanggal() {
        return tvtanggal;
    }

    public void setTvtanggal(String tvtanggal) {
        this.tvtanggal = tvtanggal;
    }

    public void setTvjumlah(String tvjumlah) {
        this.tvjumlah = tvjumlah;
    }

    public String getTvjumlah() {
        return tvjumlah;
    }

    public void setTvnama(String tvnama) {
        this.tvnama = tvnama;
    }

    public String getTvnama() {
        return tvnama;
    }

    public void setTvkode(String tvkode) {
        this.tvkode = tvkode;
    }

    public String getTvkode() {
        return tvkode;
    }
}
