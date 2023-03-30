-- outs에 기록존재 하지만 ins에 존재x
-- outs 기록 확인
-- select name 
-- from animal_outs

-- select animal_id, name 
-- from animal_ins
-- where animal_id not in (select animal_id from animal_outs)
-- order by animal_id

select animal_id, name 
from animal_outs
where animal_id not in (select animal_id from animal_ins)
order by animal_id