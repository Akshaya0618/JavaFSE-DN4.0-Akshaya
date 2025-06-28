ALTER TABLE customers ADD loan_due_date DATE;
UPDATE customers SET loan_due_date = SYSDATE + 20 WHERE customer_id = 1;
UPDATE customers SET loan_due_date = SYSDATE + 40 WHERE customer_id = 2;
COMMIT;
BEGIN
  FOR cust IN (SELECT customer_id, name, loan_due_date 
               FROM customers 
               WHERE loan_due_date BETWEEN SYSDATE AND SYSDATE + 30) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan for ' || cust.name || 
                         ' (Customer ID: ' || cust.customer_id || ') is due on ' || cust.loan_due_date);
  END LOOP;
END;
/
