-- 코드를 입력하세요
/*SELECT T1.MEMBER_NAME, R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE,'%Y-%m-%d') AS REVIEW_DATE 
FROM (SELECT M.MEMBER_NAME,M.MEMBER_ID FROM(SELECT MAX(T1.CNT), T1.MEMBER_ID 
FROM (SELECT COUNT(*) AS CNT, MEMBER_ID FROM REST_REVIEW GROUP BY MEMBER_ID) T1 JOIN REST_REVIEW R ON T1.MEMBER_ID=R.MEMBER_ID) T JOIN MEMBER_PROFILE M ON T.MEMBER_ID=M.MEMBER_ID) T1 JOIN REST_REVIEW R ON T1.MEMBER_ID=R.MEMBER_ID ORDER BY REVIEW_DATE ASC, R.REVIEW_TEXT ASC*/


/*SELECT T1.MEMBER_NAME, R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE,'%Y-%m-%d') AS REVIEW_DATE 
FROM (SELECT M.MEMBER_NAME,M.MEMBER_ID FROM (SELECT COUNT(*) AS CNT, MEMBER_ID FROM REST_REVIEW GROUP BY MEMBER_ID ORDER BY CNT DESC LIMIT 1) T1 JOIN REST_REVIEW R ON T1.MEMBER_ID=R.MEMBER_ID) T JOIN MEMBER_PROFILE M ON T.MEMBER_ID=M.MEMBER_ID*/

SELECT M.MEMBER_NAME, T.REVIEW_TEXT, T.REVIEW_DATE FROM(SELECT R.MEMBER_ID, R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE,'%Y-%m-%d') AS REVIEW_DATE FROM (SELECT COUNT(*) AS CNT, MEMBER_ID FROM REST_REVIEW GROUP BY MEMBER_ID ORDER BY CNT DESC LIMIT 1) T1 JOIN REST_REVIEW R ON T1.MEMBER_ID=R.MEMBER_ID) T JOIN MEMBER_PROFILE M ON T.MEMBER_ID=M.MEMBER_ID ORDER BY T.REVIEW_DATE ASC, T.REVIEW_TEXT ASC