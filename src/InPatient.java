import java.util.List;

public class InPatient extends Patient{
    private String admissionDate;

    private String roomNumber;

    public InPatient(int patientID, String name,
                     String admissionDate, String roomNumber) {
        super(patientID, name);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "InPatient{" +
                "patient ID=" + getPatientID() +
                ", name='" + getName() + '\'' +
                ", admissionDate='" + admissionDate + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", medicalHistory="+getMedicalRecords()+'\''+
                '}';
    }
}
