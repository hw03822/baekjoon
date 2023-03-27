-- 2022-08 ~ 2022-10 사이 대여 횟수 5회 이상인 자동차
-- SELECT car_id, count(*)
-- from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
-- where TO_CHAR(start_date,'YYYY-MM') between '2022-08' and '2022-10'
-- group by car_id
-- having count(*) >= 5

-- -- 해당 기간 동안 월별 자동차 ID 총 대여 횟수
-- select TO_CHAR(start_date, 'MM'), car_id, count(*)
-- from CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- group by TO_CHAR(start_date, 'MM'), car_id

-- 답 합치기
select TO_NUMBER(TO_CHAR(start_date, 'MM')) as month, h.car_id, 
        count(*) as records
from CAR_RENTAL_COMPANY_RENTAL_HISTORY h, 
    (
        SELECT car_id, count(*)
        from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
        where TO_CHAR(start_date,'YYYY-MM') between '2022-08' and '2022-10'
        group by car_id
        having count(*) >= 5
    ) h2
where h.car_id = h2.car_id and (TO_CHAR(start_date,'YYYY-MM') between '2022-08' and '2022-10')
group by TO_NUMBER(TO_CHAR(start_date, 'MM')), h.car_id
having count(*) > 0
order by month, h.car_id desc