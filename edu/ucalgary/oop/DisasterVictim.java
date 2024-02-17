/**
 
@author  Aly Mohammed Masani <a href="mailto:alymohammed.masani@ucalgary.ca">
alymohammed.masani@ucalgary.ca</a>
@version 1.0
@since   1.0
*/

package edu.ucalgary.oop;

import edu.ucalgary.oop.*;

import java.util.List;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DisasterVictim {
    private String firstName;
    private String entryDate;
    private String dateOfBirth;
    private String lastName;
    private String gender;
    private String comments;
    private List<Supply> personalBelongings;
    private List<FamilyRelation> familyConnections;
    private MedicalRecord[] medicalRecords;
    private static int socialIdCounter = 1000;
    private int socialID;

    public DisasterVictim(String firstName, String entryDate) {
        this.firstName = firstName;
        this.entryDate = entryDate;
        this.dateOfBirth = "";
        this.lastName = "";
        this.gender = "";
        this.comments = "";
        this.personalBelongings = new ArrayList<>();
        this.familyConnections = new ArrayList<>();
        this.medicalRecords = new MedicalRecord[0];
        this.socialID = socialIdCounter++;
    }

    public static boolean dateValidator(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date check = sdf.parse(date);
            return true;
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format or value: " + date);
        }
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (dateValidator(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
        }
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
        return socialID;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String date) {
        if (dateValidator(date)) {
            this.entryDate = date;
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setFamilyConnections(List<FamilyRelation> familyConnections) {
        this.familyConnections = familyConnections;
    }

    public List<FamilyRelation> getFamilyConnections() {
        return familyConnections;
    }

    public void addFamilyConnection(FamilyRelation relation) {
        this.familyConnections.add(relation);
    }

    public void removeFamilyConnection(FamilyRelation relation) {
        this.familyConnections.remove(relation);
    }

    public void addPersonalBelonging(Supply supply) {
        this.personalBelongings.add(supply);
    }

    public void removePersonalBelonging(Supply supply) {
        this.personalBelongings.remove(supply);
    }

    public List<Supply> getPersonalBelongings() {
        return personalBelongings;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }
}
