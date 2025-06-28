BEGIN
  FOR cust IN (SELECT customer_id, balance FROM customers) LOOP
    IF cust.balance > 10000 THEN
      UPDATE customers
      SET isvip = 'TRUE'
      WHERE customer_id = cust.customer_id;

      DBMS_OUTPUT.PUT_LINE('VIP status granted to Customer ID: ' || cust.customer_id);
    END IF;
  END LOOP;
END;
/
