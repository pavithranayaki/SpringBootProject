package com.example.studentDetails.Entity;


import javax.persistence.*;

@Entity
@Table(name ="students")
public class Student {
    @Id

    private int id;
    private String name;
    private String email;

    public Student() {
    }

    public Student( String name, String email) {
        this.name = name;
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
