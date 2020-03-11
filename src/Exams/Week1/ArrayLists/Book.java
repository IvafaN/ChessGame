package Exams.Week1.ArrayLists;

public class Book {
    public static void main(String[] args) {
        person hermilo = new person("Hermilo");
        person ivan = new person("Ivan");
        System.out.println(hermilo.isSamePerson(ivan));
    }
}