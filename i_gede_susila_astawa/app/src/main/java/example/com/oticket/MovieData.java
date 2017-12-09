package example.com.oticket;

/**
 * Created by user on 12/3/2017.
 */

public class MovieData {
    private String title;
    private String genre;
    private String time;
    private String price;

    public MovieData(String name, String genre, String time, String price) {
        this.title = name;
        this.genre = genre;
        this.time = time;
        this.price = price;
    }

    public String getName() {
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public String getTime(){
        return time;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.title = name;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setTime(String time){
        this.time = time;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
