-- 코드를 입력하세요
/*SELECT P.PRODUCT_ID, P.PRODUCT_NAME, P.PRICE*O.AMOUNT AS TOTAL_SALES FROM FOOD_ORDER O JOIN FOOD_PRODUCT P ON O.PRODUCT_ID=P.PRODUCT_ID WHERE O.PRODUCE_DATE LIKE '2022-05%' ORDER BY TOTAL_SALES DESC, P.PRODUCT_ID ASC;*/

SELECT P.PRODUCT_ID, P.PRODUCT_NAME, T.TOTAL_SALES FROM FOOD_PRODUCT P JOIN (SELECT SUM(P.PRICE*O.AMOUNT) AS TOTAL_SALES, P.PRODUCT_ID FROM FOOD_ORDER O JOIN FOOD_PRODUCT P ON O.PRODUCT_ID=P.PRODUCT_ID WHERE O.PRODUCE_DATE LIKE '2022-05%' GROUP BY P.PRODUCT_ID)T ON P.PRODUCT_ID=T.PRODUCT_ID ORDER BY TOTAL_SALES DESC, P.PRODUCT_ID ASC;