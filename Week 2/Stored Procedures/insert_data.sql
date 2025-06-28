-- Insert sample customer data
INSERT INTO customers VALUES (1, 'Akshaya', 65, 12000, 8.5, 'FALSE');
INSERT INTO customers VALUES (2, 'Abishek', 45, 8000, 9.0, 'FALSE');
INSERT INTO customers VALUES (3, 'John', 70, 15000, 10.0, 'FALSE');
INSERT INTO customers VALUES (4, 'Aisha', 30, 5000, 7.5, 'FALSE');

-- Insert sample loan data
INSERT INTO loans VALUES (101, 1, SYSDATE + 10);
INSERT INTO loans VALUES (102, 2, SYSDATE + 40);
INSERT INTO loans VALUES (103, 3, SYSDATE + 5);
INSERT INTO loans VALUES (104, 4, SYSDATE + 25);

COMMIT;