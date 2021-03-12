delete from user_pass;
delete from user;
delete from role;
INSERT INTO `user_pass` VALUES (1,'testhashc0de');
INSERT INTO car_db.user (id, first_name, last_name, user_name, password, date_of_birth) VALUES (1, 'Joe', 'Coyne', 'jcoyne', 'supersecret1', '1964-04-01');
INSERT INTO car_db.role (id, role_name, user_name, user_id) VALUES (1, 'admin', 'jcoyne', 1);