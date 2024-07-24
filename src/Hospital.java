import java.util.ArrayList;
import java.util.List;

public class Hospital<T extends Patient> {
    private List<T> patients;

    public Hospital() {
        this.patients = new ArrayList<>();
    }

    //To add patient to the patient list
    public void addPatient(T patient) {
        patients.add(patient);
    }


    //To get patient details
    public T getPatient(int patientID) {
        Patient patientDetails = null ;
       String resultPatientDetails;
        for(T patient : patients)
        {
            if(patient.getPatientID() == patientID)
            {
                return patient;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "patients=" + patients +
                '}';
    }
}
