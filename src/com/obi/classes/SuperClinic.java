package com.obi.classes;

import com.obi.worker.DateComparator;
import com.obi.worker.Functions;

import java.util.*;

public class SuperClinic {

    private List<Patient> pList = new ArrayList<Patient>();
    private List<Doctor> dList = new ArrayList<Doctor>();

    private static Map<Integer, Patient> pMap = new HashMap<Integer, Patient>(); //creates Patients map
    private static Map<Integer, Doctor> dMap = new HashMap<Integer, Doctor>(); //creates Doctors map


    public void addPatient(Patient p) {
        pList.add(p);
    }

    public void addDoctor(Doctor d) {
        dList.add(d);
    }

    public void removeDoctor(Doctor doc) {
        for (Doctor d : dList) {
            if (doc.equals(d)) {
                dList.remove(d);
            }
        }
    }

    public void removePatient(Patient pat) {
        for (Patient p : pList) {
            if (pat.equals(p)) {
                pList.remove(p);
            }
        }
    }

    public static void printAllVisits(List<Visit<Integer, Integer>> a) {
        Collections.sort(a, new DateComparator<Integer, Integer>());
        for (Visit<Integer, Integer> v : a) {
            System.out.println("Visit Date:       " + Functions.dateToString(v.getVisitDate(), "MMMM dd, yyyy"));
            System.out.println("Doctor                         " + dMap.get(v.getHost()).getName() + " " + dMap.get(v.getHost()).getName());
            System.out.println("Specialty:                     " + dMap.get(v.getHost()).getSpecialty());
            System.out.println("Days Until Visit:       " + Functions.daysUntil(v.getVisitDate()));
            System.out.println("Patient");
            System.out.println("       Name:        " + pMap.get(v.getVisitor()).getName());
            System.out.println("       Pesel:       " + pMap.get(v.getVisitor()).getPesel());
            System.out.println("       Age:         " + pMap.get(v.getVisitor()).getAge());
            System.out.println();
        }
    }
}
