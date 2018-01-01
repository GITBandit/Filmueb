package pl.filmueb.data;

public class Movie extends Item {

    private String director;
    private String year;


    public Movie(String name, String director, String year, String genre, String description, double rating) {
        super(name,genre,description,rating);
        this.director = director;
        this.year = year;

    }

    public Movie(){

    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
