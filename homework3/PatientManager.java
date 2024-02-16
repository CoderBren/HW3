package homework3;
public class PatientManager{

    // Instance variable representing an array of 10 elements

   Patient[] patientArray = new Patient[10];

    // Default Constructor

    public PatientManager(){
    }

    // Add Patient object to the first spot in the array

    public int addPatient(Patient newPatient) {
        for (int i = 0; i < Patient.length; i++) {
            if (patientArray[i] == null) {
                patientArray[i] = newPatient;
                return i;
            }
        }
        return 0;
    
    }

    // Remove and return Patient object from array

    public Patient removePatient(int index) {
    Patient[] Patient;
    int i;
    if ((Patient[i] >= 0) && (Patient[i] <= patientArray.length) && (patientArray[index] != null)) {
        Patient removedPatient = patientArray[index];
        patientArray[index] = null;
        return removedPatient;
        }
    return null;
    }


    // Method to reduce caffeine level

    public void caffeineAbsorption() {
        int i;
        for ((Patient[i] = 0); (i < patientArray.length); i++) {
            if (patientArray[i] != null) {
                ((Object) patientArray[i]).reduceCaffeine(130);
                if (((Object) patientArray[i]).getCaffeine() <= 0) {
                    patientArray[i] = null;
                }
            }
        }
    }


    // Method to print ID and caffeine level

    public String toString() {
        StringBuilder result = new StringBuilder();

        if (isEmpty()) {
            result.append("Empty");
        } else {
            for (int i = 0; i < patientArray.length; i++) {
                if (patientArray[i] != null) {
                    result.append("Patient ID: ").append(i).append(", Caffeine: ").append(patientArray[i].getCaffeine()).append("\n");
                } else {
                    result.append("Patient ID: ").append(i).append(", Empty Slot\n");
                }
            }
        }

        return result.toString();
    }

    private boolean isEmpty() {
        for (Patient patient : patientArray) {
            if (patient != null) {
                return false;
            }
        }
        return true;
    }










}