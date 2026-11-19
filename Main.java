import java.util.*;

class Student {

    private int studentId;
    private String studentName;
    private String email;
    private String courseName;
    private double programmingScore;
    private double mathematicsScore;
    private List<String> technicalSkills;

    Student(int id, String name, String email, String course,
            double programming, double mathematics, List<String> skills) {

        this.studentId = id;
        this.studentName = name;
        this.email = email;
        this.courseName = course;
        this.programmingScore = programming;
        this.mathematicsScore = mathematics;
        this.technicalSkills = new ArrayList<>(skills);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public double calculateAverage() {
        return (programmingScore + mathematicsScore) / 2;
    }

    public void displayDetails() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Email: " + email);
        System.out.println("Course: " + courseName);
        System.out.println("Programming: " + programmingScore);
        System.out.println("Mathematics: " + mathematicsScore);
        System.out.println("Skills: " + technicalSkills);
        System.out.println("Average: " + calculateAverage());
    }
}

public class Main {

    public static void main(String[] args) {

        List<String> skills = Arrays.asList("Java", "Python", "SQL");

        Student s1 = new Student(
                101, "Rahul", "rahul@gmail.com",
                "CSIT", 85, 90, skills
        );

        s1.displayDetails();
    }
}