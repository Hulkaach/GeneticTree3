package org.example.geneticTree;

import org.example.humans.Humans;

import java.util.Iterator;
import java.util.List;

public class GeneticTreeIterator implements Iterator<Humans> {
    private int index;
    private List<Humans> humansList;

    public GeneticTreeIterator(List<Humans> humansList) {
        this.humansList = humansList;
    }

    @Override
    public boolean hasNext() {
        return index < humansList.size();
    }

    @Override
    public Humans next() {
        return humansList.get(index++);
    }
}
