package models;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String tom, String hanks) {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // własne metody
    // 2 etapy

    // co ma robić?
    // wyliczać wynagrodzenie aktora
    // stawka * iloscFilmowWRoku

    // jak ma to zrobić


    // deklaracja metody
    // używanie
    public int calculatSalary(int stawka, int iloscFilmowWRoku) {
        int rezultat = stawka * iloscFilmowWRoku;
        return rezultat;
    }

    public int giveBonus(int rating, int salary) {

        int result;

        if (rating < 11) {
            result = salary * 2;
        } else {
            result = salary;
        }
    return result;

    }

}
