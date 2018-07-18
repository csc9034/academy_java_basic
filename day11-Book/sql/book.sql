
-- 1. book 테이블 생성
CREATE TABLE book
(  bookid      VARCHAR2(5) 
 , title       VARCHAR2(200)   NOT NULL
 , author      VARCHAR2(50)    NOT NULL
 , price       NUMBER(10)
 , isbn        VARCHAR2(13)
 , publish     VARCHAR2(30)
 , regdate     DATE            DEFAULT sysdate
 , moddate     DATE
 , constraint pk_book PRIMARY KEY (bookid)
);

-- 2. book 데이터 추가
INSERT INTO book(BOOKID, TITLE, AUTHOR, PRICE, ISBN, PUBLISH) 
VALUES (?, ?, ?, ?, ?, ?)

-- 3. book 데이터 수정
UPDATE book b SET b.TITLE = ?, b.AUTHOR = ?, b.PRICE = ?, b.ISBN = ?, b.PUBLISH = ? 
WHERE b.BOOKID =?;

-- 4. book 데이터 삭제
DELETE FROM book b 
 WHERE b.BOOKID = ?;
 
-- 5. 데이터 조회 (1건)
SELECT b.BOOKID
      ,b.TITLE
      ,b.AUTHOR
      ,b.PRICE
      ,b.ISBN
      ,b.PUBLISH
  FROM book b
 WHERE b.BOOKID = ?
 
-- 6. 데이터 전체 조회
 SELECT b.BOOKID
      ,b.TITLE
      ,b.AUTHOR
      ,b.PRICE
      ,b.ISBN
      ,b.PUBLISH
  FROM book b;
  
-- 7. 최저가 최고가 사이의 데이터 조회
 SELECT b.BOOKID
      ,b.TITLE
      ,b.AUTHOR
      ,b.PRICE
      ,b.ISBN
      ,b.PUBLISH
  FROM book b;
-- WHERE b.PRICE BETWEEN '" + low + "' AND '" + high + "'";

-- 8. 최저가 최고가 사이의 데이터 조회
 SELECT b.BOOKID
      ,b.TITLE
      ,b.AUTHOR
      ,b.PRICE
      ,b.ISBN
      ,b.PUBLISH
  FROM book b;
 WHERE b.TITLE LIKE '%'" + keyword + "' % '";
