-- 입양간 동물
-- SELECT i.aniaml_id, i.name, i.datetime, o.datetime, 
--         o.datetime - i.datetime as period
-- from animal_ins i inner join animal_outs o on i.animal_id = o.animal_id
-- order by period desc

-- 답
select animal_id, name
from (
        SELECT i.animal_id, i.name, i.datetime, o.datetime, 
        o.datetime - i.datetime as period
        from animal_ins i inner join animal_outs o on i.animal_id = o.animal_id
        order by period desc
     )
where rownum <= 2