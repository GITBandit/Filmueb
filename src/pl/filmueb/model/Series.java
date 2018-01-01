package pl.filmueb.model;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Series)) return false;
        if (!super.equals(o)) return false;

        Series series = (Series) o;

        if (noOfSeries != series.noOfSeries) return false;
        if (noOfEpisodes != series.noOfEpisodes) return false;
        return producer.equals(series.producer);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Liczba sezonów : " + noOfSeries +
                ", Liczba odcinków : " + noOfEpisodes +
                ", Producent : " + producer +
                "\n";
    }
}
