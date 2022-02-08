package pl.javastart.application;

import pl.javastart.logic.Charger;
import pl.javastart.model.Telephone;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.getBrand()
                + " " + telephone.getModel()
                + ", bateria: " + telephone.getBatteryCapacity() +"mAh"
                + ", poziom naładowania: " + telephone.getChargeLevel() + "%");

        telephone.printInfo(telephone);

        Charger charger = new Charger();

        charger.charge(telephone);
    }
}
