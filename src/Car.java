public class Car {
    int year;
    String brand;
    String modelCar;
    String colorCar;

    Car(int year, String brand, String model, String color) {
        this (year, brand, model);
        colorCar = color;

    }

    Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        modelCar = model;

    }

}
