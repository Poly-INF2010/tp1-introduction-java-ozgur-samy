package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {


    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        double a = widthDiameter;
        double b = heightDiameter;

        for (double x = -a; x <= a; x += .5) {
            for (double y = -b; y <= b; y += .5) {
                if (Math.pow(x / a, 2) + Math.pow(y / b, 2) <= 1) {
                    add(new Point2d(x, y));
                }
            }

        }
    }
    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        double a = dimensions.X() / 2.0;
        double b = dimensions.Y() / 2.0;

        for (double x = -a; x <= a; x += .5) {
            for (double y = -b; y <= b; y += .5) {
                if (Math.pow(x / a, 2) + Math.pow(y / b, 2) <= 1) {
                    add(new Point2d(x, y));
                }
            }
        }
    }
    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        for (Point2d point : coords){
            double a = point.X() / 2.0;
            double b = point.Y() / 2.0;

            for (double x = -a; x <= a; x += .5) {
                for (double y = -b; y <= b; y += .5) {
                    if (Math.pow(x / a, 2) + Math.pow(y / b, 2) <= 1) {
                        add(new Point2d(x, y));
                    }
                }
            }
        }
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(getCoords());
    }
}
