-- 입양간 동물
-- SELECT i.aniaml_id, i.name, i.datetime, o.datetime, 
--         o.datetime - i.datetime as period
-- from animal_ins i inner join animal_outs o on i.animal_id = o.animal_id
-- order by period desc

-- 답
SELECT i.animal_id, i.name
from animal_ins i, animal_outs o 
where i.animal_id = o.animal_id
order by o.datetime - i.datetime desc
fetch next 2 rows only -- 두개 봅기 