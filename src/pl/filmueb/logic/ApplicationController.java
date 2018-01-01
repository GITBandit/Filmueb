package pl.filmueb.logic;

import pl.filmueb.data.ApplicationDatabase;
import pl.filmueb.data.Option;


public class ApplicationController {

    void mainLoop(){

        ConsoleDataReader reader = new ConsoleDataReader();
        ApplicationDatabase database = new ApplicationDatabase();

        int n;

        for(int i = 1; i==1;) {
            System.out.println(Option.option1 + Option.option2 + Option.option3 + Option.option4 + Option.option5);
            n = reader.scanMenuChoice();
            if (n == 5) {
                System.out.println("Do zobaczenia!");
                break;
            }


            switch (n) {
                case 1:
                    database.createMovie();
                    break;
                case 2:
                    database.creteTvSeries();
                    break;
                case 3:
                    database.createActor();
                    break;
                case 4:
                    for (int z=0; z<database.actorCount;z++ ){
                        System.out.println("Aktor "+(z+1));
                        System.out.printf("Imię %s, Nazwisko: %s, Narodowość: %s \n", database.actor[z].getName(), database.actor[z].getSurname(), database.actor[z].getNationality());
                    }
                    for (int x=0; x<database.movieCount;x++){
                        System.out.println("Film "+(x+1));
                        System.out.printf("Tytuł: %s, Reżyser: %s, Rok: %s, Gatunek: %s \nOpis: %s\nOcena: %.2f \n", database.movie[x].getName(), database.movie[x].getDirector(), database.movie[x].getYear(), database.movie[x].getGenre(), database.movie[x].getDescription(), database.movie[x].getRating());
                    }
                    for (int c=0; c<database.seriesCount;c++){
                        System.out.println("Serial "+(c+1));
                        System.out.printf("Tytuł: %s, Liczba sezonów: %d, Liczba odcinków: %d \nProducent: %s, Gatunek: %s \nOpis: %s \nOcena: %.2f \n", database.series[c].getName(), database.series[c].getNoOfSeries(), database.series[c].getNoOfEpisodes(), database.series[c].getProducer(), database.series[c].getGenre(), database.series[c].getDescription(), database.series[c].getRating());
                    }
                    break;
                default:
                    System.out.println("Opcja niedozwolona, spróbuj jeszcze raz.");
            }

        }

    }
}
