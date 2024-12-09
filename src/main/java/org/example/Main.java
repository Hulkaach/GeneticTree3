package org.example;

import org.example.humans.Gender;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        service.addHuman("Nataly", Gender.FEMALE, LocalDate.of(1990, 3, 1));
        service.addHuman("Asdq", Gender.MALE, LocalDate.of(1980, 2, 9));
        service.addHuman("qwrRT", Gender.FEMALE, LocalDate.of(2010, 4, 5));
        service.addHuman("VX<MHNZ", Gender.MALE, LocalDate.of(2021, 2, 3));

        System.out.println(service.getInfo());

        service.sortByAge();
        System.out.println(service.getInfo());

        service.sortByBirthDay();
        System.out.println(service.getInfo());

        service.sortByName();
        System.out.println(service.getInfo());
//        GeneticTree geneticTree = new GeneticTree();
//        geneticTree.addHuman(new Humans("Vasiliy", Gender.MALE, LocalDate.of(1990, 2, 25), null, null, null));
//        geneticTree.addHuman(new Humans("Irina", Gender.FEMALE, LocalDate.of(1989, 12, 25), null, null, null));
//        geneticTree.addHuman(new Humans("Kristy", Gender.FEMALE, LocalDate.of(2020, 4, 14), null, geneticTree.findHuman("Vasiliy"), geneticTree.findHuman("Irina")));
//        geneticTree.addHuman(new Humans("Anna", Gender.FEMALE, LocalDate.of(2021, 6, 27), null, geneticTree.findHuman("Vasiliy"), geneticTree.findHuman("Irina")));
//        System.out.println(geneticTree.getInfo());
//
////        OpenSavable openSavable = new FileHandler();
////        openSavable.save(geneticTree, "save.txt");
//        geneticTree.addHuman(new Humans("asdasd", Gender.MALE, LocalDate.of(1990, 2, 25), null, null, null));
//        geneticTree.addHuman(new Humans("asdasd", Gender.FEMALE, LocalDate.of(1989, 12, 25), null, null, null));
//        System.out.println(geneticTree.getInfo());
//
//        System.out.println(geneticTree.iterator());


//        geneticTree = (GeneticTree) fileHandler.load("save.txt");
//        System.out.println(geneticTree.getInfo());

//        Humans Anton = new Humans("Anton", LocalDate.of(1988, 03, 29), null, null, null);
//        Humans Nataliya = new Humans("Nataliya", LocalDate.of(1994, 06, 20), null, null, null);
//        Humans Artem = new Humans("Artem", LocalDate.of(2020, 02, 16), null, Anton, Nataliya);
//        Humans Alexander = new Humans("Alexander", LocalDate.of(2021, 03, 01), null, Anton, Nataliya);
//
//        geneticTree.addHuman(Anton);
//        geneticTree.addHuman(Nataliya);
//        geneticTree.addHuman(Artem);
//        geneticTree.addHuman(Alexander);
//        System.out.println(geneticTree);
//        geneticTree.findHuman("Anton");
//        System.out.println("*****");
//        System.out.println(Anton.getInfo());

    }
}