package model;
import java.util.ArrayList;
public class LP {
    private int barCode;
    private String title;
    private String artist;
    private String publicationDate;
    private String genre;
    private ArrayList<Copy> copys;
    
    public LP(int barCode,String title,String artist,
              String publicationDate,String genre){
        this.barCode = barCode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        this.genre = genre;
        copys = new ArrayList<>();
    }

    public int getBarCode(){
        return this.barCode;
    }

    public void setBarCode(int barCode){
        this.barCode = barCode;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getArtist(){
        return this.artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getPublicationDate(){
        return this.publicationDate;
    }

    public void setPublicationDate(String publicationDate){
        this.publicationDate = publicationDate;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
    
    public void addCopy(Copy copy) {
        copys.add(copy);
    }
    
    public void createCopy(int serialNr, String purchaseDate, double purchasePrice) {
        Copy copy = new Copy(serialNr, purchaseDate, purchasePrice);
        copys.add(copy);
    }
    
    public Copy findCopy(int searchString){
        int i= 0;
        boolean found = false;
        Copy copy = null;
        while(!found && i<copys.size()){
            copy = copys.get(i);
            if(copy.getSerialNr()== searchString){
                found= true;
            }
            else{
                i++;
            }
        }
        if(found){
            return copy; 
        }
        else{
            System.out.println("Eksemplaret blev ikke fundet.");
            return null;
        }
        
        
    }
}
