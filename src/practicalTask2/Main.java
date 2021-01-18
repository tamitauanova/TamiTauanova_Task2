package practicalTask2;

public class Main {

    public static void main(String[] args) {

        String str = "Today we are creating different vehicles";
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.append(" and I hope that we will be successful!");
        System.out.println(strBuilder);

        System.out.println();

        Car perfectCar = new Car("Alex", 5, "Red", true, CarBrand.TESLA);
        System.out.println("I created a new car - " + perfectCar.toString());
        perfectCar.move();
        perfectCar.stop();

        System.out.println();

        Truck myTruck = new Truck("John", 8, "Black", true, CarBrand.TESLA);
        System.out.println("I created a new truck - " + myTruck.toString());
        myTruck.move();
        myTruck.stop();
        myTruck.loadLifting(15);

        System.out.println();

        PassengerCar myPassengerCar = new PassengerCar("Lisa", 7, "Pink", true, CarBrand.BMW);
        System.out.println("I created a new passenger car - " + myPassengerCar.toString());
        myPassengerCar.move();
        myPassengerCar.stop();
        myPassengerCar.transport(5);
    }
}
