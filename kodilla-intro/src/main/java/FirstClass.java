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
        Notebook notebook = new Notebook("600g", 1000);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();  // Wywołanie metody sprawdzającej cenę (jest w klasie obiektu)

        Notebook heavyNotebook = new Notebook("2000g", 1500);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook("1200g", 500);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();

    }
}
