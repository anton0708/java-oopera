import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public void newActor(Actor newActor) {
        if(listOfActors.contains(newActor)) {
            System.out.println("Актер " + newActor.name + " уже есть в списке!");
        } else {
            this.listOfActors.add(newActor);
        }
    }

    public void changeActor(Actor newActor, String surname) {
        int index = -1;
        for(Actor a : listOfActors) {
            if(a.surname.equals(surname)) {
                index = listOfActors.indexOf(a);
            }
        }
        if(index > -1) {
            listOfActors.set(index, newActor);
        } else {
            System.out.println("Актера с фамилией " + surname + " не найден в списке!");
        }
    }

    public void getAllActors(){
        System.out.println("Актеры участвующие в шоу '" + title + "':");
        for(Actor actor : listOfActors){
            System.out.println(actor.name + " " + actor.surname + "(" + actor.height + ")");
        }
        System.out.println("-----------------");
    }

    public void getDirector() {
        System.out.println(director.name + " " + director.surname);
        System.out.println(" ");
    }
}
