package model;
import java.util.ArrayList;
public class LPContainer{
    private static LPContainer instance;
    private ArrayList<LP> lps;
  
    public LPContainer(){
        lps = new ArrayList<>();
    }
    
    public static LPContainer getInstance(){
        if(instance == null) {
            instance = new LPContainer();
        }
        return instance;
    }
    
    public void addLP(LP lp){
        lps.add(lp);
    }
}
