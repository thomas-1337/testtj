public class MovingObject {
    private static final double XMAX = 800;
    private static final double YMAX = 600;
    private static final double XMIN = 0;
    private static final double YMIN = 0;

    private double x = 0;
    private double y = 0;
    private double vx = 0;
    private double vy = 0;

    public MovingObject move() {
        if (this.x + vx > XMAX || this.x + vx < XMIN)
            vx = -vx;
        if (this.y + vy > YMAX || this.y + vy < YMIN)
            vy = -vy;


        this.x = this.x + vx;
        this.y = this.y + vy;
        return this;
    }

    public MovingObject(double x, double y, double vx, double vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVx() {
        return vx;
    }

    public double getVy() {
        return vy;
    }
}
