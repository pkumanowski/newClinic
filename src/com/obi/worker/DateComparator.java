package com.obi.worker;

import com.obi.classes.Visit;

import java.util.Comparator;

public class DateComparator<V, T> implements Comparator<Visit<V, T>> {
    public int compare(Visit<V, T> v1, Visit<V, T> v2) {
        return v1.getVisitDate().compareTo(v2.getVisitDate());
    }


}
