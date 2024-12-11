-- 코드를 입력하세요
-- FROM (SELECT BOARD_ID,WRITER_ID FROM USED_GOODS_BOARD WHERE MAX(VIEWS) = VIEWS) T JOIN USED_GOODS_FILE F

SELECT CONCAT('/home/grep/src/',T.BOARD_ID,"/",F.FILE_ID,F.FILE_NAME,F.FILE_EXT) AS FILE_PATH FROM (SELECT B.BOARD_ID FROM (SELECT MAX(VIEWS) AS VIEWS FROM USED_GOODS_BOARD) T JOIN USED_GOODS_BOARD B ON T.VIEWS=B.VIEWS) T JOIN USED_GOODS_FILE F ON T.BOARD_ID=F.BOARD_ID ORDER BY F.FILE_ID DESC;

