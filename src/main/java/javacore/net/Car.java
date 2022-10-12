package javacore.net;

public class Car {
    // properties: manufacturer, model,
    String manufacture;
    String model;
    String color;
    String engine;
    int capacity;
    float vehicleKilometersTraveled;
    double price;

    public Car(String manufacture, String model, String color, String engine, int capacity, float vehicleKilometersTraveled, double price) {
        this.manufacture = manufacture;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.capacity = capacity;
        this.vehicleKilometersTraveled = vehicleKilometersTraveled;
        this.price = price;
    }

    public void move(float kilometers) {
        this.vehicleKilometersTraveled += kilometers;
    }

    public void print() {
        String output = "";
        String lineBreak = String.format("%s\n", "*".repeat(50));
        output += lineBreak;
        output += String.format("Manufacture: %s\n", this.manufacture);
        output += String.format("Model: %s\n", this.model);
        output += String.format("Color: %s\n", this.color);
        output += String.format("Engine: %s\n", this.engine);
        output += String.format("Capacity: %s\n", this.capacity);
        output += String.format("Vehicle Kilometers Traveled: %.2f\n", this.vehicleKilometersTraveled);
        output += String.format("Price : %.2f\n", this.price);
        output += lineBreak;
        System.out.printf("%s\n", output);
    }
}
