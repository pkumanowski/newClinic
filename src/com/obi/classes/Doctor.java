package com.obi.classes;

import com.obi.worker.MedicalSpecialty;

import java.util.ArrayList;

public class Doctor extends PersonAbstract {

    private MedicalSpecialty specialty;
    private int doctorID;
    private static int doctorIDGenerator = 0;

    public Doctor(String name, String pesel, String bDay, String spec) {
        super(name, pesel, bDay);
        specialty = MedicalSpecialty.getFromString(spec);
        ++doctorIDGenerator;
        doctorID = doctorIDGenerator;
    }

    public String toString()
    {
        return super.toString() + ", Specialty: " + specialty + ", ID=" + doctorID;
    }

    public MedicalSpecialty getSpecialty() {
        return specialty;
    }

    public int getID() {
        return doctorID;
    }
}
