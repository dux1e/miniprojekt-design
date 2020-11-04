package controller;
import model.*;
import java.util.ArrayList;

public class LPController{
    private LPContainer lpContainer;

    public LPController(){
        lpContainer = LPContainer.getInstance();
    }

    public void createLP(int barCode,String title,String artist,
    String publicationDate,String genre){
        LP lp = new LP(barCode, title, artist, publicationDate, genre);
        lpContainer.addLP(lp);  
    }

    public String searchLP(){
        return null;
    }

    public String updateLP(){
        return null;
    }

    public String deleteLP(){
        return null;
    }
}
