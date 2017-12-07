package pl.filmueb.logic;

import pl.filmueb.data.Actor;
import pl.filmueb.data.Movie;
import pl.filmueb.data.Series;

import java.util.Scanner;

public class Filmueb {
    public static void main(String[] args) {

        System.out.println("Filmueb v0.1");

        Scanner scanner = new Scanner(System.in);

        ConsoleDataReader reader = new ConsoleDataReader();

        int n = 0;

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
                    reader.createMovie();
                    if(reader.movie[reader.movieCount] == null ){
                        System.out.println("Obiekt nie został utworzony.");
                    }
                    break;
                case 2:
                    reader.creteTvSeries();
                    if (reader.series[reader.seriesCount] == null) {
                        System.out.println("Obiekt nie został utworzony.");
                    }
                    break;
                case 3:
                    reader.createActor();
                    //    Actor actorName = actorTest;         // referencja testowa - wpisujemy obiekt do przetestowania
                    break;
                case 4:
                    for (int z=0; z<reader.actorCount;z++ ){
                        System.out.println("Aktor "+(z+1));
                        System.out.printf("Imię %s, Nazwisko: %s, Narodowość: %s \n", reader.actor[z].getName(), reader.actor[z].getSurname(), reader.actor[z].getNationality());
                    }
                    for (int x=0; x<reader.movieCount;x++){
                        System.out.println("Film "+(x+1));
                        System.out.printf("Tytuł: %s, Reżyser: %s, Rok: %s, Gatunek: %s \nOpis: %s\nOcena: %.2f \n", reader.movie[x].getName(), reader.movie[x].getDirector(), reader.movie[x].getYear(), reader.movie[x].getGenere(), reader.movie[x].getDescription(), reader.movie[x].getRating());
                    }
                    for (int c=0; c<reader.seriesCount;c++){
                        System.out.println("Serial "+(c+1));
                        System.out.printf("Tytuł: %s, Liczba sezonów: %d, Liczba odcinków: %d \nProducent: %s, Gatunek: %s \nOpis: %s \nOcena: %.2f \n", reader.series[c].getName(), reader.series[c].getNoOfSeries(), reader.series[c].getNoOfEpisodes(), reader.series[c].getProducer(), reader.series[c].getGenre(), reader.series[c].getDescription(), reader.series[c].getRating());
                    }
                    break;
            }

        }


    }
}
