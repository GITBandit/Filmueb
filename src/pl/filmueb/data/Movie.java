package pl.filmueb.data;

public class Movie {

    private String name;
    private String director;
    private String year;
    private String genre;
    private String description;
    private double rating;

    public Movie(String name, String director, String year, String genere, String description, double rating) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.genre = genere;
        this.description = description;
        this.rating = rating;
    }

    public Movie(){

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
        return genre;
    }

    public void setGenere(String genere) {
        this.genre = genere;
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
        if(rating >0 && rating<=10)
            this.rating = rating;
        else
            System.out.println("Podana wartość jest nieprawidłowa. (Zakres oceny to 1-10)");
    }


}
