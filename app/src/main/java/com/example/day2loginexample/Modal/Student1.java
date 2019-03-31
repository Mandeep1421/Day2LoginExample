package com.example.day2loginexample.Modal;

import android.os.Parcelable;

import java.io.Serializable;
import java.util.Arrays;

public class Student1 implements Serializable
{


    private String sid;
    private String sname;
    private String gender;
     private int[] marks;
    private int total;
    private int per;

    public Student1(String sid, String sname, String gender, int m[])
    {
        this.sid=sid;
        this.sname=sname;
        this.gender=gender;
         this.marks=m;

    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", gender='" + gender + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ", total=" + total +
                ", per=" + per +
                '}';
    }
}
