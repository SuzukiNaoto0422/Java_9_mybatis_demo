DROP TABLE IF EXISTS members;

CREATE TABLE members (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 birthday DATE NOT NULL,
 age int NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO `members` (`id`, `name`, `birthday`, `age`) VALUES
(1, '夏目　漱石', '1867-02-09', 49),
(2, '芥川　龍之介', '1892-03-01', 35),
(3, '樋口　一葉', '1872-05-02', 24),
(4, '太宰　府', '1909-06-19', 38),
(5, '宮沢　賢治', '1896-08-27', 37);
