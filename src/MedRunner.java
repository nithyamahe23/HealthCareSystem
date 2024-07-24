public class MedRunner {
    public static void main(String[] args) {

        //Create a Patient Instance
        //Patient patient = new Patient(1,"Brad");

        //Create an InPatient record
        InPatient inPatient1 = new InPatient(1,"Brad","04/20/2023","101");

        MedicalRecord medicalRecord1 = new MedicalRecord("04/29/2023","General Checkup");
        MedicalRecord medicalRecord2 = new MedicalRecord("01/29/2023","Dental Checkup");
        MedicalRecord medicalRecord3 = new MedicalRecord("06/20/2023","Cough Treatment");
        inPatient1.addMedicalRecord(medicalRecord1);
        inPatient1.addMedicalRecord(medicalRecord2);
        inPatient1.addMedicalRecord(medicalRecord3);

        InPatient inPatient2 = new InPatient(1,"Brad","04/20/2023","101");

        MedicalRecord medicalRecord11 = new MedicalRecord("04/05/2023","General Checkup");
        MedicalRecord medicalRecord12= new MedicalRecord("20/29/2023","Dental Checkup");
        MedicalRecord medicalRecord13= new MedicalRecord("01/20/2023","Cough Treatment");
        inPatient2.addMedicalRecord(medicalRecord11);
        inPatient2.addMedicalRecord(medicalRecord12);
        inPatient2.addMedicalRecord(medicalRecord13);

        //Create an Outpatient Instance
        OutPatient outPatient = new OutPatient(2,"Henry", "04/19/2022","Tim");

        MedicalRecord medicalRecord5 = new MedicalRecord("08/29/2023","General Checkup");
        MedicalRecord medicalRecord6 = new MedicalRecord("06/29/2023","Cough Treatment");
        MedicalRecord medicalRecord7 = new MedicalRecord("06/27/2023","Dental Checkup");

        outPatient.addMedicalRecord(medicalRecord5);
        outPatient.addMedicalRecord(medicalRecord6);
        outPatient.addMedicalRecord(medicalRecord7);

        OutPatient outPatient2 = new OutPatient(2,"Henry", "04/19/2022","Tim");

        MedicalRecord medicalRecord15 = new MedicalRecord("03/29/2023","General Checkup");
        MedicalRecord medicalRecord16 = new MedicalRecord("06/07/2023","Cough Treatment");
        MedicalRecord medicalRecord17 = new MedicalRecord("06/21/2023","Dental Checkup");

        outPatient2.addMedicalRecord(medicalRecord15);
        outPatient2.addMedicalRecord(medicalRecord16);
        outPatient2.addMedicalRecord(medicalRecord17);

        //To update medical record
        MedicalRecord updatedMedicalRecord = new MedicalRecord("30/12/2023","Cough Treatment");

        System.out.println("Medical Records Before Updating");
        System.out.println(inPatient1.getMedicalRecords());

        inPatient1.updateMedicalRecord(0, updatedMedicalRecord);

        System.out.println("Medical Records After Updation");
        System.out.println(inPatient1.getMedicalRecords());

        //To get the medical record at a particular index
        int searchIndex = 3;
        if(searchIndex < inPatient1.getMedicalRecords().size())
        {
            MedicalRecord medicalRecord = inPatient1.getMedicalRecord(0);
            System.out.println("--- Medical Record ---");
            System.out.println(medicalRecord);
        }else{
            System.out.println("Invalid Search Index");
        }

        //Create a Hospital Object fot Inpatients
        //Hospital hospital = new Hospital();       => shows warning
        Hospital<InPatient> hospital = new Hospital<InPatient>();

        //Add the Inpatient record to the Hospital
        hospital.addPatient(inPatient1);
        hospital.addPatient(inPatient2);

        //Create a hospital object for Outpatients
        Hospital<OutPatient> hospital2 = new Hospital<OutPatient>();

        //Add the Inpatient record to the Hospital
        hospital2.addPatient(outPatient);
        hospital2.addPatient(outPatient2);

        System.out.println("Hospital : "+hospital);
        System.out.println("Hospital : "+hospital2);

        //To get Patient details from hospital
        Patient patientDetails = hospital.getPatient(1);

        if(patientDetails != null)
        {
            System.out.println("---Patient Details---");
            System.out.println(patientDetails);
        }else{
            System.out.println("Invalid Patient ID");
        }


    }
}
