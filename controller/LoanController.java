package controller;
import model.*;
import java.util.ArrayList;

public class LoanController{
    private LoanContainer loanContainer;

    public LoanController(){
        loanContainer = LoanContainer.getInstance();
    }

    public void createLoan(int loanID, String borrowDate,int period){
        Loan loan = new Loan(loanID, borrowDate, period, false);
        loanContainer.addLoan(loan);
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
