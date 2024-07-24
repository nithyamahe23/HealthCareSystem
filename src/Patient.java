import java.util.ArrayList;
import java.util.List;

public class Patient {

    private int patientID;

    private String name;

    private List<MedicalRecord> medicalHistory;

    public Patient(int patientID, String name)
    {
        this.patientID = patientID;
        this.name = name;
        this.medicalHistory = new ArrayList<>();
    }
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MedicalRecord> getMedicalRecords() {
        return medicalHistory;
    }

    public void setMedicalRecords(List<MedicalRecord> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }


    //To add a medical record
    public void addMedicalRecord(MedicalRecord record) {
        this.medicalHistory.add(record);
    }

    //To update the medical record
    public void updateMedicalRecord(int index, MedicalRecord record) {
        //consider index as patientid
        //Check whether the record exists
        if(index < medicalHistory.size()) {
            MedicalRecord medicalRecord = medicalHistory.get(index);
            if (medicalRecord != null) {
                //if the record does not exist, add it
                this.medicalHistory.set(index, record);
            }
        }else {
            //If the record does not exist
            System.out.println("Medical Record does not exist");
            //this.medicalHistory.add(record);
        }
    }

    //To get the medical record
    public MedicalRecord getMedicalRecord(int index)
    {
        MedicalRecord medicalRecord = this.medicalHistory.get(index);
        return medicalRecord;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID=" + patientID +
                ", name='" + name + '\'' +
                ", medicalHistory=" + medicalHistory +
                '}';
    }
}
