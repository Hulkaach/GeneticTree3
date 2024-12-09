package org.example;

import org.example.geneticTree.GeneticTree;
import org.example.geneticTree.interfaces.OpenSavable;
import org.example.humans.Gender;
import org.example.humans.Humans;

import java.time.LocalDate;

public class Service {
    private int id;
    private GeneticTree geneticTree;
    private OpenSavable openSavable;

    public Service(GeneticTree geneticTree) {
        this.geneticTree = geneticTree;
    }

    public Service() {
        this(new GeneticTree());
    }

    public void addHuman(String name, Gender gender, LocalDate localDate) {
        this.geneticTree.addHuman(new Humans(id++, name, gender, localDate));
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        for (Humans x : geneticTree) {
            sb.append("ID: " + x.getId());
            sb.append(", Name: " + x.getName());
            sb.append(", Age: " + x.getAge());
            sb.append(", BirthDay: " + x.getBirthDate());
            sb.append(", Mother: " + x.getMother());
            sb.append(", Father: " + x.getFather());
            sb.append(", Children: " + x.getChildrenInfo() + "\n");
        }
        return sb.toString();
    }

    public void sortByName() {
        this.geneticTree.sortByName();
    }

    public void sortByAge() {
        this.geneticTree.sortByAge();
    }

    public void sortByBirthDay() {
        this.geneticTree.sortByBirthDay();
    }

}
