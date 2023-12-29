package my.schedule;

import my.schedule.data.group.Group;
import my.schedule.data.subject.Subject;

public class Schedule implements ScheduleInterface {
    private Group group;
    private String dayOfWeek;
    private String startTime;
    private String endTime;
    private Subject subject;

    public Schedule(Group group, String dayOfWeek, String startTime, String endTime, Subject subject) {
        this.group = group;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.subject = subject;
    }

    // Геттеры и сеттеры
    public Group getGroup() {
        return group;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Subject getSubject() {
        return subject;
    }
    @Override
    public void displayScheduleInfo() {
        System.out.println("Расписание:");
        System.out.println("Группа: " + group.getGroupName());
        System.out.println("День: " + dayOfWeek);
        System.out.println("Время: " + startTime + " - " + endTime);
        System.out.println("Предмет: " + subject.getSubjectName());
    }
}
