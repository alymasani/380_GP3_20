/**
 * @author  Elias Poitras-Whitecalf <a href="mailto:elias.poitraswhiteca@ucalgary.ca">
 *          elias.poitraswhiteca@ucalgary.ca</a>
 * @version 1.0
 * @since   1.0
 */
package edu.ucalgary.oop;
/**
 * FamilyRelation is a class that shows relationships between two people in DisasterVictim.
 *
 */
public class FamilyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    public FamilyRelation(DisasterVictim personOne, String relationshipTo,
                          DisasterVictim personTwo){
        this.setRelationshipTo(relationshipTo);
        this.setPersonOne(personOne);
        this.setPersonTwo(personTwo);
    }

    public void setRelationshipTo(String relationshipTo){
        this.relationshipTo = relationshipTo;
    }

    public void setPersonOne(DisasterVictim personOne){
        this.personOne = personOne;
    }

    public void setPersonTwo(DisasterVictim personTwo){
        this.personTwo = personTwo;
    }

    public DisasterVictim getPersonOne(){return this.personOne;}
    public DisasterVictim getPersonTwo(){return this.personTwo;}
    public String getRelationshipTo(){return this.relationshipTo;}
}
