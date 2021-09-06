package com.shmitt.fakultativ.service;

import com.shmitt.fakultativ.dao.CoursesRepository;
import com.shmitt.fakultativ.entity.Courses;
import com.shmitt.fakultativ.exception.DaoException;
import com.shmitt.fakultativ.util.ConnectionManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CoursesService {

    private CoursesRepository coursesRepository;

    public CoursesService(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    public List<Courses> findAll() {
        return coursesRepository.findAll();
    }

    public List<Courses> findAllFromShortest() {
        return coursesRepository.findAllFromShortest();
    }

    public List<Courses> findByName(String name) {
        return coursesRepository.findByName(name);
    }
}
