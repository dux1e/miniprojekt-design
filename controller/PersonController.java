package controller;
import model.*;
import java.util.ArrayList;
public class PersonController{
    // instance variables - replace the example below with your own
    private PersonContainer personContainer;

    public PersonController(){
        // initialise instance variables
        personContainer = PersonContainer.getInstance();
    }

    public void createPerson(String name, int personID, int postalCode, String city, String phone){
        Person person = new Person(name,personID, postalCode, city, phone);
        personContainer.addPerson(person);
    }

    public Person findPerson(int personID){
        return personContainer.findPerson(personID);
    }

    public String updatePerson(){
        return null;
    }

    public String deletePerson(){
        return null;
    }
}
