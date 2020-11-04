package controller;
import model.*;
import java.util.ArrayList;
public class PersonController{
    private PersonContainer personContainer;

    public PersonController(){
        personContainer = PersonContainer.getInstance();
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
