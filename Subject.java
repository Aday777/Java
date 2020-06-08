package com.edustation;

public class Subject extends Profile {
    public String subject_name;
    private double grades;
    private double attendance;

    public Subject(double grades, double attendance) {
        super(id);
        this.grades = grades;
        this.attendance = attendance;
    }

    public Subject(double grades) {
        super(id);
    }
}
