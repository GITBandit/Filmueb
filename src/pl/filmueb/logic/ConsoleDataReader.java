package pl.filmueb.logic;

import pl.filmueb.data.Actor;
import pl.filmueb.data.Movie;
import pl.filmueb.data.Series;

import java.util.Scanner;

public class ConsoleDataReader {

    Scanner scanner = new Scanner(System.in);

    Movie createMovie(){
        Movie newMovie = new Movie ();

        System.out.println("Podaj tytuł filmu: ");
        String name = scanner.nextLine();
        newMovie.setName(name);

        System.out.println("Podaj reżysera filmu: ");
        String director = scanner.nextLine();
        newMovie.setDirector(director);

        System.out.println("Podaj rok w którym film był nagrany: ");
        String year = scanner.nextLine();
        newMovie.setYear(year);

        System.out.println("Podaj gatunek filmu: ");
        String genre = scanner.nextLine();
        newMovie.setGenere(genre);

        System.out.println("Podaj opis filmu: ");
        String description = scanner.nextLine();
        newMovie.setDescription(description);

        System.out.println("Podaj ocenę filmu: ");
        double rating = scanner.nextDouble();
        scanner.nextLine();
        newMovie.setRating(rating);
        if(newMovie.getRating()==0){
            newMovie = null;}

        return newMovie;
    }

    Actor createActor(){
        Actor newActor = new Actor();

        System.out.println("Podaj imię aktora: ");
        String name = scanner.nextLine();
        newActor.setName(name);

        System.out.println("Podaj nazwisko aktora: ");
        String surname = scanner.nextLine();
        newActor.setSurname(surname);

        System.out.println("Podaj narodowość aktora: ");
        String nationality = scanner.nextLine();
        newActor.setNationality(nationality);

        return newActor;

    }

    Series creteTvSeries(){
        Series newSeries = new Series();

        System.out.println("Podaj nazwę serialu: ");
        String name = scanner.nextLine();
        newSeries.setName(name);

        System.out.println("Podaj liczbę sezonów: ");
        int noOfSeries = scanner.nextInt();
        scanner.nextLine();
        newSeries.setNoOfSeries(noOfSeries);

        System.out.println("Podaj liczbę odcinków: ");
        int noOfEpisodes = scanner.nextInt();
        scanner.nextLine();
        newSeries.setNoOfEpisodes(noOfEpisodes);

        System.out.println("Podaj producenta: ");
        String producer = scanner.nextLine();
        newSeries.setProducer(producer);

        System.out.println("Podaj gatunek: ");
        String genre = scanner.nextLine();
        newSeries.setGenre(genre);

        System.out.println("Podaj opis: ");
        String description = scanner.nextLine();
        newSeries.setDescription(description);

        System.out.println("Podaj ocenę: ");
        double rating = scanner.nextDouble();
        scanner.nextLine();
        newSeries.setRating(rating);
        if(newSeries.getRating()==0){
            newSeries = null;}

        return newSeries;
    }

}
