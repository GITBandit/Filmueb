package pl.filmueb.logic;

import pl.filmueb.data.Actor;
import pl.filmueb.data.ApplicationDatabase;
import pl.filmueb.data.Movie;
import pl.filmueb.data.Series;

import java.util.Scanner;

public class Filmueb {
    public static void main(String[] args) {

        System.out.println("Filmueb v0.3");

    ApplicationController controller = new ApplicationController();

    controller.mainLoop();


    }
}
