BEGIN
  FOR cust IN (SELECT customer_id, age, loan_interest FROM customers) LOOP
    IF cust.age > 60 THEN
      UPDATE customers
      SET loan_interest = cust.loan_interest - 1
      WHERE customer_id = cust.customer_id;

      DBMS_OUTPUT.PUT_LINE('Discount applied to Customer ID: ' || cust.customer_id);
    END IF;
  END LOOP;
END;
/
