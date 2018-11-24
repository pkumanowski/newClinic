package com.obi.classes;

import java.util.Date;

public interface Person extends Comparable<Person> {

    String getName();

    String getPesel();

    int getID();

    int getAge();

    int compareTo(Person other);

    String toString();
}
