package pl.filmueb.data;

import pl.filmueb.logic.ConsoleDataReader;

public class ApplicationDatabase {

    public Actor[] actor = new Actor[10];
    public Movie[] movie = new Movie[10];
    public Series[] series = new Series[10];



    ConsoleDataReader reader = new ConsoleDataReader();

    public int movieCount;
    public Movie createMovie(){
        movie[movieCount] = new Movie ();

        System.out.println("Podaj tytuł filmu: ");
        movie[movieCount].setName(reader.scanText());

        System.out.println("Podaj reżysera filmu: ");
        movie[movieCount].setDirector(reader.scanText());

        System.out.println("Podaj rok w którym film był nagrany: ");
        movie[movieCount].setYear(reader.scanText());

        System.out.println("Podaj gatunek filmu: ");
        movie[movieCount].setGenere(reader.scanText());

        System.out.println("Podaj opis filmu: ");
        movie[movieCount].setDescription(reader.scanText());

        System.out.println("Podaj ocenę filmu: ");
        movie[movieCount].setRating(reader.scanRating());
        if(movie[movieCount].getRating()==0){
            movie[movieCount] = null;
            System.out.println("Obiekt nie został utworzony");
            movieCount--;}

        movieCount++;
        return movie[movieCount];

    }

    public int actorCount;
    public Actor createActor(){
        actor[actorCount] = new Actor();

        System.out.println("Podaj imię aktora: ");
        actor[actorCount].setName(reader.scanText());

        System.out.println("Podaj nazwisko aktora: ");
        actor[actorCount].setSurname(reader.scanText());

        System.out.println("Podaj narodowość aktora: ");
        actor[actorCount].setNationality(reader.scanText());

        actorCount++;

        if (actorCount == 10) {
            System.out.printf("Nie można utworzyć więcej aktorów!!!");
        }
        return actor[actorCount];

    }

    public int seriesCount;
    public Series creteTvSeries(){
        series[seriesCount] = new Series();

        System.out.println("Podaj nazwę serialu: ");
        series[seriesCount].setName(reader.scanText());

        System.out.println("Podaj liczbę sezonów: ");
        series[seriesCount].setNoOfSeries(reader.scanSeriesEpisodes());

        System.out.println("Podaj liczbę odcinków: ");
        series[seriesCount].setNoOfEpisodes(reader.scanSeriesEpisodes());

        System.out.println("Podaj producenta: ");
        series[seriesCount].setProducer(reader.scanText());

        System.out.println("Podaj gatunek: ");
        series[seriesCount].setGenre(reader.scanText());

        System.out.println("Podaj opis: ");
        series[seriesCount].setDescription(reader.scanText());

        System.out.println("Podaj ocenę: ");
        series[seriesCount].setRating(reader.scanRating());
        if(series[seriesCount].getRating()==0){
            series[seriesCount] = null;
            System.out.println("Obiekt nie został utworzony");
            seriesCount--;
        }

        seriesCount++;
        return series[seriesCount];
    }
}
