package my;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

import my.schedule.Schedule;
import my.schedule.data.Course;
import my.schedule.data.Lesson;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        Course mathCourse = new Course("Math");
        Course physicsCourse = new Course("Physics");

        Lesson mathLesson1 = new Lesson(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(10, 30), "101");
        Lesson mathLesson2 = new Lesson(DayOfWeek.WEDNESDAY, LocalTime.of(9, 0), LocalTime.of(10, 30), "102");

        Lesson physicsLesson1 = new Lesson(DayOfWeek.TUESDAY, LocalTime.of(13, 0), LocalTime.of(14, 30), "201");

        mathCourse.addLesson(mathLesson1);
        mathCourse.addLesson(mathLesson2);

        physicsCourse.addLesson(physicsLesson1);

        schedule.addCourse(mathCourse);
        schedule.addCourse(physicsCourse);

        schedule.addLesson(mathCourse, mathLesson1);
        schedule.addLesson(mathCourse, mathLesson2);
        schedule.addLesson(physicsCourse, physicsLesson1);

        System.out.println("Math Course Schedule:");
        List<Lesson> mathSchedule = schedule.getScheduleForCourse(mathCourse);
        for (Lesson lesson : mathSchedule) {
            System.out.println(lesson);
        }

        System.out.println("\nPhysics Course Schedule:");
        List<Lesson> physicsSchedule = schedule.getScheduleForCourse(physicsCourse);
        for (Lesson lesson : physicsSchedule) {
            System.out.println(lesson);
        }
    }
}
