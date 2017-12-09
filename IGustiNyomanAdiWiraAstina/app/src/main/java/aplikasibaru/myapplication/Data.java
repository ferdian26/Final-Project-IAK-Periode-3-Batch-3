package aplikasibaru.myapplication;

/**
 * Created by wahmang on 12/7/2017.
 */

public class Data {
    public int ivlogo;
    public String tvkategori;


    public Data(int ivlogo, String tvkategori ){
        this.ivlogo= ivlogo;
        this.tvkategori=tvkategori;
    }


    public int getIvlogo() {
        return ivlogo;
    }

    public void setIvlogo(int ivlogo) {
        this.ivlogo = ivlogo;
    }

    public String getTvkategori() {
        return tvkategori;
    }

    public void setTvkategori(String tvkategori) {
        this.tvkategori = tvkategori;
    }
}
