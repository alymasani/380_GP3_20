package edu.ucalgary.oop;

import java.security.PublicKey;

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
