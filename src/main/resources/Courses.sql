CREATE TABLE courses
(
    id      integer      NOT NULL,
    name    varchar(100) NOT NULL,
    teacher varchar(100) NOT NULL,
    hours   integer      NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO courses (name, teacher, hours)
values ('Java Start', 'Herbert Shield', 80),
       ('Java Trainee', 'Head First', 100),
       ('Java Junior', 'Max Master', 150),
       ('JavaScript Trainee', 'Judi Hulk', 98),
       ('JavaScript Start', 'Vinni Oops', 70),
       ('JavaScript Junior', 'John Black', 92),
       ('Maven', 'Nata Power', 111);
