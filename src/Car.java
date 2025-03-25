public class Car {
    private static final String brand = "Mazda";
    private static String model;
    private final int horsePower;

    public Car(int horsePower) {
        this.horsePower = horsePower;
        Car.model = "RX7";
    }

    public static void brake() {
        System.out.println("Car is braking");
    }

    public void accelerate(){
        System.out.println("Car is accelerating");
    }

    @Override
    public String toString() {
        return "Car{ [Brand] = " +brand+
                " [Model] = " +model+
                " [Horse Power] = " +horsePower+
                "}";
    }
}
