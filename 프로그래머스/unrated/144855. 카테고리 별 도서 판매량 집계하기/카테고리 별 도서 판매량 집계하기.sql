-- 2022년 1월 도서 판매량
-- select book_id, sales_date, sales
-- from BOOK_SALES
-- where TO_CHAR(sales_date,'YYYY-MM') = '2022-01'

-- 2022년 1월 카테고리 별 도서 판매량
SELECT distinct category, 
        sum(sales) over(partition by category) as total_sales
from (
        select book_id, sales_date, sales
        from BOOK_SALES
        where TO_CHAR(sales_date,'YYYY-MM') = '2022-01'
    ) s left join book b on s.book_id = b.book_id
order by category