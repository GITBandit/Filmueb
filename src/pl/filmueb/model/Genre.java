package pl.filmueb.model;

public enum Genre {
    SCI_FI("Sci-fi"),
    ACTION("Akcja"),
    COMEDY("Komedia"),
    THRILLER("Thriller"),
    UNDEFINED("Nie zdefiniowano");

    private final String genE;

    private Genre (String genE){
        this.genE = genE;
    }

    public static Genre convert (String g){
        switch (g) {
            case "Sci-fi":
                return SCI_FI;
            case "Akcja":
                return ACTION;
            case "Komedia":
                return COMEDY;
            case "Thriller":
                return THRILLER;
            default:
//                System.out.println("Podany gatunek jest nieprawidłowy! Dostępne gatunki to: Sci-fi, Akcja, Komedia, Thriller");
                return UNDEFINED;
        }

    }

    public static String convertBack(String s) {
        switch (s) {
            case "Sci_fi":
                return SCI_FI.genE;
            case "ACTION":
                return ACTION.genE;
            case "COMEDY":
                return COMEDY.genE;
            case "THRILLER":
                return THRILLER.genE;
            default:
                return UNDEFINED.genE;
        }

    }

}
