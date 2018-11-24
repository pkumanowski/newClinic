package com.obi.worker;

public enum MedicalSpecialty {
    GENERAL_MEDICINE, RADIOLOGY, ONCOLOGY;

    public static MedicalSpecialty getFromString(String spec) {
        return MedicalSpecialty.valueOf(spec.toUpperCase());
    }
}
