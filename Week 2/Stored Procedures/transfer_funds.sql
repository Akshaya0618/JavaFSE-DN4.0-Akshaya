CREATE OR REPLACE PROCEDURE TransferFunds (
  from_id IN NUMBER,
  to_id IN NUMBER,
  amount IN NUMBER
) IS
  insufficient_balance EXCEPTION;
BEGIN
  DECLARE
    from_balance NUMBER;
  BEGIN
    SELECT balance INTO from_balance FROM accounts WHERE account_id = from_id;

    IF from_balance < amount THEN
      RAISE insufficient_balance;
    ELSE
      UPDATE accounts
      SET balance = balance - amount
      WHERE account_id = from_id;

      UPDATE accounts
      SET balance = balance + amount
      WHERE account_id = to_id;

      DBMS_OUTPUT.PUT_LINE('Transfer successful.');
    END IF;
  EXCEPTION
    WHEN insufficient_balance THEN
      DBMS_OUTPUT.PUT_LINE('Insufficient balance in source account.');
    WHEN NO_DATA_FOUND THEN
      DBMS_OUTPUT.PUT_LINE('Account not found.');
  END;
END;
/
BEGIN
  TransferFunds(1, 2, 1000);
END;
/
