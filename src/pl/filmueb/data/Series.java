package pl.filmueb.data;

public class Series {

    private String name;
    private int noOfSeries;
    private int noOfEpisodes;
    private String producer;
    private String genre;
    private String description;
    private double rating;

    public Series(String name, int noOfSeries, int noOfEpisodes, String producer, String genere, String description, double rating) {
        this.name = name;
        this.noOfSeries = noOfSeries;
        this.noOfEpisodes = noOfEpisodes;
        this.producer = producer;
        this.genre = genere;
        this.description = description;
        this.rating = rating;
    }

    public Series(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfSeries() {
        return noOfSeries;
    }

    public void setNoOfSeries(int noOfSeries) {
        this.noOfSeries = noOfSeries;
    }

    public int getNoOfEpisodes() {
        return noOfEpisodes;
    }

    public void setNoOfEpisodes(int noOfEpisodes) {
        this.noOfEpisodes = noOfEpisodes;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genere) {
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
        if(rating >=0 && rating<=10)
            this.rating = rating;
        else
            System.out.println("Podana wartość jest nieprawidłowa. (Zakres oceny to 1-10)");
    }
}
