public class MovingObject {
    private double x, y, vx, vy;
    private int size;

    public MovingObject(double x, double y, double vx, double vy, int size) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.size = size;
    }

    public MovingObject move() {
        double newx = x + vx;
        double newy = y + vy;

        if (newx < 0 || newx > 800) {
            vx = -vx;
        }

        if (newy < 0 || newy > 600) {
            vy = -vy;
        }

        x = x + vx;
        y = y + vy;
        return this;
    }

    public void draw(Screen s) {
        s.circle((int) x, (int) y, size);
    }

    public static void main(String[] args) {
        final int NUM_OBJECTS = 500;
        Screen screen = new Screen(800,600);

        // screen.line(80,80,400,400);

        // MovingObject mv = new MovingObject(200, 200, -2, -1);
        MovingObject mv[] = new MovingObject[NUM_OBJECTS];
        for (int i=0; i < mv.length; i++) {
            int xRand = (int)(Math.random()*800);
            int yRand = (int)(Math.random()*600);
            int xvRand = (int)(Math.random()*10);
            int yvRand = (int)(Math.random()*10);
            int szRand = (int)(Math.random()*50);
            mv[i] = new MovingObject(xRand, yRand, xvRand, yvRand, szRand);
        }

        while(true) {
            // System.out.println(mv.x+ " " +mv.y);
            screen.clear();
            for (int i=0; i<mv.length; i++) {
                mv[i].move().draw(screen);
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




/* von Petra und Thomas
public class MovingObject {
    private static final double XMAX = 800;
    private static final double YMAX = 600;
    private static final double XMIN = 0;
    private static final double YMIN = 0;

    private double x;
    private double y;
    private double vx;
    private double vy;

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
*/