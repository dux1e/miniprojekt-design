package model;

public class Person
{
    private int personID;
    private String name;
    private int postalCode;
    private String city;
    private String phone;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int personID, int postalCode, String city, String phone)
    {
        this.personID = personID;
        this.name = name;
        this.postalCode = postalCode;
        this.city = city;
        this.phone = phone;
    }

    public int getPersonID(){
        return this.personID;
    }

    public void setPersonID(int personID){
        this.personID = personID;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPostalCode(){
        return this.postalCode;
    }

    public void setPostalCode(int postalCode){
        this.postalCode = postalCode;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getPhone(){
        return this.phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }

}
