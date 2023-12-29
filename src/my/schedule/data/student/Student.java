package my.schedule.data.student;

public class Student implements StudentInterface{
    private String firstName;
    private String lastName;
    private int studentID;

    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    // Геттеры и сеттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }
    public void displayStudentInfo() {
        System.out.println("Студент: " + getFirstName() + " " + getLastName() + ", ID: " + getStudentID());
    }
}

