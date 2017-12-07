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
        newMovie.setName(scanner.nextLine());

        System.out.println("Podaj reżysera filmu: ");
        newMovie.setDirector(scanner.nextLine());

        System.out.println("Podaj rok w którym film był nagrany: ");
        newMovie.setYear(scanner.nextLine());

        System.out.println("Podaj gatunek filmu: ");
        newMovie.setGenere(scanner.nextLine());

        System.out.println("Podaj opis filmu: ");
        newMovie.setDescription(scanner.nextLine());

        System.out.println("Podaj ocenę filmu: ");
        newMovie.setRating(scanner.nextDouble());
        scanner.nextLine();
        if(newMovie.getRating()==0){
            newMovie = null;}

        return newMovie;
    }

    Actor createActor(){
        Actor newActor = new Actor();

        System.out.println("Podaj imię aktora: ");
        newActor.setName(scanner.nextLine());

        System.out.println("Podaj nazwisko aktora: ");
        newActor.setSurname(scanner.nextLine());

        System.out.println("Podaj narodowość aktora: ");
        newActor.setNationality(scanner.nextLine());

        return newActor;

    }

    Series creteTvSeries(){
        Series newSeries = new Series();

        System.out.println("Podaj nazwę serialu: ");
        newSeries.setName(scanner.nextLine());

        System.out.println("Podaj liczbę sezonów: ");
        newSeries.setNoOfSeries(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Podaj liczbę odcinków: ");
        newSeries.setNoOfEpisodes(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Podaj producenta: ");
        newSeries.setProducer(scanner.nextLine());

        System.out.println("Podaj gatunek: ");
        newSeries.setGenre(scanner.nextLine());

        System.out.println("Podaj opis: ");
        newSeries.setDescription(scanner.nextLine());

        System.out.println("Podaj ocenę: ");
        newSeries.setRating(scanner.nextDouble());
        scanner.nextLine();
        if(newSeries.getRating()==0){
            newSeries = null;}

        return newSeries;
    }

}
