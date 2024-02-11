package ariefbelajarteknologi.records.util;

import ariefbelajarteknologi.records.data.Line;
import ariefbelajarteknologi.records.data.Point;

public class Record {
    public void printObjectBeforeRecordsPattern(Object object) {
        if (object instanceof Point) {
            Point point = (Point) object;
            System.out.println(point.x());
            System.out.println(point.y());
        } else {
            System.out.println(object);
        }
    }

    public void printObjectAfterRecordsPattern(Object object) {
        if (object instanceof Line(Point(int startX, int startY), Point(int endX,int endY))){
            System.out.println(startX);
            System.out.println(startY);
            System.out.println(endX);
            System.out.println(endY);
        }else if (object instanceof Point) {
            Point point = (Point) object;
            System.out.println(point.x());
            System.out.println(point.y());
        } else {
            System.out.println(object);
        }
    }
    /*

    public void printObjectAfterRecordsPattern(Object object) {
        if (object instanceof Point(int x, int y)) {
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println(object);
        }
    }

    */
}
