package pl.filmueb.data;

import java.util.Scanner;

public class ApplicationDatabase {

    public Actor[] actor = new Actor[10];
    public Movie[] movie = new Movie[10];
    public Series[] series = new Series[10];



    private Scanner scanner = new Scanner(System.in);

    public int movieCount;
    public Movie createMovie(){
        movie[movieCount] = new Movie ();

        System.out.println("Podaj tytuł filmu: ");
        movie[movieCount].setName(scanner.nextLine());

        System.out.println("Podaj reżysera filmu: ");
        movie[movieCount].setDirector(scanner.nextLine());

        System.out.println("Podaj rok w którym film był nagrany: ");
        movie[movieCount].setYear(scanner.nextLine());

        System.out.println("Podaj gatunek filmu: ");
        movie[movieCount].setGenere(scanner.nextLine());

        System.out.println("Podaj opis filmu: ");
        movie[movieCount].setDescription(scanner.nextLine());

        System.out.println("Podaj ocenę filmu: ");
        movie[movieCount].setRating(scanner.nextDouble());
        scanner.nextLine();
        if(movie[movieCount].getRating()==0){
            movie[movieCount] = null;
            movieCount--;}

        movieCount++;
        return movie[movieCount];
    }

    public int actorCount;
    public Actor createActor(){
        actor[actorCount] = new Actor();

        System.out.println("Podaj imię aktora: ");
        actor[actorCount].setName(scanner.nextLine());

        System.out.println("Podaj nazwisko aktora: ");
        actor[actorCount].setSurname(scanner.nextLine());

        System.out.println("Podaj narodowość aktora: ");
        actor[actorCount].setNationality(scanner.nextLine());

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
        series[seriesCount].setName(scanner.nextLine());

        System.out.println("Podaj liczbę sezonów: ");
        series[seriesCount].setNoOfSeries(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Podaj liczbę odcinków: ");
        series[seriesCount].setNoOfEpisodes(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Podaj producenta: ");
        series[seriesCount].setProducer(scanner.nextLine());

        System.out.println("Podaj gatunek: ");
        series[seriesCount].setGenre(scanner.nextLine());

        System.out.println("Podaj opis: ");
        series[seriesCount].setDescription(scanner.nextLine());

        System.out.println("Podaj ocenę: ");
        series[seriesCount].setRating(scanner.nextDouble());
        scanner.nextLine();
        if(series[seriesCount].getRating()==0){
            series[seriesCount] = null;}

        seriesCount++;
        return series[seriesCount];
    }
}
