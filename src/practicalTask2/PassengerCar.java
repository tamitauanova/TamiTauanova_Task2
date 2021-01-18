package practicalTask2;

public class PassengerCar extends Car implements Movable {

    public int numberOfPassengers;

    public PassengerCar(String name, int number, String color, boolean isMoving, CarBrand brand) {
        super(name, number, color, isMoving, brand);
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void stop() {
        super.stop();
    }

    public void transport(int numberOfPassengers) {
        System.out.println("This passenger car can transport " + numberOfPassengers + " passengers");
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", color='" + color + '\'' +
                ", isMoving=" + isMoving +
                '}';
    }
}
