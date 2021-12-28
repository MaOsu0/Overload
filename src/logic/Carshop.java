package logic;

import data.Car;

public class Carshop {
    public static void main(String[] args) {
        Car car1 = new Car(2017, "Audi", "A5", "Czarny");
        Car car2 = new Car(2017,"BWM", "A5");
        car2.setColorCar("Czerwony");
        car2.setYear(-1000);

        System.out.println(car1.getBrand() + " " + car1.getModelCar() + " " + car1.getYear() + " " + car1.getColorCar());
        System.out.println(car2.getBrand() + " " + car2.getModelCar() + " " + car2.getYear() + " " + car2.getColorCar());
    }

}
