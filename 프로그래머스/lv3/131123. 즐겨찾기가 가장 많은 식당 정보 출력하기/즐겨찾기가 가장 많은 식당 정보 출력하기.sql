-- 음식종류별(food_type)로 즐겨찾기 수 가장 많은
-- select distinct food_type, max(favorites) over(partition by food_type)
-- from REST_INFO 

select i1.food_type, i1.rest_id, i1.rest_name, i1.favorites
from REST_INFO i1, 
    (
        select distinct food_type, max(favorites) over(partition by food_type) as favorites
        from REST_INFO 
    ) i2
where i1.food_type = i2.food_type and i1.favorites = i2.favorites
order by food_type desc
