package assignments;
//import java.util.*;

interface Polygon {
    double getArea();

    default double getPerimeter(int... sides) {
        int sum = 0;
        for (int s : sides) {
            sum += s;
        }
        return sum;
    }

    static String shapeInfo() {
        return "This is a Polygon shape.";
    }
}

class Rectangle implements Polygon {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Triangle implements Polygon {
    int base, height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Assignment_4 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 4);
        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter(5, 4, 5, 4));

        Triangle t = new Triangle(6, 3);
        System.out.println("Triangle Area: " + t.getArea());
        System.out.println("Triangle Perimeter: " + t.getPerimeter(3, 4, 5));
        
        System.out.println(Polygon.shapeInfo());
    }
}


/*
 package assignments;
 
import java.util.*;

// Interface
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

// MovablePoint class
class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}

// MovableCircle class
class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public void moveUp() { center.moveUp(); }
    public void moveDown() { center.moveDown(); }
    public void moveLeft() { center.moveLeft(); }
    public void moveRight() { center.moveRight(); }

    public String toString() {
        return "Circle Center: " + center + " Radius: " + radius;
    }
}

// MovableRectangle class
class MovableRectangle implements Movable {
    MovablePoint topLeft, bottomRight;

    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        if (topLeft.xSpeed == bottomRight.xSpeed &&
            topLeft.ySpeed == bottomRight.ySpeed) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        } else {
            System.out.println("Error: Speeds must be same!");
        }
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "Rectangle TopLeft: " + topLeft + 
               " BottomRight: " + bottomRight;
    }
}

// Main class
public class Assignment_4 {
    public static void main(String[] args) {

        // MovablePoint
        MovablePoint p = new MovablePoint(0, 0, 2, 2);
        System.out.println(p);
        p.moveRight();
        p.moveUp();
        System.out.println("After move: " + p);

        // MovableCircle
        MovableCircle c = new MovableCircle(5, new MovablePoint(1, 1, 1, 1));
        System.out.println(c);
        c.moveUp();
        c.moveRight();
        System.out.println("After move: " + c);

        // MovableRectangle
        MovableRectangle r = new MovableRectangle(
                new MovablePoint(0, 0, 1, 1),
                new MovablePoint(4, 4, 1, 1)
        );
        System.out.println(r);
        r.moveDown();
        r.moveLeft();
        System.out.println("After move: " + r);
    }
}
*/