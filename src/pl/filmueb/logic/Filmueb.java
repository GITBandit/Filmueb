package pl.filmueb.logic;

import pl.filmueb.data.Actor;
import pl.filmueb.data.ApplicationDatabase;
import pl.filmueb.data.Movie;
import pl.filmueb.data.Series;

import java.util.Scanner;

public class Filmueb {
    public static void main(String[] args) {

        System.out.println("Filmueb v0.1");

        Scanner scanner = new Scanner(System.in);

        ConsoleDataReader reader = new ConsoleDataReader();
        ApplicationDatabase database = new ApplicationDatabase();

        int n;

        for(int i = 1; i==1;) {
            System.out.println("\nWybierz opcję:\n" +
                    "1 - Dodaj film\n" +
                    "2 - Dodaj serial\n" +
                    "3 - Dodaj aktora\n" +
                    "4 - Wyświetl wszystkie informacje\n" +
                    "5 - Wyjdź\n"
            );
            n = scanner.nextInt();
            scanner.nextLine();
            if (n == 5) {
                System.out.println("Do zobaczenia!");
                break;
            }


            switch (n) {
                case 1:
                    database.createMovie();
                    if(database.movie[database.movieCount] == null ){
                        System.out.println("Obiekt nie został utworzony.");
                    }
                    break;
                case 2:
                    database.creteTvSeries();
                    if (database.series[database.seriesCount] == null) {
                        System.out.println("Obiekt nie został utworzony.");
                    }
                    break;
                case 3:
                    database.createActor();
                    //    Actor actorName = actorTest;         // referencja testowa - wpisujemy obiekt do przetestowania
                    break;
                case 4:
                    for (int z=0; z<database.actorCount;z++ ){
                        System.out.println("Aktor "+(z+1));
                        System.out.printf("Imię %s, Nazwisko: %s, Narodowość: %s \n", database.actor[z].getName(), database.actor[z].getSurname(), database.actor[z].getNationality());
                    }
                    for (int x=0; x<database.movieCount;x++){
                        System.out.println("Film "+(x+1));
                        System.out.printf("Tytuł: %s, Reżyser: %s, Rok: %s, Gatunek: %s \nOpis: %s\nOcena: %.2f \n", database.movie[x].getName(), database.movie[x].getDirector(), database.movie[x].getYear(), database.movie[x].getGenere(), database.movie[x].getDescription(), database.movie[x].getRating());
                    }
                    for (int c=0; c<database.seriesCount;c++){
                        System.out.println("Serial "+(c+1));
                        System.out.printf("Tytuł: %s, Liczba sezonów: %d, Liczba odcinków: %d \nProducent: %s, Gatunek: %s \nOpis: %s \nOcena: %.2f \n", database.series[c].getName(), database.series[c].getNoOfSeries(), database.series[c].getNoOfEpisodes(), database.series[c].getProducer(), database.series[c].getGenre(), database.series[c].getDescription(), database.series[c].getRating());
                    }
                    break;
            }

        }


    }
}
