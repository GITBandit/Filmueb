package pl.filmueb.model;

public class Actor {

    private String name;
    private String surname;
    private String nationality;

    public Actor(String name, String surname, String nationality) {
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
    }

    public Actor(){

    }

    public void showInfo(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;

        Actor actor = (Actor) o;

        if (!name.equals(actor.name)) return false;
        if (!surname.equals(actor.surname)) return false;
        return nationality.equals(actor.nationality);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + nationality.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return

                "Imię : " + name +
                ", Nazwisko : " + surname +
                ", Narodowość : " + nationality +
                "\n";
    }
}
