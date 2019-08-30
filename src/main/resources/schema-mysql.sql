DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS insurance;
CREATE TABLE IF NOT EXISTS employee(code INT PRIMARY KEY, name VARCHAR(128) NOT NULL);
CREATE TABLE IF NOT EXISTS insurance(code INT PRIMARY KEY, name VARCHAR(128) NOT NULL, coverage_amount INT);