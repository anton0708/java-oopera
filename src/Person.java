public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    Person(){
    }

    Person(String name, String surname, Gender gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}
