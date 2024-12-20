CREATE TABLE IF NOT EXIST tasks(
    id BIGID AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50)
);
INSERT INTO tasks(id,title,description,status)
    VALUES('Learn Spring', 'Understand basics of Spring Boot', 'In Progress');