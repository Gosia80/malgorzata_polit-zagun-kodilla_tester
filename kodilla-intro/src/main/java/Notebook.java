public class Notebook {
    String weight;
    int price;

    // Module 2.2 - Konstruktor
    public Notebook(String weight, int price) {
        this.weight = weight;  // Magiczne słówko `this` wskazuje, że w ramach konstruktora chcemy odwołać się do atrybutów klasy. Gdybyśmy je pominęli, kompilator nie wiedziałby, którą zmienną do której przypisać.
        this.price = price;
    }

    // Module 2.2 - Metoda sprawdzająca czy cena laptopa jest mniejsza niż 900
    public void checkPrice() {
        if (this.price < 900) {
            System.out.println("This notebook is cheap.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

}