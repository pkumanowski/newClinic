package com.obi.classes;

import com.obi.worker.DateComparator;
import com.obi.worker.Functions;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuperClinic {

    public static Scheduler data = new Scheduler();

    private static Map<Integer, Patient> pMap = new HashMap<Integer, Patient>(); //creates Patients table object
    private static Map<Integer, Doctor> dMap = new HashMap<Integer, Doctor>(); //creates Doctors table object

    public static void makePatientMap(List<Patient> pList)
    {
        for (Patient p: pList)
        {
            pMap.put(p.getID(), p);
        }
    }

    public static void makeDoctorMap(List<Doctor> dList)
    {
        for (Doctor d: dList)
        {
            dMap.put(d.getID(), d);
        }
    }

    public static void printAllVisits(List<Visit<Integer, Integer>> a)
    {
        Collections.sort(a, new DateComparator<Integer, Integer>());
        for (Visit<Integer, Integer> v: a)
        {
            System.out.println("Visit Data:       " + Functions.dateToString(v.getVisitDate(), "MMMM dd, yyyy"));
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
