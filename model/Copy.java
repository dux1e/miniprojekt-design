package model;
public class Copy {
    // Instance Variables
    private int serialNr;
    private String purchaseDate;
    private double purchasePrice;
    
    public Copy(int serialNr, String purchaseDate, double purchasePrice) {
        this.serialNr = serialNr;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }

    public void setSerialNr(int serialNr) {
        this.serialNr = serialNr;
    }

    public int getSerialNr() {
        return serialNr;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }
}