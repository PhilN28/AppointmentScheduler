
import java.util.*;
public class Clinic {
	private Doctor aDoctor; 
	private Patient aPatient; 
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>(); 
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private HashMap<String, Patient> appointments = new HashMap<String, Patient>();
	Scanner scan = new Scanner(System.in);
	private String response;
	
	public Clinic() {
		addDoctors();
		addPatients();
	
		System.out.println("Welcome to the UGA Clinic!");
		int option; 
		response = "n";
		while (response.equals("n")) {
		System.out.println("Enter a number >");
		System.out.println("1: Book an appointment");
		System.out.println("2: Sign up as new patient");
		System.out.println("3: View current doctors");
		
		option = scan.nextInt();

		switch(option) {
			case 1: 
				bookAppointment();
				break;
			case 2: 
				signUp();
				break;
			case 3: 
				viewDoctors();
				break;	
		}
		
		System.out.println("Are you done? (y/n)");
		response = scan.next();
		
				if (response.equals("y")) {
					System.out.println("Thank you for visiting the UGA Clinic!");
				}
		}
	}
	
	private void addDoctors() {
		//Add doctors here 
		Doctor doctor1 = new Doctor("Phillip", "Nguyen", 101, "Pediatrics");
		Doctor doctor2 = new Doctor("Trung", "Phan", 121, "Gynecology");
		Doctor doctor3 = new Doctor("Benedict", "Maltusch", 111, "Neurology");
		Doctor doctor4 = new Doctor("Jose", "Trujillo", 195, "General");
		
		doctors.add(doctor1);
		doctors.add(doctor2);
		doctors.add(doctor3);
		doctors.add(doctor4);
	}
	
	private void addPatients() { 
		//Add patients here
		Patient patient1 = new Patient("Aditya", "Mehta", 1102, 32197);
		Patient patient2 = new Patient("Tina", "Phan", 1117, 90597);
		Patient patient3 = new Patient("Michelle", "Nguyen", 1522, 50897);
		Patient patient4 = new Patient("Noah", "Andrews", 1875, 12197);
		Patient patient5 = new Patient("Ulises", "Rodgriguez", 1198, 22899);
		
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		patients.add(patient4);
		patients.add(patient5);
		
	}
	
	public void bookAppointment() {
		boolean doctorMatch = false;
		boolean patientMatch = false; 
		while (!doctorMatch) {
			System.out.println("Enter the last name of the doctor you would like >");
			response = scan.next();
			for (int i = 0; i < doctors.size(); i++)
			{
				if (response.equals(doctors.get(i).getDoclName()))
				{
					doctorMatch = true; 
					System.out.println("Please enter your patient ID >");
					int idRsp = scan.nextInt();
					for (int j = 0; j < patients.size(); j++)
					{
						if (idRsp == (patients.get(j).getPatientID()))
						{
							System.out.println("What time would you like to visit the clinic?");
							String aptRsp = scan.next();
							patientMatch = true;
							appointments.put(aptRsp, patients.get(j));
							System.out.println("You have booked an appointment with Dr. " + doctors.get(i).getDoclName() + " at " + aptRsp);
						}
					}
					if (patientMatch == false) { 
						System.out.println("You do not exist in our system.");
					}
				}
			}
				if (doctorMatch == false)
				{
					System.out.println("This doctor does not work at the UGA Clinic. ");
				}
		}
	}
	
	public void viewAppointments () { 
		for (String appointment : appointments.keySet())
		{
			System.out.println(appointment);
		}
	}
	
	public void signUp() {
		Patient newPatient; 
		Random rand = new Random();
		
		System.out.println("Enter your first name >");
		String fName = scan.next(); 
		
		System.out.println("Enter your last name >");
		String lName = scan.next();
		
		System.out.println("Enter your DOB >");
		int dateOfBirth = scan.nextInt();
		
		int patientID = rand.nextInt(9999);
		newPatient = new Patient(fName, lName, patientID, dateOfBirth);
		
		System.out.println("You have signed up as a patient with the clinic.");
		
	}
	
	public void viewDoctors( ) { 
		for (Doctor aDoctor : doctors) {
			System.out.println("Dr. " + aDoctor.getDocfName() + " " + aDoctor.getDoclName() + " | " +  " Specialty: " + aDoctor.getSpeciality());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Clinic newClinic = new Clinic();	
	}
}
