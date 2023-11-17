package my.schedule;

import my.schedule.data.Course;
import my.schedule.data.Lesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule {
    private Map<Course, List<Lesson>> scheduleMap;

    public Schedule() {
        this.scheduleMap = new HashMap<>();
    }

    public void addCourse(Course course) {
        scheduleMap.put(course, new ArrayList<>());
    }

    public void addLesson(Course course, Lesson lesson) {
        if (scheduleMap.containsKey(course)) {
            List<Lesson> lessons = scheduleMap.get(course);
            lessons.add(lesson);
        }
    }

    public List<Lesson> getScheduleForCourse(Course course) {
        return scheduleMap.getOrDefault(course, new ArrayList<>());
    }
}






