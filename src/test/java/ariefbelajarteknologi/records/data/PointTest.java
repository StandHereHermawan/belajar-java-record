package ariefbelajarteknologi.records.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void compactConstructor() {
        var point = new Point(20, 20);
        assertEquals(20, point.x());
        assertEquals(20, point.y());
    }
}