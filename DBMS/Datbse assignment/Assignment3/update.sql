CREATE TRIGGER modifyDate
BEFORE INSERT ON book_issue
FOR EACH ROW 
BEGIN
SET NEW.due_date = NOW() + INTERVAL 15 day;
END; 