package com.shmitt.fakultativ.dao;

import com.shmitt.fakultativ.entity.Courses;
import com.shmitt.fakultativ.service.CoursesService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface CoursesDao {

    public static final CoursesService INSTANCE = new CoursesService();

    // read
    List<Courses> findAll();
    List<Courses> findAllFromShortest();
    Optional<Courses>findByName(String name);

    Courses buildCourses(ResultSet resultSet) throws SQLException;


}
