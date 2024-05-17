import java.time.LocalTime;
import java.util.ArrayList;

public enum TimeShift {
    FirstShift,
    SecondShift,
    ThirdShift
}

class TimeShiftFactory {
    private static TimeShiftFactory instance;
    private static final ArrayList<TimeRange> timeShifts = new ArrayList<>();
    private TimeShiftFactory() {
    }

    public static TimeShiftFactory getInstance() {
        if (instance == null) {
            instance = new TimeShiftFactory();
        }
        return instance;
    }

    private TimeRange createTimeShift(LocalTime start, LocalTime end) {
        if (start == null || end == null) {
            return null;
        }
        for (TimeRange timeShift : timeShifts) {
            if (timeShift.start().equals(start) && timeShift.end().equals(end)) {
                return timeShift;
            }
        }
        TimeRange timeShift = new TimeRange(start, end);
        timeShifts.add(timeShift);
        return timeShift;
    }

    public TimeRange getTimeShift(TimeShift timeShift) {
        return switch (timeShift) {
            case FirstShift -> createTimeShift(LocalTime.of(8, 0), LocalTime.of(16, 0));
            case SecondShift -> createTimeShift(LocalTime.of(16, 0), LocalTime.of(0, 0));
            case ThirdShift -> createTimeShift(LocalTime.of(0, 0), LocalTime.of(8, 0));
            default -> throw new IllegalArgumentException("Invalid time shift");
        };
    }


}