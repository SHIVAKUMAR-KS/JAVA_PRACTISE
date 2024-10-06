package Encapsulation;

class Car {
    // Private variables
    private String model;
    private int year;

    // Public getter and setter methods for encapsulation
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
}

public class carExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2=new Car();

        // Using setter methods to set data
        car1.setModel("Tesla Model X");
        car1.setYear(2022);

        car2.setModel("lamborgini");
        car2.setYear(2000);

        // Using getter methods to access data
        System.out.println("Car Model: " + car1.getModel());
        System.out.println("Car Year: " + car1.getYear());

        System.out.println("Car Model: " + car2.getModel());
        System.out.println("Car Year: " + car2.getYear());
    }
}
