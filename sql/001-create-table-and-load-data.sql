DROP TABLE IF EXISTS members;

CREATE TABLE members (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO members (id, name) VALUES (1, "suzuki");
INSERT INTO members (id, name) VALUES (2, "saitou");
INSERT INTO members (id, name) VALUES (3, "kohaku");
