package com.anmv.entity;

public class BrSE2305 {
    private int id;
    private String name;
    private String studentCode;
    private String gender;

    public BrSE2305(int id, String name, String studentCode, String gender) {
        this.id = id;
        this.name = name;
        this.studentCode = studentCode;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "BrSE2305{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentCode='" + studentCode + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
