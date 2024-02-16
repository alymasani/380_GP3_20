/**
 * @author  Elias Poitras-Whitecalf <a href="mailto:elias.poitraswhiteca@ucalgary.ca">
 *          elias.poitraswhiteca@ucalgary.ca</a>
 * @version 1.0
 * @since   1.0
 */
package edu.ucalgary.oop;
/**
 * this is for an inquirer looking into a disaster victim and has the inquireres fname lname info and
 * phonenum
 */
public class Inquirer {
    private String firstName;
    private String lastName;
    private String info;
    private String servicePhone;

    public Inquirer(String firstName, String lastName,
                    String servicePhone, String info){
        this.firstName = firstName;
        this.lastName = lastName;
        this.servicePhone = servicePhone;
        this.info = info;
    }

    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getInfo(){return this.info;}
    public String getServicePhone(){return this.servicePhone;}
}
