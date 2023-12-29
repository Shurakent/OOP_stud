package my.schedule.data.group;

import my.schedule.data.student.Student;
import my.schedule.data.course.Course;

import java.util.List;

public class Group  implements GroupInterface {
    private String groupName;
    private List<Student> students;
    private List<Course> courses;

    public Group(String groupName, List<Student> students, List<Course> courses) {
        this.groupName = groupName;
        this.students = students;
        this.courses = courses;
    }

    // Методы для управления студентами и курсами
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void displayGroupInfo() {
        System.out.println("Группа: " + groupName);
        System.out.println("Студенты: ");
        for (Student student : students) {
            System.out.println("  - " + student.getFirstName() + " " + student.getLastName());
        }
        System.out.println("Курсы:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName());
        }
    }
}
