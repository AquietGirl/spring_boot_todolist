drop table  IF EXISTS todo;
CREATE TABLE todo (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  content VARCHAR(100),
  status VARCHAR(10)
);