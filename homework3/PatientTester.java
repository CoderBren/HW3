package homework3;
public class PatientTester {
   
   
   
   
    public static void main(String[] args) {
        // Instantiate a PatientManager object
        PatientManager patientManager = new PatientManager();

        // Print the PatientManager object
        System.out.println("PatientManager before adding patients:");
        System.out.println(patientManager);

        // Add four patient objects to the PatientManager
        Patient patient1 = new Patient(200);
        Patient patient2 = new Patient(400);
        Patient patient3 = new Patient(600);
        Patient patient4 = new Patient(800);

        patientManager.addPatient(patient1);
        patientManager.addPatient(patient2);
        patientManager.addPatient(patient3);
        patientManager.addPatient(patient4);





        // Print the PatientManager object after adding 
        System.out.println("\nPatientManager after adding patients:");
        System.out.println(patientManager);

        // Call the caffeineAbsorption method twice
        patientManager.caffeineAbsorption();
        patientManager.caffeineAbsorption();

        // Print the PatientManager object 
        System.out.println("\nPatientManager after caffeine absorption:");
        System.out.println(patientManager);

        // Remove the patient object with the highest amount of caffeine
        int indexOfRemovedPatient = ((Object) patientManager).removePatientWithHighestCaffeine();

        // Print the PatientManager object after removing the patient
        System.out.println("\nPatientManager after removing the patient with the highest caffeine:");
        System.out.println(patientManager);
        System.out.println("Removed patient at index: " + indexOfRemovedPatient);
    }
}

    
