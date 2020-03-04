public class MovingObjectMain {
    public static void main(String[] args) {
        MovingObject o = new MovingObject(0,0,100,100);

        System.out.println("Position: " + o.getX() + ", " + o.getY());
        System.out.println("Speed   : " + o.getVx() + ", " + o.getVy());
        System.out.println("---------------------");

        for (int i=0; i < 20; i++) {
            o.move();
            System.out.println("Position: " + o.getX() + ", " + o.getY());
            System.out.println("Speed   : " + o.getVx() + ", " + o.getVy());
            System.out.println("---------------------");
        }

    }
}
