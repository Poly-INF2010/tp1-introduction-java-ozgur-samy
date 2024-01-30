package Point;

public class Point2d extends AbstractPoint {
    private final Integer X = 0;
    private final Integer Y = 1;

    /** TODO
     * 2D Point Constructor from coordinates
     * @param x X coordinate
     * @param y Y coordinate
     */
    public Point2d(Double x, Double y) {super(new double[] {x,y});

    }

    /** TODO
     * 2D Point Constructor from vector
     * @param vector Vector containing X and Y coordinates
     */
    public Point2d(Double[] vector) {
        this(vector[0], vector[1]);
    }

    /**
     * @return X coordinate
     */
    public double X() { return vector[X];}

    /**
     * @return Y coordinate
     */
    public double Y() { return vector[Y];}

    /**
     * TODO
     * Translate the point by the given vector
     *
     * @param translateVector The vector by which to translate
     * @return Translated point
     */
    @Override
    public double[] translate(Double[] translateVector) {

        return (new double[] {translateVector[1],translateVector[0]});
    }

    /**
     * TODO
     * Translate the point by the given 2D Point
     *
     * @param translateVector The 2D Point by which to translate
     * @return Translated point
     */
    public Point2d translate(Point2d translateVector) {
        this.vector[0] += translateVector.vector[0];
        this.vector[1] += translateVector.vector[1];

        return this;
    }

    /** TODO
     * Rotate the point by the given rotation Matrix
     * @param rotationMatrix Matrix by which to rotate
     * @return Rotated point
     */
    @Override
    public Point2d rotate(Double[][] rotationMatrix) {
        Double[] result = new Double[vector.length];

        for (int i = 0; i < vector.length; i++) {
            result[i] = 0.0;
            for (int j = 0; j < vector.length; j++) {
                result[i] += vector[j] * rotationMatrix[i][j];
            }
        }
        return new Point2d(result[0], result[1]);
    }

    /** TODO
     * Rotate the point by the given angle
     * @param angle Angle in radians
     * @return Rotated point
     */
    public Point2d rotate(Double angle) {
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        double x = vector[X] * cos - vector[Y] * sin;
        double y = vector[X] * sin + vector[Y] * cos;
        vector[X] = x;
        vector[Y] = y;
        return this;
    }

    /** TODO
     * Divide the X and Y coordinates of a 2D point by a scalar
     * @param divider Scalar used to divide
     * @return Divided point
     */
    @Override
    public Point2d divide(Double divider) {
        vector[0] = vector[0]/divider;
        vector[1]  = vector[1]/divider;
        return this;
    }

    /** TODO
     * Multiply the X and Y coordinates of a 2D point by a scalar
     * @param multiplier Scalar used to multiply
     * @return Multiplied point
     */
    @Override
    public Point2d multiply(Double multiplier) {
        vector[0] = vector[0]*multiplier;
        vector[1]  = vector[1]*multiplier;
        return this;
    }

    /** TODO
     * Add a scalar to the X and Y coordinates of a 2D point
     * @param adder Scalar to add
     * @return Added point
     */
    @Override
    public Point2d add(Double adder) {
        vector[0] = vector[0]+adder;
        vector[1]  = vector[1]+adder;
        return this;
    }

    /** TODO
     * @return Deep copy of the 2D point
     */
    @Override
    public Point2d clone() {
        Double[] clonedVector = new Double[vector.length];

        for (int i = 0; i < vector.length; i++) {
            clonedVector[i] = new Double(vector[i]);
        }

        return new Point2d(clonedVector);
    }

}
