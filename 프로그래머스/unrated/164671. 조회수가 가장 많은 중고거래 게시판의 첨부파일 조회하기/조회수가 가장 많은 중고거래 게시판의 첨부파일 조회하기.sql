-- 코드를 입력하세요
-- order by 에서 f.file_id 인식안되는 이유?? 아무래도 실행순서일라나
SELECT '/home/grep/src/' || b.board_id ||'/'|| f.file_id || f.file_name || f.file_ext as file_path
FROM USED_GOODS_BOARD b left join USED_GOODS_FILE f
    ON b.board_id = f.board_id
WHERE b.views = (select max(views) from USED_GOODS_BOARD)
order by file_id desc;