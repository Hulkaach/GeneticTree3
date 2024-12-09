package org.example.humans.comporators;

import org.example.geneticTree.interfaces.GroupItem;
import org.example.humans.Humans;

import java.util.Comparator;

public class HumanComporatorByBirthDay<T extends GroupItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
