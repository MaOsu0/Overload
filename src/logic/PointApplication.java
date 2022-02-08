package logic;

import data.Point;
import PointExercise.PointController;

public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);

        PointController pointController = new PointController();

        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;

        int option = addX;
        switch (option) {
            case addX:
                pointController.addX(point1);
                break;
            case addY:
                pointController.addY(point1);
                break;
            case minusX:
                pointController.minusX(point1);
                break;
            case minusY:
                pointController.minusY(point1);
                break;
            default:
                System.out.println("Wybrana została błędna opcja. Proszę wprowadzić wartość od 0 do 3");
        }

        System.out.println("Wartość X to " + point1.getX() + " i Y to " + point1.getY());
    }
}
