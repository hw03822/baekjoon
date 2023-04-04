-- 7월 아이스크림 총 주문량 + 상반기 아이스크림 총 주문량 더한 값 부터 줄세우고 상위 3개 조회하가
-- 맛이 기준이 되야해
-- SELECT  h.shipment_id, h.flavor, sum(j.total_order) as july_total
-- FROM FIRST_HALF h, JULY j
-- WHERE h.flavor = j.flavor
-- group by h.shipment_id, h.flavor

select h.flavor--, july_total + h.total_order as total
from (
    SELECT  h.shipment_id, h.flavor, sum(j.total_order) as july_total
    FROM FIRST_HALF h, JULY j
    WHERE h.flavor = j.flavor
    group by h.shipment_id, h.flavor    
    ) hj, first_half h
where hj.flavor = h.flavor
order by july_total + h.total_order desc
fetch first 3 rows only