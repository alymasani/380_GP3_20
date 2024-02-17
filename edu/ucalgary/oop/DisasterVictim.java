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
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private static int counter = 0;

    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        if (ENTRY_DATE.charAt(4) != '-' || ENTRY_DATE.charAt(7) != '-' || ENTRY_DATE.length() != 10)
            throw new IllegalArgumentException("Invalid date format " + ENTRY_DATE);
        for (int j = 0; j < 4; j++) {
            char c = ENTRY_DATE.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("Invalid date format " + ENTRY_DATE);
        }
        for (int j = 5; j < 7; j++) {
            char c = ENTRY_DATE.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("Invalid date format or invalid date " + ENTRY_DATE);
        }
        for (int j = 8; j < 10; j++) {
            char c = ENTRY_DATE.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("Invalid date format or invalid date " + ENTRY_DATE);
        }
        int a = Character.getNumericValue(ENTRY_DATE.charAt(8));
        int b = Character.getNumericValue(ENTRY_DATE.charAt(9));
        if (a > 3 || a < 0 || b < 0 || b > 9 || (a == 3 && b > 1))
            throw new IllegalArgumentException("Invalid date format or invalid date " + ENTRY_DATE);

        int c = Character.getNumericValue(ENTRY_DATE.charAt(5));
        int d = Character.getNumericValue(ENTRY_DATE.charAt(6));
        if ((c == 1 && (d < 0 || d > 2)) || (c == 0 && (d < 0 || d > 9)))
            throw new IllegalArgumentException("Invalid date format or invalid date " + ENTRY_DATE);

        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IllegalArgumentException {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IllegalArgumentException {
        this.lastName = lastName;
    }


    public void setDateOfBirth(String dateOfBirth) {
        if (dateValidator(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }

    public void setAssignedSocialID(int ASSIGNED_SOCIAL_ID) {
        this.ASSIGNED_SOCIAL_ID = ASSIGNED_SOCIAL_ID;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnections = familyConnections;
    }

    public String getEntryDate() {
        return ENTRY_DATE;
    }

    public void setEntryDate(String ENTRY_DATE) {
        if (dateValidator(ENTRY_DATE)) {
            this.ENTRY_DATE = ENTRY_DATE;
        }
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }

    public void setPersonalBelongings(Supply[] personalBelongings) {
        this.personalBelongings = personalBelongings;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addFamilyConnection(FamilyRelation familyConnection) {
        if (familyConnections == null) {
            familyConnections = new FamilyRelation[1];
            familyConnections[0] = familyConnection;
        } else {
            FamilyRelation[] newFamilyConnections = new FamilyRelation[familyConnections.length + 1];
            System.arraycopy(familyConnections, 0, newFamilyConnections, 0, familyConnections.length);
            newFamilyConnections[familyConnections.length] = familyConnection;
            familyConnections = newFamilyConnections;
        }
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) {
        if (familyConnections != null) {
            for (int i = 0; i < familyConnections.length; i++) {
                if (familyConnections[i].equals(familyConnection)) {
                    removeFamilyConnectionAtIndex(i);
                    break;
                }
            }
        }
    }

    private void removeFamilyConnectionAtIndex(int index) {
        if (index < 0 || index >= familyConnections.length) {
            return;
        }
        FamilyRelation[] newArray = new FamilyRelation[familyConnections.length - 1];
        for (int i = 0, j = 0; i < familyConnections.length; i++) {
            if (i != index) {
                newArray[j++] = familyConnections[i];
            }
        }
        familyConnections = newArray;
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        if (medicalRecords == null) {
            medicalRecords = new MedicalRecord[1];
            medicalRecords[0] = medicalRecord;
        } else {
            MedicalRecord[] newMedicalRecords = new MedicalRecord[medicalRecords.length + 1];
            System.arraycopy(medicalRecords, 0, newMedicalRecords, 0, medicalRecords.length);
            newMedicalRecords[medicalRecords.length] = medicalRecord;
            medicalRecords = newMedicalRecords;
        }
    }

    public void addPersonalBelonging(Supply supply) {
        if (supply == null) {
            throw new IllegalArgumentException("Supply cannot be null");
        }

        if (personalBelongings == null) {
            personalBelongings = new Supply[1];
            personalBelongings[0] = supply;
        } else {
            Supply[] newPersonalBelongings = new Supply[personalBelongings.length + 1];
            System.arraycopy(personalBelongings, 0, newPersonalBelongings, 0, personalBelongings.length);
            newPersonalBelongings[personalBelongings.length] = supply;
            personalBelongings = newPersonalBelongings;
        }
    }

    public void removePersonalBelonging(Supply supplyToRemove) {
        if (supplyToRemove == null) {
            throw new IllegalArgumentException("Supply to remove cannot be null");
        }

        if (personalBelongings != null) {
            for (int i = 0; i < personalBelongings.length; i++) {
                if (personalBelongings[i].equals(supplyToRemove)) {
                    removePersonalBelongingAtIndex(i);
                    break;
                }
            }
        }
    }

    private void removePersonalBelongingAtIndex(int index) {
        if (index < 0 || index >= personalBelongings.length) {
            return;
        }
        Supply[] newArray = new Supply[personalBelongings.length - 1];
        for (int i = 0, j = 0; i < personalBelongings.length; i++) {
            if (i != index) {
                newArray[j++] = personalBelongings[i];
            }
        }
        personalBelongings = newArray;
    }

    private static boolean dateValidator(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date check = sdf.parse(date);
            return true;
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format or value: " + date);
        }
    }
}
