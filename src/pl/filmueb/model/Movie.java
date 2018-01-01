package pl.filmueb.model;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        if (!super.equals(o)) return false;

        Movie movie = (Movie) o;

        if (!director.equals(movie.director)) return false;
        return year.equals(movie.year);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Reżyser : " + director +
                ", Rok : " + year +
                "\n";
    }
}
