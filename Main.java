public class Main {
    public static void main(String[] args) {
        Toy t1 = new Toy(1, "toy1", 2, 20);
        Toy t2 = new Toy(2, "toy2", 2, 20);
        Toy t3 = new Toy(3, "toy3", 6, 60);

        WheelOfFortune wheel = new WheelOfFortune();

        wheel.Add(t1);
        wheel.Add(t2);
        wheel.Add(t3);
        wheel.SpinTheWheel(10);
    }
}
