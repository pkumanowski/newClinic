package com.obi.classes;

import com.obi.worker.Functions;

import java.util.Date;

public abstract class PersonAbstract implements Person {
    private String Name;
    private String Pesel;
    private Date birthDate;
    private int age;

    PersonAbstract(String name, String pesel, String bDay) {
        Name = name;
        Pesel = pesel;
        birthDate = Functions.stringToDate(bDay, "yyyy-MM-DD");
    }

    public String toString() {
        return Name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getPesel() {
        return Pesel;
    }

    @Override
    public int getAge() {
        return age;
    }

    public int compareTo(Person other) {
        int i = Name.compareTo(other.getName());
        if (i != 0)
            return i;
        i = Integer.compare(age, other.getAge());
        if (i != 0)
            return i;
        return Integer.valueOf(Pesel).compareTo(Integer.valueOf(other.getPesel()));
    }
}
