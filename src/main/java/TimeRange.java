import java.time.LocalTime;

public record TimeRange(LocalTime start, LocalTime end) {

    public boolean contains(LocalTime time) {
        return time.isAfter(start) && time.isBefore(end);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeRange timeRange = (TimeRange) obj;
        return start.equals(timeRange.start) && end.equals(timeRange.end);
    }
}
