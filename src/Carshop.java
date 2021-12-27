public class Carshop {
    public static void main(String[] args) {
        Car car1 = new Car(2017, "Audi", "A5", "Czarny");
        Car car2 = new Car(2017,"Audi", "A5");


        System.out.println(car1.modelCar + " " + car1.colorCar);
        System.out.println(car2.modelCar + " " + car2.colorCar);

        car2.colorCar = "Czerwony";
        System.out.println(car2.modelCar + " " + car2.colorCar);

        System.out.println();



    }
}
