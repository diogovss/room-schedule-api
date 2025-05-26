INSERT INTO department (name) VALUES ('Computer Science'), ('Mathematics');
INSERT INTO title (name) VALUES ('Assistant Professor'), ('Associate Professor');

INSERT INTO professor (name, department_id, title_id) VALUES ('Diogo', 1, 1), ('Vinicius', 2, 2);

INSERT INTO building (name) VALUES ('Main Building'), ('Science Hall');
INSERT INTO room (building_id) VALUES (1), (2);

INSERT INTO subject (code, name, professor_id) VALUES ('CS101', 'Intro to Programming', 1), ('CS102', 'Data Structures', 2);

INSERT INTO subject_prerequisite (subject_id, prerequisiteid) VALUES (2, 1);

INSERT INTO class (subject_id, year, semester, code) VALUES (1, 2025, '1', 'A'), (2, 2025, '1', 'B');

INSERT INTO class_schedule (klass_id, room_id, day_of_week, start_time, end_time)
VALUES 
(1, 1, 'Monday', '08:00', '10:00'),
(1, 1, 'Wednesday', '08:00', '10:00'),
(2, 2, 'Tuesday', '10:00', '12:00'),
(2, 2, 'Thursday', '10:00', '12:00');