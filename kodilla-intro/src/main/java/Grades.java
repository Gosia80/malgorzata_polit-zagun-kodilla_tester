public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrades() {
        int lastGrades = this.grades[this.size - 1];
        return lastGrades;
    }

    public int average() {  // Szymon tu prośba o omówienie - na przykładzie class Gauss - https://stackoverflow.com/questions/4550662/how-do-you-find-the-sum-of-all-the-numbers-in-an-array-in-java
        for (int i = 0; i < this.grades.length; i++) this.grades[i] = i;
        int sum = 0;
        for (int e : this.grades) sum += e;
        int average = sum / this.size;
        return average;
    }
}