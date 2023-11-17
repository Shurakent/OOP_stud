package my.schedule.data;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Lesson {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
    private String classroom;

    public Lesson(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime, String classroom) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return String.format("%s, %s - %s, Classroom: %s",
                dayOfWeek, startTime, endTime, classroom);
    }
}