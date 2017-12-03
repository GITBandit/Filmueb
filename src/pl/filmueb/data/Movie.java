package pl.filmueb.data;

public class Movie {

    private String name;
    private String director;
    private String year;
    private String genere;
    private String description;
    private double rating;

    public Movie(String name, String director, String year, String genere, String description, double rating) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.genere = genere;
        this.description = description;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


}
