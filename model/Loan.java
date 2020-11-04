package model;
import java.util.ArrayList;
public class Loan
{
    private int loanID;
    private String borrowDate;
    private int period;
    private boolean loanState;
    private Person person;
    private Copy copy;
    private Person loan;
    private ArrayList<Copy> copys;
    private ArrayList<Person> persons;

    public Loan(int loanID, String borrowDate,int period, boolean loanState)
    {
        this.loanID = loanID;
        this.borrowDate = borrowDate;
        this.period = period;
        this.loanState = loanState;
        copys = new ArrayList<>();
        persons = new ArrayList<>();
    }

    public int getLoanID(){
        return this.loanID;
    }

    public void setLoanID(int loanID){
        this.loanID = loanID;
    }

    public String getBorrowDate(){
        return this.borrowDate;
    }

    public void setBorrowDate(String borrowDate){
        this.borrowDate = borrowDate;
    }

    public int getPeriod(){
        return this.period;
    }

    public void setPeriod(int period){
        this.period = period;
    }
    
    public void addCopy(Copy copy) {
        copys.add(copy);
    }
    
    public void addPerson(Person person){
        persons.add(person);
    }
    
    public boolean loanState(){
        loanState = false;
        if(loanState = true){
            
        }
        
        return loanState;
    }
}
