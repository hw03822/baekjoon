SELECT TO_CHAR(sales_date, 'YYYY-MM-DD') as sales_date, product_id, user_id, sales_amount
FROM ONLINE_SALE
WHERE TO_CHAR(sales_date, 'YYYY-MM') = '2022-03'
UNION ALL
SELECT TO_CHAR(sales_date, 'YYYY-MM-DD') as sales_date, product_id, NULL as user_id, sales_amount
FROM OFFLINE_SALE 
WHERE TO_CHAR(sales_date, 'YYYY-MM') = '2022-03'
ORDER BY sales_date, product_id, user_id