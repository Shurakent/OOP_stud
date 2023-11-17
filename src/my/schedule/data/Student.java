package my.schedule.data;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private List<Course> courses;

    public String getName(){
        return name;
    }
    public Student(String name, String id){
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }
    public void addToACourse(Course newCourse){
        this.courses.add(newCourse);
    }
}
