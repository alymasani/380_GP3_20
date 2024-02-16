package edu.ucalgary.oop;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DisasterVictim {
    private String firstName;
    private String entryDate;
    private String dateOfBirth;
    private String lastName;
    private String gender;
    private String comments;
    private List<Supply> personalBelongings;
    private FamilyRelation[] familyConnections;
    private MedicalRecord[] medicalRecords;
    private static int socialIdCounter = 1000;

    public DisasterVictim(String firstName, String entryDate) {
        this.firstName = firstName;
        this.entryDate = entryDate;
        this.dateOfBirth = "";
        this.lastName = "";
        this.gender = "";
        this.comments = "";
        this.personalBelongings = new ArrayList<>();
        this.familyConnections = new FamilyRelation[0];
        this.medicalRecords = new MedicalRecord[0];
        this.socialIdCounter++;
    }

    public void setDateOfBirth(String dateOfBirth) {
        // Implement the logic to set the date of birth
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public int getAssignedSocialID() {
        return socialIdCounter;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnections = familyConnections;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public void addFamilyConnection(FamilyRelation relation) {
        // Implement the logic to add a family connection
    }

    public void removeFamilyConnection(FamilyRelation relation) {
        // Implement the logic to remove a family connection
    }

    public void addPersonalBelonging(Supply supply) {
        // Implement the logic to add a personal belonging
    }

    public void removePersonalBelonging(Supply supply) {
        // Implement the logic to remove a personal belonging
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongings.toArray(new Supply[0]);
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    // Additional methods and logic as needed for the class
}
