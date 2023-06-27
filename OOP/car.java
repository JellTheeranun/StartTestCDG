package OOP;

public class car {
    private String brand;
    private String model;
    private int year;
    private String color;

    

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Other methods
    public void start() {
        System.out.println("The " + brand + " " + model + " is starting.");
    }

    public void accelerate() {
        System.out.println("The " + brand + " " + model + " is accelerating.");
    }

    public void brake() {
        System.out.println("The " + brand + " " + model + " is braking.");
    }
}

