package com.shmitt.fakultativ.dao;

import com.shmitt.fakultativ.entity.Courses;
import com.shmitt.fakultativ.service.CoursesService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface CoursesRepository {

    String FIND_ALL_SQL = "SELECT id, name, teacher, hours FROM courses";

    String FIND_ALL_FROM_SHORTEST_SQL = "SELECT id, name, teacher, hours FROM courses ORDER BY hours";

    String FIND_BY_NAME_SQL = "SELECT id, name, teacher, hours FROM courses WHERE name LIKE ?";

    // read
    List<Courses> findAll();
    List<Courses> findAllFromShortest();
    List<Courses>findByName(String name);
}
