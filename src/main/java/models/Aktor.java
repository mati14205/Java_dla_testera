package models;

public class Aktor {
    // w każdej nowej klasie istnieje niewidoczny konstruktor (inaczej niejawny)
    private String imie;
    private String nazwisko;
    private int rating;
    private boolean czyNagrodzony;



    // konstruktor - mechanizm do tworzenia obiektów

//    public Aktor() {
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//        this.rating = rating;
//        this.czyNagrodzony = czyNagrodzony;
//    }

//    public Aktor() {
//        // zawartość konstruktora (w intelliJ Alt+Insert można utworzyć konstrukor)
//    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean getCzyNagrodzony() {
        return czyNagrodzony;
    }

    public void setCzyNagrodzony(boolean czyNagrodzony) {
        this.czyNagrodzony = czyNagrodzony;
    }
}
