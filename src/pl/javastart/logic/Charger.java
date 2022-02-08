package pl.javastart.logic;

import pl.javastart.model.Telephone;

public class Charger {

public void charge(Telephone telephone) {
    telephone.setChargeLevel(telephone.getChargeLevel() + 1);
    System.out.println("Telefon po ładowaniu");
    System.out.println(telephone.getBrand() + " " + telephone.getModel() + ", bateria: " + telephone.getBatteryCapacity() +
            "mAh, poziom naładowania: " + telephone.getChargeLevel() + "%");
}
}
