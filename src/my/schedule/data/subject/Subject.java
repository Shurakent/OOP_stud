package my.schedule.data.subject;

public class Subject implements SubjectInterface {
    private String subjectName;
    private String instructor;
    private int subjectID;

    public Subject(String subjectName, String instructor, int subjectID) {
        this.subjectName = subjectName;
        this.instructor = instructor;
        this.subjectID = subjectID;
    }

    // Геттеры и сеттеры
    public String getSubjectName() {
        return subjectName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getSubjectID() {
        return subjectID;
    }
    @Override
    public void displaySubjectInfo() {
        System.out.println("Предмет: " + getSubjectName() + ", Преподаватель: " + getInstructor() + ", ID: " + getSubjectID());
    }
}
