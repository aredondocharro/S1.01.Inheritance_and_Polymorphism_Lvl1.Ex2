public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(200);
        Car car2 = new Car(400);
        System.out.println(car1);
        System.out.println(car2);

        car1.accelerate();
        Car.brake();
    }
}