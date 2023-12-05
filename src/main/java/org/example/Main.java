package org.example;

import models.Film;
import models.Aktor;
import models.Person;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person tomHanks = new Person("Tom", "Hanks");
        Person angelinaJolie = new Person("Angelina", "Jolie");

        // wynagrodzenie dla Toma

        int wynagrodzenieToma = tomHanks.calculatSalary(3000000,4);
        System.out.println("Wynagrodzenie Toma: " + wynagrodzenieToma);

        // wynagrodzenie dla Angeliny

        int wynagrodzenieAngeliny = angelinaJolie.calculatSalary(6000000,9);
        System.out.println("Wynagrodzenie Angeliny: " + wynagrodzenieAngeliny);

//        Scanner scan = new Scanner(System.in);
//        //obiekt z pustego konstruktora
//
//        Aktor aktor1 = new Aktor();
//        aktor1.setImie("Tom");
//        aktor1.setNazwisko("Cruise");
//        aktor1.setRating(9);
//        aktor1.setCzyNagrodzony(true);
//
//        Film pulpFiction = new Film();
//        pulpFiction.setTitle("Pulp fiction");
//        pulpFiction.setRating(50);
//        pulpFiction.setCategory("B");
//        pulpFiction.setBudget(66.5);
//
//        Film topGun = new Film();
//        topGun.setTitle("Pulp fiction");
//        topGun.setRating(2);
//        topGun.setCategory("B");
//        topGun.setBudget(66.5);
//
//        //Film topGun = new Film("Top Gun","Opis test","Director Y", 190.4, 'A',"Action");
//
//        double budzetFilmuPulpFiction;
//        double budzetFilmuTopGun;
//
//        int rankingFilmuTopGun;
//        int rankingFilmuPulpFiction;
//
//        String imieAktora;
//        String nazwiskoAktora;
//        int ocenaAktora;
//        boolean nagrodaAktora;
//
//
//        budzetFilmuPulpFiction = pulpFiction.getBudget();
//        budzetFilmuTopGun = topGun.getBudget();
//        rankingFilmuTopGun = topGun.getRating();
//        rankingFilmuPulpFiction = pulpFiction.getRating();
//        imieAktora = aktor1.getImie();
//        nazwiskoAktora = aktor1.getNazwisko();
//        ocenaAktora = aktor1.getRating();
//        nagrodaAktora = aktor1.getCzyNagrodzony();
//
//        System.out.println("Budżet filmu Pulp Fiction wynosi: " + budzetFilmuPulpFiction);
//        System.out.println("Budżet filmu Top Gun wynosi: " + budzetFilmuTopGun);
//        System.out.println("Imię: " + imieAktora);
//        System.out.println("Nazwisko: " + nazwiskoAktora);
//        System.out.println("Ocena aktora: " + ocenaAktora);
//        System.out.println("Czy aktor dostał oscara?: " + nagrodaAktora);
//
//
////        if (rankingFilmuTopGun < 11){
////            System.out.println("Top Gun jest popularnym filmem.");
////        }
////        else if (rankingFilmuTopGun < 51) {
////            System.out.println("Top Gun jest średnim filmem.");
////        }
////        else {
////            System.out.println("Top Gun nie jest popularnym filmem.");
////        }
//
//
//        if (rankingFilmuTopGun < rankingFilmuPulpFiction){
//            System.out.println("Pulp Fiction jest popularniejszym filmem.");
//        }
//        else {
//            System.out.println("Top Gun jest popularniejszym filmem.");
//        }




//        System.out.print("Podaj swoje imię: ");
//        var imie = scan.nextLine();
//        switch(imie) {
//            case "Agata","Mateusz", "Leszek", "Paweł", "Iwona", "Adam", "Darek", "Adrian":
//                System.out.println("Cześć " + imie + " miło Cię widzieć.");
//                break;
//            default:
//                System.out.print("Sorki ale nie znam Cię :(");
//                System.exit(1);
//        }

    }
}

/*
ctr + d = duplikacja linii
ctr + p - podgląd parametrów
alt + insert - generowanie kodu
alt + enter - rozwiązuje błędy
 */