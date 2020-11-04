package controller;
import model.*;
import java.util.ArrayList;

public class LoanController{
    private LoanContainer loanContainer;
    private PersonContainer personContainer;

    public LoanController(){
        loanContainer = LoanContainer.getInstance();
    }

    public void createLoan(int loanID, String borrowDate,int period){
        Loan loan = new Loan(loanID, borrowDate, period, false);
        loanContainer.addLoan(loan);
    }
    
        public void createPerson(String name, int personID, int postalCode, String city, String phone){
        Person person = new Person(name,personID, postalCode, city, phone);
        personContainer.addPerson(person);
    }

    public String searchLoan(){
        return null;
    }

    public String updateLoan(){
        return null;
    }

    public String deleteLoan(){
        return null;
    }
}
