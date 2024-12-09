package org.example.geneticTree.interfaces;

import org.example.humans.Humans;

import java.time.LocalDate;

public interface GroupItem {
    int getId();

    String getName();

    int getAge();

    String getInfo();

    LocalDate getBirthDate();

    Humans getFather();

    Humans getMother();
}
