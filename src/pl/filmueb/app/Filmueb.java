package pl.filmueb.app;

import pl.filmueb.controller.ApplicationController;
import pl.filmueb.model.Genre;

public class Filmueb {
    public static void main(String[] args) {

        System.out.println("Filmueb v0.3");

    ApplicationController controller = new ApplicationController();

    controller.mainLoop();

    }
}
