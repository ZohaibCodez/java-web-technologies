package showroom;

public class SUV extends Vehicle {
    public SUV(int id, String model, String color, String brand, String price) {
        super(id, model, color, brand, price);
    }

    @Override
    public String toString() {
        return "SUV ==> " + super.toString();
    }
}