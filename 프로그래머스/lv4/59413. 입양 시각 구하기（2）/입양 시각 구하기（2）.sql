-- 이건 시간 전부가 안나오네 ,, 
-- SELECT TO_CHAR(datetime, 'HH24') as HOUR, COUNT(*) as COUNT
-- FROM ANIMAL_OUTS
-- GROUP BY TO_CHAR(datetime, 'HH24')

-- -- 계층형 쿼리를 사용해서 시간 표현
-- SELECT LEVEL-1
-- FROM DUAL 
-- CONNECT BY LEVEL <= 24

-- 답
SELECT HOUR, COUNT(datetime) as COUNT
FROM ANIMAL_OUTS a 
  RIGHT JOIN (
    SELECT LEVEL-1 as HOUR
    FROM DUAL 
    CONNECT BY LEVEL <= 24
    ) d
  ON TO_CHAR(datetime, 'HH24') = d.HOUR
GROUP BY HOUR
ORDER BY HOUR


-- SELECT *
-- FROM ANIMAL_OUTS a 
--   RIGHT JOIN (
--     SELECT LEVEL-1 as HOUR
--     FROM DUAL 
--     CONNECT BY LEVEL <= 24
--     ) d
--   ON TO_CHAR(datetime, 'HH24') = d.HOUR
-- ORDER BY HOUR
