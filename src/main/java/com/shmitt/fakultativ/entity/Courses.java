package com.shmitt.fakultativ.entity;

public class Courses {

    private Integer id;
    private String name;
    private String teacher;
    private Integer hours;

    public Courses(Integer id, String name, String teacher, Integer hours) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.hours = hours;
    }

    public Courses() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", hours=" + hours +
                '}';
    }
}
