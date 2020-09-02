public class SimpleArray {
    public static void main(String [] args) {
        String[] nameList = new String[] {"Ania", "Kasia", "Zosia", "Wojtek", "Kacper"};

        String[] animalList = new String[5];
        animalList[0] = "cat";
        animalList[1] = "dog";
        animalList[2] = "parrot";
        animalList[3] = "rat";
        animalList[4] = "hamster";

        String animal = animalList[3];
        System.out.println(animal);
        int numberOffElements = animalList.length;
        System.out.println("My table consists of " + numberOffElements + " elements.");
    }
}
