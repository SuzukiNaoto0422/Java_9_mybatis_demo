DROP TABLE IF EXISTS members;

CREATE TABLE members (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 birthday DATE NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO members (id, name, birthday) VALUES (1, "夏目　漱石", 18670209);
INSERT INTO members (id, name, birthday) VALUES (2, "芥川　龍之介", 18920301);
INSERT INTO members (id, name, birthday) VALUES (3, "樋口　一葉", 18720502);
INSERT INTO members (id, name, birthday) VALUES (4, "太宰　府", 19090619);
INSERT INTO members (id, name, birthday) VALUES (5, "宮沢　賢治", 18960827);
