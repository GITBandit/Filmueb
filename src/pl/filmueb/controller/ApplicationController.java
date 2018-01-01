package pl.filmueb.controller;

import pl.filmueb.data.ApplicationDatabase;
import pl.filmueb.io.ApplicationIO;


public class ApplicationController {

    public void mainLoop(){

        ApplicationIO reader = new ApplicationIO();
        ApplicationDatabase database = new ApplicationDatabase();

        int n;

        for(int i = 1; i==1;) {
            System.out.println(Option.option1.toString() + Option.option2.toString() + Option.option3.toString() + Option.option4.toString() + Option.option5.toString());
            n = reader.scanMenuChoice();
            if (n == 5) {
                System.out.println("Do zobaczenia!");
                break;
            }


            switch (Option.choiceToEnum(n)) {
                case option1:
                    database.createMovie();
                    break;
                case option2:
                    database.creteTvSeries();
                    break;
                case option3:
                    database.createActor();
                    break;
                case option4:
                    for (int z=0; z<database.actorCount;z++ ){
                        System.out.println("Aktor "+(z+1));
                        System.out.printf(database.actor[z].toString());
                    }
                    for (int x=0; x<database.movieCount;x++){
                        System.out.println("Film "+(x+1));
                        System.out.printf(database.movie[x].toString());
                    }
                    for (int c=0; c<database.seriesCount;c++){
                        System.out.println("Serial "+(c+1));
                        System.out.printf(database.series[c].toString());
                    }
                    break;
                default:
                    System.out.println("Opcja niedozwolona, spróbuj jeszcze raz.");
            }

        }

    }
}
