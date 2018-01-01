package pl.filmueb.io;

import pl.filmueb.controller.ApplicationController;
import pl.filmueb.controller.exceptions.OperationNotExistsException;
import pl.filmueb.io.exceptions.IncorrectDataException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationIO {

    private Scanner scanner = new Scanner(System.in);

    public String scanText(){

        return scanner.nextLine();
    }

    public double scanRating() {
        try {
            double x = scanner.nextDouble();
            scanner.nextLine();
        return  x;
        } catch (InputMismatchException e){
            throw new IncorrectDataException();
        }
    }

    public int scanMenuChoice() throws OperationNotExistsException {
        int y =  scanner.nextInt();
        scanner.nextLine();
        return y;
    }

    public int scanSeriesEpisodes() throws IncorrectDataException {
        int z = scanner.nextInt();
        scanner.nextLine();
        return z;
    }






}
