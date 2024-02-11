package ariefbelajarteknologi.records.data;

import ariefbelajarteknologi.records.annotation.Valid;

public record Point(@Valid int x, @Valid int y) {

    public Point {
        System.out.println("Point Created");
    }

    public static final Point ZERO = new Point(0, 0);

    public static Point create(int x, int y) {
        return new Point(x, y);
    }
}
