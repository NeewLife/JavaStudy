package static_vs_final;

public class main {
    public static void main(String[] args) {
        Earth earth = new Earth();
        int a = earth.newborn / 30;
        int b = earth.POPULATION / 100;
        System.out.println(a + ", " + b);

        Car.Wheel wheel = new Car.Wheel();
    }
}
