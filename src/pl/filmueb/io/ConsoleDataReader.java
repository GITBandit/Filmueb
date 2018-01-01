package pl.filmueb.io;

import java.util.Scanner;

public class ConsoleDataReader {

    private Scanner scanner = new Scanner(System.in);

    public String scanText(){

        return scanner.nextLine();
    }

    public double scanRating(){
        double x = scanner.nextDouble();
        scanner.nextLine();
        return  x;
    }

    public int scanMenuChoice(){
        int y =  scanner.nextInt();
        scanner.nextLine();
        return y;
    }

    public int scanSeriesEpisodes(){
        int z = scanner.nextInt();
        scanner.nextLine();
        return z;
    }






}
