package org.example.humans;

import org.example.geneticTree.interfaces.GroupItem;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Humans implements Serializable, GroupItem {
    private int id;
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private Humans father;
    private Humans mother;
    private List<Humans> childrens;

    public Humans(int id, String name, Gender gender, LocalDate dateOfBirth, LocalDate dateOfDeath, Humans father, Humans mother) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = dateOfBirth;
        this.deathDate = dateOfDeath;
        this.father = father;
        this.mother = mother;
        childrens = new ArrayList<>();
    }

    public Humans(int id, String name, Gender gender, LocalDate dateOfBirth) {
        this(id, name, gender, dateOfBirth, null, null, null);
    }

    public String getName() {
        return this.name;
    }

    public boolean addChild(Humans child) { //todo для этого нужно переопределить методы equals и hashcode
        if (!childrens.contains(child)) {
            childrens.add(child);
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.birthDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Humans)) {
            return false;
        }
        Humans human = (Humans) obj;
        return human.getName().equals(getName()) && human.getBirthDate().equals(getBirthDate());
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
//        sb.append("ID: ");
//        sb.append(this.id);
        sb.append(" Имя: ");
        sb.append(this.name);
        sb.append(" Дата рождения: ");
        sb.append(this.birthDate);
        sb.append(", ");
        sb.append(getMotherInfo());
        sb.append(", ");
        sb.append(getFatherInfo());
        sb.append(", ");
        sb.append(getChildrenInfo());
        return sb.toString();
    }

    public String getChildrenInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Дети: ");
        if (!childrens.isEmpty()) {
            for (int i = 0; i < childrens.size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(childrens.get(i).name);
            }
        } else {
            sb.append("отсутствуют");
        }
        return sb.toString(); //todo доделать метод и проверить какой вывод лучше - через итерацию или индекс
    }

    public String getMotherInfo() {
        String mother_info = "Мать: ";
        if (this.mother != null) {
            mother_info += this.mother.getName();
        } else {
            mother_info += "неивестна";
        }
        return mother_info;
    }

    public String getFatherInfo() {
        String father_info = "Отец: ";
        if (this.father != null) {
            father_info += this.father.getName();
        } else {
            father_info += "неивестен";
        }
        return father_info;
    }

    public int getAge() {
        if (birthDate != null) {
            return Period.between(this.birthDate, LocalDate.now()).getYears();
        }
        return 0;
    }


    public Humans getFather() {
        if (this.father != null) {
            return this.father;
        }
        return null;
    }

    public Humans getMother() {
        if (this.mother != null) {
            return this.mother;
        }
        return null;
    }
}
