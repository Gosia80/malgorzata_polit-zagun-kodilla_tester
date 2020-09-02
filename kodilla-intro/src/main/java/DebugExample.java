public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 25;
        int secondNumber = 25;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber > secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        }
        else if (firstNumber == secondNumber) {
            isEqual(firstNumber, secondNumber);
        }
        else {
            sumAndDisplay(firstNumber, secondNumber);
        }
    }

    private static void sumAndDisplay(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    private static void subtractAndDisplay(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    private static void isEqual(int a, int b) {
        int result = a * b;
        System.out.println(result+" Eureka!");
    }
}