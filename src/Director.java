public class Director extends Person {
    protected int numbersOfShows;

    Director(String name, String surname, Gender gender, int numbersOfShows) {
        super.name = name;
        super.surname = surname;
        super.gender = gender;
        this.numbersOfShows = numbersOfShows;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", numbersOfShows=" + numbersOfShows +
                '}';
    }
}
