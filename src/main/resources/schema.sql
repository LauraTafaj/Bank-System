-- schema.sql
CREATE TABLE Account (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    balance DOUBLE
);

CREATE TABLE Transaction (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    date TIMESTAMP,
    amount DOUBLE,
    reason VARCHAR(255),
    fee DOUBLE,
    account_id BIGINT,
    FOREIGN KEY (account_id) REFERENCES Account(id)
);
