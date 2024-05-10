/**
 * Lab 10 Car class
 * @author Patrick Ball
 *
 */
public class Car extends Vehicle {

    private int doors;
    private int passengers;

    public Car(String make, String model, String plate, int doors, int passengers) {
        super(make, model, plate);
        this.doors = doors;
        this.passengers = passengers;
    }

    public int getDoors() {
        return doors;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return String.format("%d-door %s with license %s.", doors, getMake() + " " + getModel(), getPlate());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;
        if (!super.equals(obj)) return false;
        Car car = (Car) obj;
        return doors == car.doors && passengers == car.passengers;
    }

    public Car copy() {
        return new Car(getMake(), getModel(), getPlate(), doors, passengers);
    }
}
