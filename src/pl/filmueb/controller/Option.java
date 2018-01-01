package pl.filmueb.controller;

public enum Option {

    option1("1 - Dodaj film\n"),
    option2("2 - Dodaj serial\n"),
    option3("3 - Dodaj aktora\n"),
    option4("4 - Wyświetl wszystkie informacje\n"),
    option5("5 - Wyjdź\n"),
    optionErr("Opcja niedozwolona, spróbuj jeszcze raz.");

    private final String choice;

    Option (String choice){
        this.choice = choice;
    }

    @Override
    public String toString() {
        return choice ;
    }

    public static Option choiceToEnum(int n){
        switch (n){
            case 1:
                return option1;
            case 2:
                return option2;
            case 3 :
                return option3;
            case 4:
                return option4;
            case 5:
                return option5;
            default:
                return optionErr;

        }


    }

}
