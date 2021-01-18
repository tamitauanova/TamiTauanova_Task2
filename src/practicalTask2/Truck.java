package practicalTask2;

public class Truck extends Car implements Movable {

    public int weight;

    public Truck(String name, int number, String color, boolean isMoving, CarBrand brand) {
        super(name, number, color, isMoving, brand);
    }

    @Override
    public void move() {
        System.out.println("This truck can move");
    }

    @Override
    public void stop() {
        super.stop();
    }

    public void loadLifting(int weight) {
        System.out.println("This truck can lift - " + weight + " kg");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", color='" + color + '\'' +
                ", isMoving=" + isMoving +
                '}';
    }
}
