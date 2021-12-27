public class Calculator {
    void printAdd(double x, double y, double z) {
        System.out.println("Wynik dodawania liczby " + x + ", " + y + " i " + z + " to " + (x + y + z));
    }

    void printAdd(double x, double y) {
        System.out.println("Wynik dodawania liczb to " + (x + y));
    }

    void printSub(double x, double y, double z) {
        System.out.println("Wynik odejmowania liczby " + x + ", " + y + " i " + z + " to " + (x - y - z));
    }

    void printSub(double x, double y) {
        System.out.println("Wynik odejmowania liczb to " + (x - y));
    }
}
