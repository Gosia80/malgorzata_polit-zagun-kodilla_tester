public class Notebook {
    int weight;
    int price;
    int year;

    // Module 2.2 - Konstruktor
    public Notebook(int weight, int price, int year) {
        this.weight = weight;  // Magiczne słówko `this` wskazuje, że w ramach konstruktora chcemy odwołać się do atrybutów klasy. Gdybyśmy je pominęli, kompilator nie wiedziałby, którą zmienną do której przypisać.
        this.price = price;
        this.year = year;
    }

    // Module 2.3 - Metoda sprawdzająca cenę laptopa
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    // Module 2.3 - Metoda sprawdzająca wagę laptopa
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 1000 && this.weight <= 1800) {
            System.out.println("This notebook is not so heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    // Module 2.3 - Metoda sprawdzająca rok produkcji laptopa
    public void checkYear() {
        if (this.year<2015) {
            System.out.println("This notebook is old.");
        } else if (this.year>=2015 && this.year<=2019){
            System.out.println("This notebook is not new.");
        } else {
            System.out.println("This notebook is new.");
        }
    }

    // Module 2.3 - Metoda sprawdzająca rok produkcji i cenę
    public void checkYearAndPrice() {
        if (this.year<2017 && this.price<=2000) {
            System.out.println("It's old and cheap.");
        } else if (this.year<2017 && this.price>2000) {
            System.out.println("It's old and expensive.");
        } else if (this.year>=2017 && this.price<=4000) {
            System.out.println("It's new and cheap.");
        } else if (this.year>=2017 && this.price>4000) {
            System.out.println("It's new and expensive.");
        } else {
            System.out.println("It's not on a list. Don't choose this one.");
        }
    }
}