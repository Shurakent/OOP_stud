package my.schedule.data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Lesson> lessons;

    public Course(String courseName) {
        this.courseName = courseName;
        this.lessons = new ArrayList<>();
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public List<Lesson> getLessons() {
        return lessons;
    }
}
