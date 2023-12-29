package my.schedule.data.course;

import my.schedule.data.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Course implements CourseInterface {
    private String courseName;
    private int courseID;
    private List<Subject> subjects;

    public Course(String courseName, int courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void removeSubject(Subject subject) {
        subjects.remove(subject);
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Курс: " + courseName + ", ID: " + courseID);
        System.out.println("Предметы:");
        for (Subject subject : subjects) {
            System.out.println("  - " + subject.getSubjectName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}