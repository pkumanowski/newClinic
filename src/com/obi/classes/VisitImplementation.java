package com.obi.classes;
import com.obi.worker.Functions;

import java.util.Date;

public class VisitImplementation <V, T> implements Visit<V, T> {

    private V visitor;
    private T host;
    private Date visitDate;

    public VisitImplementation (V visitor, T host, String date)
    {
        this.visitor = visitor;
        this.host = host;
        visitDate = Functions.stringToDate(date, "yyyy-MM-dd");
    }

    public String toString()
    {
        return "visitor=" + visitor + ", host=" + host + ", visitDate=" + visitDate;
    }

    @Override
    public V getVisitor() {
        return visitor;
    }

    @Override
    public T getHost() {
        return host;
    }

    @Override
    public Date getVisitDate() {
        return visitDate;
    }

    public boolean equals(Visit<V, T> v)
    {
        return this.getVisitor() == v.getVisitor() && this.getHost() == v.getHost() && this.getVisitDate() == v.getVisitDate();
    }
}
