package data;

public class Car {
    private int year;
    private String brand;
    private String modelCar;
    private String colorCar;

    public Car(int year, String brand, String model, String color) {
        this (year, brand, model);
        colorCar = color;
    }

    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.modelCar = model;
    }

    public void setColorCar(String color) {
        this.colorCar = color;
    }

    public void setYear (int year) {
        if (year >= 0)
        this.year = year;
        else
            System.out.println("Wynik niepoprawny");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getYear() {
        return year;
    }

    public String getColorCar() {
        return colorCar;
    }

    public String getBrand() {
        return brand;
    }

    public String getModelCar() {
        return modelCar;
    }


}
