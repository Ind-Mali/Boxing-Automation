public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("King", 10, 96, 90, 20);
        Fighter f2 = new Fighter("Slave", 10, 95, 90, 10);
        Ring r = new Ring(f1, f2, 90, 100);

        r.run();
    }
}
