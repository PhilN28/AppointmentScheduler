
public class Doctor {
	private String docfName;
	private String doclName; 
	private int docID; 
	private String speciality;
	/**
	 * @param docfName
	 * @param doclName
	 * @param docID
	 * @param speciality
	 */
	public Doctor(String docfName, String doclName, int docID, String speciality) {
		this.docfName = docfName;
		this.doclName = doclName;
		this.docID = docID;
		this.speciality = speciality;
	}
	/**
	 * @return the docfName
	 */
	public String getDocfName() {
		return docfName;
	}
	/**
	 * @param docfName the docfName to set
	 */
	public void setDocfName(String docfName) {
		this.docfName = docfName;
	}
	/**
	 * @return the doclName
	 */
	public String getDoclName() {
		return doclName;
	}
	/**
	 * @param doclName the doclName to set
	 */
	public void setDoclName(String doclName) {
		this.doclName = doclName;
	}
	/**
	 * @return the docID
	 */
	public int getDocID() {
		return docID;
	}
	/**
	 * @param docID the docID to set
	 */
	public void setDocID(int docID) {
		this.docID = docID;
	}
	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}
	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
}
