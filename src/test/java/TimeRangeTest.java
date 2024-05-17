import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.print.Doc;
import java.util.Date;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TimeRangeTest {

    @Test
    public void BasicTimeRangeContains(){
        TimeRange timeRange = new TimeRange(LocalTime.of(10, 0), LocalTime.of(20, 0));
        assertTrue(timeRange.contains(LocalTime.of(12, 0)));
        assertTrue(timeRange.contains(LocalTime.of(15, 0)));
        assertFalse(timeRange.contains(LocalTime.of(8, 0)));
    }

    @Test
    void TimeRangesAreEqual() {
        TimeRange timeRange1 = new TimeRange(LocalTime.of(10, 0), LocalTime.of(20, 0));
        TimeRange timeRange2 = new TimeRange(LocalTime.of(10, 0), LocalTime.of(20, 0));
        assertEquals(timeRange1, timeRange2);
    }

}
