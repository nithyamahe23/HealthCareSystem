public class OutPatient extends Patient{
    private String appointmentDate;

    private String doctorName;

    public OutPatient(int patientID, String name, String appointmentDate, String doctorName) {
        super(patientID, name);
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "OutPatient{" +
                "patient ID=" + getPatientID() +
                ", name='" + getName() + '\'' +
                "appointmentDate='" + appointmentDate + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", medicalHistory="+getMedicalRecords()+'\''+
                '}';
    }
}
