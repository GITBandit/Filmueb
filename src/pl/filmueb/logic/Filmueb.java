package pl.filmueb.logic;

import pl.filmueb.data.Actor;
import pl.filmueb.data.Movie;
import pl.filmueb.data.Series;

public class Filmueb {
    public static void main(String[] args) {

        System.out.println("Filmueb v0.1");

/*
        Actor actor1 = new Actor("Angelina","Jolie","Stany Zjednoczone");

        Movie movie1 = new Movie("Pan i Pani Smith", "Doug Liman", "2005", "Akcja","Film o parze płatnych zabójców.",4);

        Series series1 = new Series("Breaking Bad",5, 62, "Vince Gilligan", "Kryminał", "Serial o produkcji narkotyów.", 4.5);


        System.out.printf("Tytuł: %s, Reżyser: %s, Rok: %s, Gatunek: %s \nOpis: %s\nOcena: %.2f \n", movie1.getName(), movie1.getDirector(), movie1.getYear(), movie1.getGenere(), movie1.getDescription(), movie1.getRating());

        System.out.printf("Imię %s, Nazwisko: %s, Narodowość: %s \n",actor1.getName(), actor1.getSurname(), actor1.getNationality());

        System.out.printf("Tytuł: %s, Liczba sezonów: %d, Liczba odcinków: %d \nProducent: %s, Gatunek: %s \nOpis: %s \nOcena: %.2f \n", series1.getName(), series1.getNoOfSeries(), series1.getNoOfEpisodes(), series1.getProducer(), series1.getGenere(), series1.getDescription(), series1.getRating());
*/


        ConsoleDataReader reader = new ConsoleDataReader();

/*        Movie movieTest = reader.createMovie();
        Movie movieName = movieTest;         // referencja testowa - wpisujemy obiekt do przetestowania
        if(movieName == null ){
            System.out.println("Obiekt nie został utworzony.");
        } else {
            System.out.printf("Tytuł: %s, Reżyser: %s, Rok: %s, Gatunek: %s \nOpis: %s\nOcena: %.2f \n", movieName.getName(), movieName.getDirector(), movieName.getYear(), movieName.getGenere(), movieName.getDescription(), movieName.getRating());
        }*/

/*
        Actor actorTest = reader.createActor();
        Actor actorName = actorTest;         // referencja testowa - wpisujemy obiekt do przetestowania
        System.out.printf("Imię %s, Nazwisko: %s, Narodowość: %s \n",actorName.getName(), actorName.getSurname(), actorName.getNationality());
*/


        Series seriesTest = reader.creteTvSeries();
        Series seriesName = seriesTest;      // referencja testowa - wpisujemy obiekt do przetestowania
        if (seriesName == null) {
            System.out.println("Obiekt nie został utworzony.");
        } else {
            System.out.printf("Tytuł: %s, Liczba sezonów: %d, Liczba odcinków: %d \nProducent: %s, Gatunek: %s \nOpis: %s \nOcena: %.2f \n", seriesName.getName(), seriesName.getNoOfSeries(), seriesName.getNoOfEpisodes(), seriesName.getProducer(), seriesName.getGenre(), seriesName.getDescription(), seriesName.getRating());
        }
    }
}
