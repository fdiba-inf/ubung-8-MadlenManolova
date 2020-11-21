package exercise8;

public class Point {
    // Define attributes
    private double x;
    private double y;

    public Point() {
        // Initialize attributes to 0
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        // Initialize attributes by coping x and y parameters
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        // Initialize attributes by coping attributes of otherPoint
        x = otherPoint.x;
        y = otherPoint.y;
    }

    public void initialize() {
        // Change attributes through console
        System.out.println("Geben Sie einen Wert zum x ein: ");
        x = Utils.INPUT.nextDouble();
        System.out.println("Geben Sie einen Wert zum y ein: ");
        y = Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        // Change attributes by adding xDelta and yDelta
        x += xDelta;
        y += yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        // Create new point which is translated relative to this point
        double newx = x + xDelta;
        double newy = y + yDelta;
        return new Point (newx, newy);
    }

    public boolean equals(Point otherPoint) {
        // Compare attributes of this point to attributes of otherPoint for equality
        boolean checkx = Utils.equals(x, otherPoint.x);
        boolean checky = Utils.equals(y, otherPoint.y);
        return checkx && checky;
    }

    public String toString() {
        // Represent attributes as string
        return "(" + x + ", " + y + ")";
    }
}
