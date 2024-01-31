package Letter;

import Point.Point2d;
import Shape.*;
import pabeles.concurrency.IntOperatorTask;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape a = new BaseShape();
        Rectangle d = new Rectangle(maxHeight, stripeThickness);

        Point2d translate_d = new Point2d(-maxWidth,0.0 );
        d.translate(d.getCoords(), translate_d);
        d.rotate(d.getCoords(), Math.toRadians(-70.0));

        Rectangle g = new Rectangle(maxHeight, stripeThickness);
        Point2d translate_g = new Point2d(maxWidth,0.0 );
        g.translate(g.getCoords(), translate_g);
        g.rotate(g.getCoords(), Math.toRadians(70.0));

        Rectangle m = new Rectangle(halfMaxWidth, stripeThickness);
        Point2d translate_m = new Point2d(0.0,maxHeight/2);
        m.translate(m.getCoords(), translate_m);

        a.addAll(d.getCoords());
        a.addAll(g.getCoords());
        a.addAll(m.getCoords());

        return a;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape a = new BaseShape();
        Rectangle d = new Rectangle(stripeThickness, maxHeight);
        Circle c_bas = new Circle(halfMaxHeight/2);
        Circle c_haut = new Circle(halfMaxHeight/2);
        Circle c_vide = new Circle(halfMaxHeight/2-stripeThickness);

        c_bas.removeAll(c_vide.getCoords());
        c_haut.removeAll(c_vide.getCoords());

        Point2d translate_c = new Point2d((halfMaxHeight/2.0), halfMaxHeight/2.0 );
        Point2d translate_c_haut = new Point2d((halfMaxHeight/2.0), -halfMaxHeight/2.0 );

        c_bas.translate(c_bas.getCoords(), translate_c);
        c_haut.translate(c_haut.getCoords(), translate_c_haut);

        a.addAll(d.getCoords());
        a.addAll(c_bas.getCoords());
        a.addAll(c_haut.getCoords());

        return a;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        return new BaseShape();
    }

}
