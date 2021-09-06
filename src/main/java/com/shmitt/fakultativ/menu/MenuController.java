package com.shmitt.fakultativ.menu;

import com.shmitt.fakultativ.dao.CoursesRepositoryImpl;
import com.shmitt.fakultativ.service.CoursesService;

public class MenuController {

    private CoursesService coursesService;

    public MenuController() {
        coursesService = new CoursesService(new CoursesRepositoryImpl());
    }

    public void findAllOutput() {
        var courses = coursesService.findAll();
        System.out.println(courses);
    }

    public void findAllShortestOutput() {
        var courses = coursesService.findAllFromShortest();
        System.out.println(courses);
    }

    public void findByNameOutput() {
        var coursesByName = coursesService.findByName("JavaScript");
        System.out.println(coursesByName);
    }
}