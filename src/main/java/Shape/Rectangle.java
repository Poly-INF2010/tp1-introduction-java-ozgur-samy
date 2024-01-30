package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        super();
        double halfWidth = width / 2;
        double halfHeight = height / 2;
        for (double i = -halfWidth; i <= halfWidth; i += .5){
            for(double j = - halfHeight; j<= halfHeight; j+= 0.5){
                add(new Point2d(i, j)); // Bottom left
            }
        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        super();
        double halfWidth = dimensions.X() / 2;
        double halfHeight = dimensions.Y() / 2;
        for (double i = -halfWidth; i <= halfWidth; i += .5){
            for(double j = - halfHeight; j<= halfHeight; j+= 0.5){
                add(new Point2d(i, j)); // Bottom left
            }
        }
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        for (Point2d point : coords){
            double halfWidth = point.X() / 2;
            double halfHeight = point.Y() / 2;
            for (double i = -halfWidth; i <= halfWidth; i += .5){
                for(double j = - halfHeight; j<= halfHeight; j+= 0.5){
                    add(new Point2d(i, j)); // Bottom left
                }
            }
        }
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(getCoords());
    }
}
