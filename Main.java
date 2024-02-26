public class Main {
    public static void main(String[] args) {
        Toy t1 = new Toy(1, "toy1", 1, 1);
        Toy t2 = new Toy(1, "toy2", 1, 1);
        Toy t3 = new Toy(1, "toy3", 1, 1);

        WheelOfFortune wheel = new WheelOfFortune();

        wheel.Add(t1);
        wheel.Add(t2);
        wheel.Add(t3);
        wheel.Test();
    }
}
