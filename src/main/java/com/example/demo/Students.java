package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Students {
    @Id
    private int StudentId;
    private String stName;


    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }
    @Override
    public String toString() {
        return "Students{" +
                "StudentId=" + StudentId +
                ", stName='" + stName + '\'' +
                '}';
    }

}
