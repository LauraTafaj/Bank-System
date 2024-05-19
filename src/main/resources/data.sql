
INSERT INTO Account (name, balance) VALUES ('Alice', 1000.00);
INSERT INTO Account (name, balance) VALUES ('Bob', 500.00);
INSERT INTO Account (name, balance) VALUES ('Charlie', 1200.00);


INSERT INTO Transaction (date, amount, reason, fee, account_id) VALUES ('2024-05-01', 100.00, 'Deposit', 0.00, 1);
INSERT INTO Transaction (date, amount, reason, fee, account_id) VALUES ('2024-05-02', 50.00, 'Withdrawal', 0.00, 2);
INSERT INTO Transaction (date, amount, reason, fee, account_id) VALUES ('2024-05-03', 200.00, 'Transfer to Bob', 10.00, 1);
INSERT INTO Transaction (date, amount, reason, fee, account_id) VALUES ('2024-05-03', 200.00, 'Transfer from Alice', 10.00, 2);
INSERT INTO Transaction (date, amount, reason, fee, account_id) VALUES ('2024-05-04', 300.00, 'Deposit', 0.00, 3);
