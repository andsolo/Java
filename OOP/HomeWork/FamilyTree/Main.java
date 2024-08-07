package OOP.HomeWork.FamilyTree;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        Human vasya = new Human("Василий", Gender.Male, LocalDate.of(1963, 12, 10));
        Human masha = new Human("Мария", Gender.Female, LocalDate.of(1965, 9, 15));

        tree.add(vasya);
        tree.add(masha);
        tree.setWedding(vasya, masha);

        Human christina = new Human ("Кристина", Gender.Female, LocalDate.of(1988, 7, 5), vasya, masha);
        Human semyon = new Human("Семен", Gender.Male, LocalDate.of(1991, 1, 25), vasya, masha);

        tree.add(christina);
        tree.add(semyon);

        Human grandMother = new Human("Лариса", Gender.Female, LocalDate.of(1991, 1, 1));
        grandMother.addChild(vasya);

        tree.add(grandMother);
        
        System.out.println(tree);

    }
}
