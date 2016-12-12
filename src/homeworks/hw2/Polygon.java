package homeworks.hw2;

import java.text.DecimalFormat;

/**
 * This class is used to create a polygon object. Note that all values will be
 * rounded to the nearest hundredth. For example if you enter the sideLength to
 * be 45.2534, the program will automatically convert it to 45.25.
 *
 * @author Ed Fabre
 */
public class Polygon {

    // These are the variables which represent the properties of a polygon.
    private int numSides;
    private double sideLength;
    private double xCoord, yCoord;
    private double apothem;

    // Never really used, but included due to project specifications.
    private double perimeter = 20;

    /**
     * This no argument constructor creates a Polygon using defaults.
     */
    public Polygon() {
        this.numSides = 4;
        this.sideLength = 10.00;
        this.xCoord = 0.00;
        this.yCoord = 0.00;
        this.apothem = 5.00;
    }

    /**
     * This constructor allows user to customize their polygon.
     *
     * @param numSides
     * @param sideLength
     * @param xCoord
     * @param yCoord
     * @param apothem
     */
    public Polygon(int numSides, double sideLength, double xCoord,
            double yCoord, double apothem) {
        this.numSides = numSides;
        this.sideLength = roundTwoDecPlaces(sideLength);
        this.xCoord = roundTwoDecPlaces(xCoord);
        this.yCoord = roundTwoDecPlaces(yCoord);
        this.apothem = roundTwoDecPlaces(apothem);
    }

    /**
     * This method returns the area of the polygon.
     *
     * @return
     */
    public double getArea() {
        return roundTwoDecPlaces((.5) * getApothem() * getPerimeter());
    }

    /**
     * This method returns the number of sides.
     *
     * @return
     */
    public int getNumSides() {
        return numSides;
    }

    /**
     * This method returns the length of the sides.
     *
     * @return
     */
    public double getSideLength() {
        return roundTwoDecPlaces(sideLength);
    }

    /**
     * This method returns the x coordinate of polygon.
     *
     * @return
     */
    public double getxCoord() {
        return roundTwoDecPlaces(xCoord);
    }

    /**
     * This method returns the y coordinate of polygon.
     *
     * @return
     */
    public double getyCoord() {
        return roundTwoDecPlaces(yCoord);
    }

    /**
     * This method returns the apothem of the polygon.
     *
     * @return
     */
    public double getApothem() {
        return roundTwoDecPlaces(apothem);
    }

    /**
     * This method returns the perimeter of the polygon.
     *
     * @return
     */
    public double getPerimeter() {
        return roundTwoDecPlaces((double) (getNumSides() * getSideLength()));
    }

    /**
     * This method sets the number of sides.
     *
     * @param numSides
     */
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    /**
     * This method sets the length of the sides.
     *
     * @param sideLength
     */
    public void setSideLength(double sideLength) {
        this.sideLength = roundTwoDecPlaces(sideLength);
    }

    /**
     * This method sets the x coordinate of the polygon.
     *
     * @param xCoord
     */
    public void setxCoord(double xCoord) {
        this.xCoord = roundTwoDecPlaces(xCoord);
    }

    /**
     * This method sets the y coordinate of the polygon.
     *
     * @param yCoord
     */
    public void setyCoord(double yCoord) {
        this.yCoord = roundTwoDecPlaces(yCoord);
    }

    /**
     * This method sets the apothem of the polygon.
     *
     * @param apothem
     */
    public void setApothem(double apothem) {
        this.apothem = roundTwoDecPlaces(apothem);
    }

    /**
     * This method sets the perimeter of the polygon. It is never really used
     * since perimeter is calculated based on numSides and sideLength.
     *
     * @param perimeter
     */
    public void setPerimeter(double perimeter) {
        this.perimeter = roundTwoDecPlaces(perimeter);
    }

    /**
     * This overrides the toString() method build in.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Polygon Type: " + getPolygonType() + "\n"
                + "numSides=" + getNumSides() + "\n"
                + "sideLength=" + getSideLength() + "\n"
                + "xCoord=" + getxCoord() + "\n"
                + "yCoord=" + getyCoord() + "\n"
                + "apothem=" + getApothem() + "\n"
                + "perimeter=" + getPerimeter() + "\n";
    }

    /////////////////////////// Extra Methods! ///////////////////////////
    /**
     * This extra method rounds a double 2 decimal places then returns double.
     */
    public static double roundTwoDecPlaces(double input) {
        DecimalFormat df = new DecimalFormat("###.##");

        // Used to convert from string to double again.
        return Double.parseDouble(df.format(input));
    }

    /**
     * This extra method returns the name of the polygon just incase the user
     * would like that additional information. Polygon Type is also included in
     * the toString method to help use identify what shape it is they are
     * looking at.
     *
     * @return
     */
    public String getPolygonType() {
        if (numSides < 3) {
            return "Not a polygon";
        }

        switch (getNumSides()) {
            case 3:
                return "Triangle";
            case 4:
                return "Quadrilateral";
            case 5:
                return "Pentagon";
            case 6:
                return "Hexagon";
            case 7:
                return "Heptagon";
            case 8:
                return "Octagon";
            case 9:
                return "Enneagon";
            case 10:
                return "Decagon";
            case 11:
                return "Hendecagon";
            case 12:
                return "Dodecagon";
            case 13:
                return "Tridecagon";
            case 14:
                return "Tetradecagon";
            case 15:
                return "Pendedecagon";
            case 16:
                return "Hexdecagon";
            case 17:
                return "Heptdecagon";
            case 18:
                return "Octdecagon";
            case 19:
                return "Enneadecagon";
            case 20:
                return "Icosagon";
            default:
                return numSides + "-Sided Polygon";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

}
