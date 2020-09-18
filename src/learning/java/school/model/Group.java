package learning.java.school.model;

import javax.swing.*;

public class Group {
    private Professor professor;
    private Student[] students;
    private int availability;
    private int enrolled;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Group(int availability) {
        this.availability = availability;
        students = new Student[availability];

    }
    public Group(int availability,Professor professor) {
        this.availability = availability;
        students = new Student[availability];
        setProfessor(professor);
    }

    public int getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(int enrolled) {
        this.enrolled = enrolled;
    }

    public void printStudentsList(){
        for(int i = 0; i < enrolled; i++) {
            System.out.println(students[i].getName());
        }
    }

    public void addStudent(Student student){
        if (availability>enrolled) {
            students[enrolled] = student;
            enrolled++;
        }
        else
            System.out.println("El grupo esta lleno");
    }
}

