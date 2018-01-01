package pl.filmueb.data;

public class Series extends Item {

    private int noOfSeries;
    private int noOfEpisodes;
    private String producer;


    public Series(String name, int noOfSeries, int noOfEpisodes, String producer, String genre, String description, double rating) {
        super(name, genre, description, rating);
        this.noOfSeries = noOfSeries;
        this.noOfEpisodes = noOfEpisodes;
        this.producer = producer;
    }

    public Series(){

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

}
