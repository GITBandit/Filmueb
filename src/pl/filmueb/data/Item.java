package pl.filmueb.data;

public class Item {

    private String name;
    private String genre;
    private String description;
    private double rating;

    public Item(String name, String genre, String description, double rating) {
        this.name = name;
        this.genre = genre;
        this.description = description;
        this.rating = rating;
    }

    public Item(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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
        if(rating >=0 && rating<=10)
            this.rating = rating;
        else
            System.out.println("Podana wartość jest nieprawidłowa. (Zakres oceny to 1-10)");
    }
}
