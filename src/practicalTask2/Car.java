package practicalTask2;

import java.util.Objects;

public class Car implements Movable {
    public String name;
    public int number;
    public String color;
    public boolean isMoving;
    public CarBrand brand;

    public Car(String name, int number, String color, boolean isMoving, CarBrand brand) {
        this.name = name;
        this.number = number;
        this.color = color;
        this.isMoving = isMoving;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("This car can move");
    }
    public void stop() {
        System.out.println("This vehicle can stop");
    }

    @Override
    public String toString() {
        return new StringBuilder ("Car: ")
                .append("name - ").append(this.name)
                .append(", number - ").append(this.number)
                .append(", color - ").append(this.color)
                .append(", isMoving - ").append(this.isMoving)
                .append(", brand - ").append(this.brand)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && isMoving == car.isMoving && Objects.equals(name, car.name) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, color, isMoving);
    }
}
