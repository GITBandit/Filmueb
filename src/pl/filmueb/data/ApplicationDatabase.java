package pl.filmueb.data;

import pl.filmueb.controller.ApplicationController;
import pl.filmueb.io.ApplicationIO;
import pl.filmueb.io.exceptions.IncorrectDataException;
import pl.filmueb.model.Actor;
import pl.filmueb.model.Genre;
import pl.filmueb.model.Movie;
import pl.filmueb.model.Series;

import java.util.Scanner;

public class ApplicationDatabase {

    public Actor[] actor = new Actor[10];
    public Movie[] movie = new Movie[10];
    public Series[] series = new Series[10];



    ApplicationIO reader = new ApplicationIO();

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
        movie[movieCount].setGenre(Genre.convert(reader.scanText()).toString());

        System.out.println("Podaj opis filmu: ");
        movie[movieCount].setDescription(reader.scanText());

        System.out.println("Podaj ocenę filmu: ");
        try {
            movie[movieCount].setRating(reader.scanRating());
        } catch (IncorrectDataException e){
            System.err.println("Nieprawidłowy format, spróbuj ponownie");
            movie[movieCount] = null;
            movieCount--;
        }

        if (movie[movieCount].getRating()==0){
            movie[movieCount] = null;
            System.out.println("Obiekt nie został utworzony");
            movieCount--;}

        if (movie[movieCount].getGenre().equals("UNDEFINED")){
            System.out.println("Podany gatunek jest nieprawidłowy! Dostępne gatunki to: Sci-fi, Akcja, Komedia, Thriller");
            System.out.println("Obiekt nie został utworzony");
            movieCount--;}

        for (int i = 0; i < movieCount; i++) {
            if (movie[movieCount].equals(movie[i])) {
                movie[movieCount] = null;
                System.out.println("Taki film już istnieje w bazie");
                System.out.println("Obiekt nie został utworzony");
                movieCount--;
            }
        }


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

        for (int i = 0; i < actorCount; i++){
            if (actor[actorCount].equals(actor[i])){
                actor[actorCount] = null;
                System.out.println("Taki aktor już istnieje w bazie");
                System.out.println("Obiekt nie został utworzony");
                actorCount--;
            }
        }

        if (actorCount == 10) {
            System.out.printf("Nie można utworzyć więcej aktorów!!!");
        }
        actorCount++;
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
        series[seriesCount].setGenre(Genre.convert(reader.scanText()).toString());

        System.out.println("Podaj opis: ");
        series[seriesCount].setDescription(reader.scanText());

        System.out.println("Podaj ocenę: ");
        series[seriesCount].setRating(reader.scanRating());
        if(series[seriesCount].getRating()==0){
            series[seriesCount] = null;
            System.out.println("Obiekt nie został utworzony");
            seriesCount--;
        }
        if(series[seriesCount].getGenre().equals("UNDEFINED")){
            series[seriesCount] = null;
            System.out.println("Podany gatunek jest nieprawidłowy! Dostępne gatunki to: Sci-fi, Akcja, Komedia, Thriller");
            System.out.println("Obiekt nie został utworzony");
            seriesCount--;
        }

        for (int i = 0; i < seriesCount; i++){
            if (series[seriesCount].equals(series[i])){
                series[seriesCount] = null;
                System.out.println("Taki serial już istnieje w bazie");
                System.out.println("Obiekt nie został utworzony");
                seriesCount--;
            }
        }


        seriesCount++;
        return series[seriesCount];
    }
}
