package com.shmitt.fakultativ.dao;

import com.shmitt.fakultativ.entity.Courses;
import com.shmitt.fakultativ.exception.DaoException;
import com.shmitt.fakultativ.util.ConnectionManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CoursesRepositoryImpl implements CoursesRepository {

    @Override
    public List<Courses> findAll() {
        try (var connection = ConnectionManager.get();
             var prepareStatement = connection.prepareStatement(FIND_ALL_SQL)) {
            var resultSet = prepareStatement.executeQuery();
            List<Courses> courses = new ArrayList<>();
            while (resultSet.next()) {
                courses.add(buildCourses(resultSet));

            }
            return courses;
        } catch (SQLException throwables) {
            throw new DaoException(throwables);
        }
    }

    @Override
    public List<Courses> findAllFromShortest() {
        try (var connection = ConnectionManager.get();
             var prepareStatement = connection.prepareStatement(FIND_ALL_FROM_SHORTEST_SQL)) {
            var resultSet = prepareStatement.executeQuery();
            List<Courses> courses = new ArrayList<>();
            while (resultSet.next()) {
                courses.add(buildCourses(resultSet));

            }
            return courses;
        } catch (SQLException throwables) {
            throw new DaoException(throwables);
        }
    }

    @Override
    public List<Courses> findByName(String name) {
        try (var connection = ConnectionManager.get();
             var prepareStatement = connection.prepareStatement(FIND_BY_NAME_SQL)) {
            prepareStatement.setString(1, name);
            var resultSet = prepareStatement.executeQuery();
            List<Courses> courses = new ArrayList<>();
            while (resultSet.next()) {
                courses.add(buildCourses(resultSet));
            }

            return courses;
        } catch (SQLException throwables) {
            throw new DaoException(throwables);
        }
    }

    public Courses buildCourses(ResultSet resultSet) throws SQLException {
        return new Courses(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getString("teacher"),
                resultSet.getInt("hours")
        );
    }
}
