package com.shmitt.fakultativ.menu;

import com.shmitt.fakultativ.dao.CoursesDao;
import com.shmitt.fakultativ.service.CoursesService;

public class MenuController {

    public static void findAllOutput() {
        var coursesService = CoursesService.getInstance();
        var courses = CoursesService.findAll();
        System.out.println(courses);
    }

    public void findAllShortestOutput() {
        var coursesService = CoursesService.getInstance();
//        var courses = CoursesService.findAllFromShortest();
//        System.out.println(courses);
    }

    public void findByNameOutput() {
        var coursesService = CoursesService.getInstance();
//        var coursesByName = CoursesService.findByName("JavaScript");
//        System.out.println(coursesByName);
    }

}