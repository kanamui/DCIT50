package dcit50.constructor;

import java.awt.Point;

/**
 *
 * @author Charles
 */
public class Rectangle {
    
    Point p;
    int w, l;
    
    Rectangle(Point point) {
        this.p = point;
    }
    
    Rectangle(int x, int y) {
        this.p = new Point(x, y);
    }
    
    Rectangle(Point point, int width, int length) {
        this.p = point;
        this.w = width;
        this.l = length;
    }
    
    Rectangle(int x, int y, int width, int length) {
        this.p = new Point(x, y);
        this.w = width;
        this.l = length;
    }
    
    @Override
    public String toString() {
        return "[x=" + String.valueOf(p.x) + ",y=" + String.valueOf(p.y) +
               ",w=" + String.valueOf(w) + ",l=" + String.valueOf(l) + "]";
    }
}
