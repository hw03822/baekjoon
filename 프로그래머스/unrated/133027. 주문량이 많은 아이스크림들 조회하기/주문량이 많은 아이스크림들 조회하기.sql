-- 7월 아이스크림 총 주문량 + 상반기 아이스크림 총 주문량 더한 값 부터 줄세우고 상위 3개 조회하가
-- 맛이 기준이 되어야해
-- SELECT  h.shipment_id, h.flavor, sum(j.total_order) as july_total
-- FROM FIRST_HALF h, JULY j
-- WHERE h.flavor = j.flavor
-- group by h.shipment_id, h.flavor

--답1
-- select h.flavor -- 상반기 판매량 더하기
-- from ( -- 7월 아이스크림 판매량 더한후 
--     SELECT  h.shipment_id, h.flavor, sum(j.total_order) as july_total
--     FROM FIRST_HALF h, JULY j
--     WHERE h.flavor = j.flavor
--     group by h.shipment_id, h.flavor    
--     ) hj, first_half h
-- where hj.flavor = h.flavor
-- order by july_total + h.total_order desc
-- fetch first 3 rows only

--답2
SELECT h.flavor
FROM ( -- 상반기 아이스크림 판매량
        SELECT flavor, sum(total_order) as half_total 
        from FIRST_HALF 
        group by flavor
    ) h, 
    ( -- 7월 아이스크림 판매량
        SELECT flavor, sum(total_order) as july_total
        from JULY  
        group by flavor
    ) j
where h.flavor = j.flavor
order by half_total + july_total desc
fetch first 3 rows only