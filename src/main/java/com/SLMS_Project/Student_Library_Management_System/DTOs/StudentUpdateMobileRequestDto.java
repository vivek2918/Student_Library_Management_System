package com.SLMS_Project.Student_Library_Management_System.DTOs;

public class StudentUpdateMobileRequestDto {

    private int id;
    private String mobNo;

    public StudentUpdateMobileRequestDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNO(String mobNO) {
        this.mobNo = mobNO;
    }
}
