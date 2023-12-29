package my;

import my.schedule.Schedule;
import my.schedule.ScheduleInterface;
import my.schedule.data.course.Course;
import my.schedule.data.course.CourseInterface;
import my.schedule.data.group.Group;
import my.schedule.data.group.GroupInterface;
import my.schedule.data.student.Student;
import my.schedule.data.student.StudentInterface;
import my.schedule.data.subject.Subject;
import my.schedule.data.subject.SubjectInterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем студентов
        Student student1 = new Student("Иван", "Иванов", 1);
        Student student2 = new Student("Петр", "Петров", 2);

        // Создаем курсы и добавляем предметы
        Course course1 = new Course("Первый курс", 101);
        Course course2 = new Course("Второй курс", 102);

        Subject subject1 = new Subject("Линейная алгебра", "Проф. Иванов", 201);
        Subject subject2 = new Subject("Механика", "Проф. Петров", 202);

        course1.addSubject(subject1);
        course2.addSubject(subject2);

        // Создаем группу и добавляем студентов и курсы
        List<Student> students = List.of(student1, student2);
        List<Course> courses = List.of(course1, course2);

        Group group = new Group("Группа 1", students, courses);

        // Создаем расписание и добавляем предмет
        Schedule schedule = new Schedule(group, "Понедельник", "10:00", "12:00", subject1);

        // Демонстрация использования интерфейсов
        displayInfo(student1);
        displayInfo(course1);
        displayInfo(group);
        displayInfo(subject1);
        displayInfo(schedule);
    }

    private static void displayInfo(Object obj) {
        if (obj instanceof StudentInterface) {
            ((StudentInterface) obj).displayStudentInfo();
        } else if (obj instanceof CourseInterface) {
            ((CourseInterface) obj).displayCourseInfo();
        } else if (obj instanceof GroupInterface) {
            ((GroupInterface) obj).displayGroupInfo();
        } else if (obj instanceof SubjectInterface) {
            ((SubjectInterface) obj).displaySubjectInfo();
        } else if (obj instanceof ScheduleInterface) {
            ((ScheduleInterface) obj).displayScheduleInfo();
        }
    }
}