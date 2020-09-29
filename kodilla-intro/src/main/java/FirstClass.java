public class FirstClass {                                          // class def.
    public static void main(String[] args) {                        // method main def.
        System.out.println("Hello from First Class!");             // run class out.method println
        System.out.println(9);                                     // int
        System.out.println(true);                                  // boolean
        System.out.println("Hello");                               // string
        System.out.println('A');                                   // char

        if (1 < 2){  // boolean condition type
            System.out.println("Niesamowite! Jeden jest mniejsze niż dwa!!!");
        }

        if (1 > 2){
            System.out.println("WOW! Jeden jest większe niż dwa!!!");
        } else {
            System.out.println("Wszystko po staremu, jeden jest mniejsze niż dwa.");
        }

        // Module 2.2 - Tworzenie obiektu
        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println(notebook.weight + " g, " + notebook.price + " zł" + ", " + notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();  // Wywołanie metody sprawdzającej cenę (jest w klasie obiektu)
        notebook.checkYear();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2017);
        System.out.println(heavyNotebook.weight + " g, " + heavyNotebook.price + " zł" + ", " + heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200, 3000, 2014);
        System.out.println(oldNotebook.weight + " g, " + oldNotebook.price + " zł" + ", " + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYear();
        oldNotebook.checkYearAndPrice();
    }
}
