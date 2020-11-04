package model;  
import java.util.ArrayList;

public class PersonContainer{
    private static PersonContainer instance;
    private ArrayList<Person> persons;

    public PersonContainer(){
        persons = new ArrayList<>();
    }

    public static PersonContainer getInstance(){
        if(instance == null) {
            instance = new PersonContainer();
        }
        return instance;
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public Person findPerson(int personID){
        int i= 0;
        boolean found = false;
        Person personSearch = null;
        while(!found && i<persons.size()){
            personSearch = persons.get(i);
            if(personSearch.getPersonID() == personID){
                found= true;
            }
            else{
                i++;
            }
        }
        if(found){
            return personSearch; 
        }
        else{
            System.out.println("Personen blev ikke fundet.");
            return null;
        }

    }
}
