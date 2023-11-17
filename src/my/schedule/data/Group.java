package my.schedule.data;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<Student> students;
    public Group(String groupName){
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student newcomer) {
        this.students.add(newcomer);
    }

    public String getGroupName(){
        return this.groupName;
    }

}
