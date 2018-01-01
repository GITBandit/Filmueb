package pl.filmueb.model;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (Double.compare(item.rating, rating) != 0) return false;
        if (!name.equals(item.name)) return false;
        if (!genre.equals(item.genre)) return false;
        return description.equals(item.description);
    }

    @Override
    public String toString() {
        return "Tytuł : " + name +
                ", Gatunek : " + Genre.convertBack(this.genre) +
                ", \nOpis : " + description +
                ", \nOcena : " + rating +
                ", ";
    }
}
