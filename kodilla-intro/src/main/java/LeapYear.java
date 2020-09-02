public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;

        // is divided by 4
        int isDividedBy4 = year%4;

        // is divided by 100
        int isDividedBy100 = year%100;

        // is divided by 400
        int isDividedBy400 = year%400;

        if (isDividedBy4 == 0 && isDividedBy100 == 0 && isDividedBy400 == 0) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
