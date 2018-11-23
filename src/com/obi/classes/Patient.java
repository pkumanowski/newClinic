package com.obi.classes;

public class Patient extends PersonAbstract {

    private static int patientIDGenerator = 0;
    private int patientID;

    public Patient(String name, String pesel, String bDay) {
        super(name, pesel, bDay);
        ++patientIDGenerator; //id counter
        patientID = patientIDGenerator;
    }

    public int getPatientID() {
        return patientID;
    }
    public String toString()
    {
        return super.toString() + ", ID=" + patientID;
    }
}
