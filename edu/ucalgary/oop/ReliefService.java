/**
 * @author  Sabrina Li <a href="mailto:sabrina.li1@ucalgary.ca">
 *          sabrina.li1@ucalgary.ca</a>
 * @version 1.0
 * @since   1.0
*/

package edu.ucalgary.oop;

import java.util.regex.*;
import java.time.year;

/**
 * ReliefService is a class that helps an Inquirer record information about a
 * DisasterVictim they are looking for. It keeps track of who's looking for who and
 * provides a way of recording information about missing people.
*/

public class ReliefService() {
	private Inquirer inquirer;
	private DisasterVictim missingPerson;
	private String dateOfInquiry;
	private String infoProvided;
	private Location lastKnownLocation;
	
	//getters
	public Inquirer getInquirer() {
		return this.inquirer;
	}
	
	public DisasterVictim getMissingPerson() {
		return this.missingPerson;
	}
	
	public String getDateOfInquiry() {
		return this.dateOfInquiry;
	}
	
	public String getInfoProvided() {
		return this.infoProvided;
	}
	
	public Location getLastKnownLocation() {
		return this.lastKnownLocation;
	}
	
	//setters
	public setInquirer(Inquirer inquirer) {
		this.inquirer = inquirer;
	}
	
	public setMissingPerson(DisasterVictim missingPerson) {
		this.missingPerson = missingPerson;
	}
	
	public setDateOfInquiry(String dateOfInquiry) {
		dateValidity(dateOfInquiry);
		
		this.dateOfInquiry = dateOfInquiry;
	}
	
	public setInfoProvided(String infoProvided) {
		this.infoProvided = infoProvided;
	}
	
	public setLastKnownLocation(Location lastKnownLocation) {
		this.lastKnownLocation = lastKnownLocation;
	}
	
	//constructors
	ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry,
				  String infoProvided, Location lastKnownLocation)
	{
		this.inquirer = inquirer;
		this.missingPerson = missingPerson;
		dateValidity(dateOfInquiry);
		this.dateOfInquiry = dateOfInquiry;
		this.infoProvided = infoProvided;
		this.lastKnownLocation = lastKnownLocation;
	}
	
	//helpers
	public String getLogDetails() {
		String logDetails = "Inquirer: " + this.inquirer.getFirstName() +
							", Missing Person: " + this.missingPerson.getFirstName() + " " + this.missingPerson.getLastName() +
							", Date of Inquiry: " + this.getDateOfInquiry() +
							", Info Provided: " + this.getInfoProvided() +
							", Last Known Location: " + this.lastKnownLocation.getName();
		return logDetails;
	}
	
	private String expectedLogDetails = "Inquirer: John, Missing Person: Jane Alex, Date of Inquiry: 2024-02-10,
	Info Provided: Looking for family member, Last Known Location: University of Calgary"; 
	
	/**
	 * @param date should be in the form ****-**-** in the order of year-month-day
	 * @param date year bounds can be adjusted in yearLowerLim and yearUpperLim variables 
	 * @throws IllegalArgumentException if the value does not match the specified format
	*/
	public void dateValidity (String date) {
		//date pattern in the form of ****-**-** where * are digits in the order of year-month-day
		Pattern dateFormat = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
		Matcher dateFormatMatcher = dateFormat.matcher(date);
		if (!dateFormatMatcher.matches()) {
			throw new IllegalArgumentException("Date does not match required format of ****-**-**.");
		}
		
		//adjustable bounds for year
		final int yearLowerLim = 2000;
		final int yearUpperLim = 3000;
		
		//check if values are in bounds
		String[] dateSplit = date.split('-');
		
		int year = Integer.parseInt(dateSplit[0]);
		if ((year < yearLowerLim) || (year > yearUpperLim)) {
			throw new IllegalArgumentException("Year is out of bounds.");
		}
		int month = Integer.parseInt(dateSplit[1]);
		if ((month < 1) || (month > 12)) {
			throw new IllegalArgumentException("Month is out of bounds.");
		}
		
		//if certain months-------------------------------------
		int day = Integer.parseInt(dateSplit[2]);
		if ((day < 1) || (day > 31)) {
			throw new IllegalArgumentException("Day is out of bounds.");
		}
		
		//if february
		if (month == 02) {
			if (day > 29) {
				throw new IllegalArgumentException("Day is out of bounds. Date does not exist in February.");
			}
			//if not leap year
			if (!Year.isLeap(year) && (day == 29)) {
				throw new IllegalArgumentException("Day is out of bounds. It is not a leap year.");
			}
		}
	}
}
