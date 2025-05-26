CREATE TABLE department (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE title (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE professor (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department_id INT REFERENCES department(id),
    title_id INT REFERENCES title(id)
);

CREATE TABLE building (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE room (
    id SERIAL PRIMARY KEY,
    building_id INT REFERENCES building(id)
);

CREATE TABLE subject (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20),
    name VARCHAR(100),
    professor_id BIGINT NOT NULL,
    CONSTRAINT fk_subject_professor FOREIGN KEY (professor_id) REFERENCES professor(id)
);

CREATE TABLE subject_prerequisite (
    id SERIAL PRIMARY KEY,
    subject_id INT REFERENCES subject(id),
    prerequisiteid INT REFERENCES subject(id)
);

CREATE TABLE class (
    id SERIAL PRIMARY KEY,
    subject_id INT REFERENCES subject(id),
    year INT,
    semester VARCHAR(10),
    code VARCHAR(20)
);

CREATE TABLE class_schedule (
    id SERIAL PRIMARY KEY,
    klass_id INT REFERENCES class(id),
    room_id INT REFERENCES room(id),
    day_of_week VARCHAR(10),
    start_time TIME,
    end_time TIME
);