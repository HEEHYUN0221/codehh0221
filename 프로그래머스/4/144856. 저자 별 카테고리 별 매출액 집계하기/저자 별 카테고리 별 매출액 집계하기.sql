-- 코드를 입력하세요
-- (SELECT B.BOOK_ID, SUM(B.PRICE*S.SALES) AS TOTAL_SALES,CATEGORY  FROM BOOK B JOIN BOOK_SALES S ON B.BOOK_ID=S.BOOK_ID GROUP BY BOOK_ID,CATEGORY) T JOIN AUTHOR A ON A.

-- SELECT T.AUTHOR_ID, A.AUTHOR_NAME, T.CATEGORY, T.TOTAL_SALES FROM (SELECT SUM(B.PRICE*S.SALES) AS TOTAL_SALES,CATEGORY,B.AUTHOR_ID  FROM BOOK B JOIN BOOK_SALES S ON B.BOOK_ID=S.BOOK_ID GROUP BY B.AUTHOR_ID,B.CATEGORY) T JOIN AUTHOR A ON A.AUTHOR_ID=T.AUTHOR_ID ORDER BY A.AUTHOR_ID ASC, T.CATEGORY DESC;

-- SELECT B.PRICE*S.SALES AS TOTAL_SALES,CATEGORY,B.AUTHOR_ID  FROM BOOK B JOIN BOOK_SALES S ON B.BOOK_ID=S.BOOK_ID GROUP BY B.AUTHOR_ID,B.CATEGORY

-- SELECT T.AUTHOR_ID, A.AUTHOR_NAME, T.CATEGORY, T.TOTAL_SALES FROM (SELECT B .BOOK_ID,SUM(B.PRICE*S.SALES) AS TOTAL_SALES, B.CATEGORY, B.AUTHOR_ID FROM BOOK B JOIN BOOK_SALES S ON B.BOOK_ID=S.BOOK_ID WHERE S.SALES_DATE LIKE '2022-01-%' GROUP BY B.BOOK_ID,B.AUTHOR_ID, B.CATEGORY )T JOIN AUTHOR A ON A.AUTHOR_ID=T.AUTHOR_ID GROUP BY T.CATEGORY, T.AUTHOR_ID ORDER BY A.AUTHOR_ID ASC, T.CATEGORY DESC;

SELECT T.AUTHOR_ID, A.AUTHOR_NAME, T.CATEGORY, T.TOTAL_SALES FROM (SELECT B .BOOK_ID,SUM(B.PRICE*S.SALES) AS TOTAL_SALES, B.CATEGORY, B.AUTHOR_ID FROM BOOK B JOIN BOOK_SALES S ON B.BOOK_ID=S.BOOK_ID WHERE S.SALES_DATE LIKE '2022-01-%' GROUP BY B.CATEGORY,B.AUTHOR_ID)T JOIN AUTHOR A ON A.AUTHOR_ID=T.AUTHOR_ID GROUP BY T.CATEGORY, T.AUTHOR_ID ORDER BY A.AUTHOR_ID ASC, T.CATEGORY DESC;

