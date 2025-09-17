import java.util.*;

public class ipa25 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        double ans = findDistance(p1, p2);
        System.out.printf("%.3f", ans); // Rounded to 3 decimal places
    }

    public static double findDistance(Point p1, Point p2) {
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
