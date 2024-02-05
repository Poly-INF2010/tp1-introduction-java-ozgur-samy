package Letter;

import Point.Point2d;
import Shape.*;

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

        // rectangle gauche
        Rectangle left = new Rectangle(maxHeight, stripeThickness);
        Point2d translate_left = new Point2d(-maxWidth,0.0 );
        left.translate(left.getCoords(), translate_left);
        left.rotate(left.getCoords(), Math.toRadians(-72.0));

        // rectangle droite
        Rectangle right = new Rectangle(maxHeight, stripeThickness);
        Point2d translate_right = new Point2d(maxWidth,0.0 );
        right.translate(right.getCoords(), translate_right);
        right.rotate(right.getCoords(), Math.toRadians(72.0));

        // rectangle milieu
        Rectangle middle = new Rectangle(halfMaxWidth, stripeThickness);
        Point2d translate_middle = new Point2d(0.0,maxHeight/2);
        middle.translate(middle.getCoords(), translate_middle);

        a.addAll(left.getCoords());
        a.addAll(right.getCoords());
        a.addAll(middle.getCoords());

        return a;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape b = new BaseShape();

        // rectangle vertical
        Rectangle vertical = new Rectangle(stripeThickness, maxHeight);

        // cercle du bas
        Circle down = new Circle(halfMaxHeight/1.9);
        // cercle du haut
        Circle up = new Circle(halfMaxHeight/1.9);
        // cercle pour faire le vide
        Circle empty = new Circle(halfMaxHeight/3);

        down.removeAll(empty.getCoords());
        up.removeAll(empty.getCoords());

        Point2d translate_down = new Point2d((halfMaxHeight/2.5), halfMaxHeight/2.0);
        Point2d translate_up = new Point2d((halfMaxHeight/2.5), -halfMaxHeight/2.0);

        down.translate(down.getCoords(), translate_down);
        up.translate(up.getCoords(), translate_up);

        b.addAll(vertical.getCoords());
        b.addAll(down.getCoords());
        b.addAll(up.getCoords());

        return b;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape c = new BaseShape();
        // grande ellipse
        Ellipse first = new Ellipse(halfMaxWidth, halfMaxHeight);
        // cercle vide
        Circle empty1 = new Circle(37.0);
        Point2d translate_empty1 = new Point2d(halfMaxWidth / 4 + stripeThickness/7, 0.0);
        empty1.translate(empty1.getCoords(), translate_empty1);
        //Ellipse vide
        Ellipse empty2 = new Ellipse(halfMaxWidth - 5, halfMaxHeight- 5);

        first.removeAll(empty1.getCoords());
        first.removeAll(empty2.getCoords());

        c.addAll(first.getCoords());

        return c;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape e = new BaseShape();

        // rectangle vertical
        Rectangle vertical = new Rectangle(stripeThickness,maxHeight);
        Point2d translate_vertical = new Point2d(-halfMaxWidth + halfStripeThickness, 0.0);
        vertical.translate(vertical.getCoords(), translate_vertical);

        // rectangle en haut
        Rectangle up = new Rectangle(maxWidth, stripeThickness);
        Point2d translate_up = new Point2d(0.0, halfMaxHeight - halfStripeThickness);
        up.translate(up.getCoords(), translate_up);

        // rectangle au centre
        Rectangle middle = new Rectangle(maxWidth, stripeThickness);
        Point2d translate_middle = new Point2d(0.0,0.0);
        middle.translate(middle.getCoords(), translate_middle);

        // rectangle en bas
        Rectangle down = new Rectangle(maxWidth, stripeThickness);
        Point2d translate_down = new Point2d(0.0, -halfMaxHeight + halfStripeThickness);
        down.translate(down.getCoords(), translate_down);

        e.addAll(vertical.getCoords());
        e.addAll(up.getCoords());
        e.addAll(middle.getCoords());
        e.addAll(down.getCoords());

        return e;
    }



    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape h = new BaseShape();

        // rectangle gauche
        Rectangle left = new Rectangle(stripeThickness, maxHeight);
        Point2d translate_left = new Point2d(-halfMaxWidth + halfStripeThickness, 0.0);
        left.translate(left.getCoords(), translate_left);

        // rectangle droit
        Rectangle right = new Rectangle(stripeThickness, maxHeight);
        Point2d translate_right = new Point2d(halfMaxWidth, 0.0);
        right.translate(right.getCoords(), translate_right);

        // rectangle centre
        Rectangle middle = new Rectangle(halfMaxWidth, stripeThickness);
        Point2d translate_middle = new Point2d(0.0, 0.0);
        middle.translate(middle.getCoords(), translate_middle);

        h.addAll(left.getCoords());
        h.addAll(right.getCoords());
        h.addAll(middle.getCoords());

        return h;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape n = new BaseShape();

        // rectangle gauche
        Rectangle left = new Rectangle(stripeThickness, maxHeight);
        Point2d translate_left = new Point2d(-halfMaxWidth - halfStripeThickness, 0.0);
        left.translate(left.getCoords(), translate_left);

        // rectangle droit
        Rectangle right = new Rectangle(stripeThickness, maxHeight);
        Point2d translate_right= new Point2d(halfMaxWidth - stripeThickness, 0.0);
        right.translate(right.getCoords(), translate_right);

        // rectangle centre
        Rectangle middle = new Rectangle(maxHeight, stripeThickness);
        middle.rotate(middle.getCoords(), Math.toRadians(73));
        Point2d translate_middle = new Point2d(-halfMaxWidth + stripeThickness, 0.0);
        middle.translate(middle.getCoords(), translate_middle);

        n.addAll(left.getCoords());
        n.addAll(right.getCoords());
        n.addAll(middle.getCoords());

        return n;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape o = new BaseShape();
        // ellipse
        Ellipse first = new Ellipse(halfMaxWidth, halfMaxHeight);
        // petite ellipse
        Ellipse empty = new Ellipse(halfMaxWidth-halfStripeThickness, halfMaxHeight-halfStripeThickness);

        first.removeAll(empty.getCoords());

        o.addAll(first.getCoords());

        return o;
    }

}
