package edu.ucalgary.oop;

public class Inquirer {
    private String firstName;
    private String lastName;
    private String info;
    private String servicesPhone;

    public Inquirer(String firstName, String lastName,
                    String servicesPhone, String info){
        this.firstName = firstName;
        this.lastName = lastName;
        this.servicesPhone = servicesPhone;
        this.info = info;
    }

    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getInfo(){return this.info;}
    public String getServicesPhoneNum(){return this.servicesPhone;}
}
