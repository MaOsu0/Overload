package logic;
import data.Point;
import PointExercise.PointController;

public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(2,2);

        PointController pointController = new PointController();

        pointController.addX(point1);
        pointController.minusX(point1);
        pointController.addY(point1);
        pointController.minusY(point1);

    }
}
