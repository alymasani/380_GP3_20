/**
 * @author  Sabrina Li <a href="mailto:sabrina.li1@ucalgary.ca">
 *          sabrina.li1@ucalgary.ca</a>
 * @version 1.0
 * @since   1.0
*/

package edu.ucalgary.oop;

/**
 * MedicalRecord is a class that keeps track of the treatment a DisasterVictim has received.
 * It records the Location and the date of the treatment as well.
*/

public class MedicalRecord {
	private Location location;
	private String treatmentDetails;
	private String dateOfTreatment;
	
	//getters
	public Location getLocation() {
		return this.location;
	}
	
	public String getTreatmentDetails() {
		return this.treatmentDetails;
	}
	
	public String getDateOfTreatment() {
		return this.dateOfTreatment;
	}
	
	//setters
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public void setTreatmentDetails(String treatmentDetails) {
		this.treatmentDetails = treatmentDetails;
	}
	
	public void setDateOfTreatment(String dateOfTreatment) {
		this.dateOfTreatment = dateOfTreatment;
	}
	
	//constructors
	MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
		this.location = location;
		this.treatmentDetails = treatmentDetails;
		dateValidity(dateOfTreatment);
		this.dateOfTreatment = dateOfTreatment;
	}
	
	//helpers
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
