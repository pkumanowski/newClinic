package com.obi.classes;

import java.util.Date;

public interface Person extends Comparable<Person> {

    String getName();
    String getPesel();
    Date getDOB();
    int getID();
    int getAge();
    int compareTo(Person other);
    String toString();
}
