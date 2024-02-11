package ariefbelajarteknologi.records.util;

import ariefbelajarteknologi.records.data.Line;
import ariefbelajarteknologi.records.data.Point;
import org.junit.jupiter.api.Test;

class RecordTest {

    @Test
    void beforeRecordPatterns() {
        Record record = new Record();
        record.printObjectBeforeRecordsPattern(new Point(10, 10));
    }

    @Test
    void afterRecordPatterns() {
        Record record = new Record();
        record.printObjectAfterRecordsPattern(new Point(20, 20));
        record.printObjectAfterRecordsPattern(new Line(new Point(0, 0), new Point(10, 10)));
    }
}