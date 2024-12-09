package org.example.geneticTree;

import org.example.geneticTree.interfaces.GroupItem;
import org.example.humans.Humans;
import org.example.humans.comporators.HumanComporatorByAge;
import org.example.humans.comporators.HumanComporatorByBirthDay;
import org.example.humans.comporators.HumanComporatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeneticTree<T extends GroupItem> implements Serializable, Iterable<T> {
    private List<T> humansList;

    public boolean addHuman(T human) {
        if (human == null) {
            return false;
        }
        if (!humansList.contains(human)) {
            humansList.add(human);
            if (human.getFather() != null) {
                human.getFather().addChild(human);
            }
            if (human.getMother() != null) {
                human.getMother().addChild(human);
            }
            return true;
        }
        return false;
    }

    public T findHuman(String name) {
        for (T humans : humansList) {
            if (humans.getName().equalsIgnoreCase(name)) {
                return humans;
            }
        }
        return null;
    }

    public GeneticTree(List<T> humans) {
        this.humansList = humans;
    }

    public GeneticTree() {
        this(new ArrayList<>());
    }


    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("В дереве: ");
        sb.append(humansList.size());
        sb.append(" объектов:\n");
        for (T humans : humansList) {
            sb.append(humans.getInfo());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new GeneticTreeIterator(humansList);
    }

    public void sortByName() {
        humansList.sort(new HumanComporatorByName());
    }

    public void sortByAge() {
        humansList.sort(new HumanComporatorByAge());
    }

    public void sortByBirthDay() {
        humansList.sort(new HumanComporatorByBirthDay());
    }
}
