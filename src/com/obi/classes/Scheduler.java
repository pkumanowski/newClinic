package com.obi.classes;

import com.obi.worker.MedicalSpecialty;

import java.util.*;

public class Scheduler {

    private List<Visit<Integer, Integer>> vList = new ArrayList<Visit<Integer, Integer>>();

    public List<Visit<Integer, Integer>> getVisitList() {
        return vList;
    }

    public void addVisit(Visit<Integer, Integer> v) {
        vList.add(v);
    }

    public void removeVisit(Visit<Integer, Integer> visit) {
        for (Visit<Integer, Integer> v : vList) {
            if (v.equals(visit)) {
                vList.remove(v);
            }
        }
    }
    public void findVisit(Visit<Integer, Integer> fVisit)
    {
        for (Visit<Integer, Integer> v : vList){
            if (v.equals(fVisit)){
                System.out.println("Termin: " + v.getVisitDate());
            }
        }
    }
}

