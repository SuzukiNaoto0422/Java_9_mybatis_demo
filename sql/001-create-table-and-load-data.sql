DROP TABLE IF EXISTS members;

CREATE TABLE members (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 birthday DATE NOT NULL,
 age int NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO members (id, name, birthday, age) VALUES (1, "夏目　漱石", 18670209, 49);
INSERT INTO members (id, name, birthday, age) VALUES (2, "芥川　龍之介", 18920301, 35);
INSERT INTO members (id, name, birthday, age) VALUES (3, "樋口　一葉", 18720502, 24);
INSERT INTO members (id, name, birthday, age) VALUES (4, "太宰　府", 19090619, 38);
INSERT INTO members (id, name, birthday, age) VALUES (5, "宮沢　賢治", 18960827, 37);
