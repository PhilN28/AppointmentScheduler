
public class Patient {
	private String fName;
	private String lName;
	private int patientID;
	private int dateOfBirth;
	/**
	 * @param fName
	 * @param lName
	 * @param patientID
	 * @param dateOfBirth
	 */
	public Patient(String fName, String lName, int patientID, int dateOfBirth) {
		this.fName = fName;
		this.lName = lName;
		this.patientID = patientID;
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 * @return the patientID
	 */
	public int getPatientID() {
		return patientID;
	}
	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	/**
	 * @return the dateOfBirth
	 */
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	} 
	
	public void printPatientInfo(int patientID)
	{
		System.out.println("Name: " + getfName() + " " + getlName() + " ID: " + getPatientID());
	}
}
