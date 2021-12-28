package PointExercise;

import data.Point;

public class PointController {

        public void addX(Point point) {
            point.setX(point.getX() + 1);
            System.out.println("Współrzędna X to " + point.getX() + " Współrzędna Y to " + point.getY());
        }

        public void minusX(Point point) {
            point.setX(point.getX() - 1);
            System.out.println("Współrzędna X to " + point.getX() + " Współrzędna Y to " + point.getY());
        }
        public void addY(Point point) {
            point.setY(point.getY() + 1);
            System.out.println("Współrzędna X to " + point.getX() + " Współrzędna Y to " + point.getY());
        }

        public void minusY(Point point) {
            point.setY(point.getY() - 1);
            System.out.println("Współrzędna X to " + point.getX() + " Współrzędna Y to " + point.getY());
        }
    }

