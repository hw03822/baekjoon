-- 코드를 입력하세요
SELECT DISTINCT TO_CHAR(n.sales_date,'YYYY') as YEAR, 
        -- TO_NUMBER(SUBSTR(n.sales_date, 6, 2)) as MONTH,
        TO_NUMBER(TO_CHAR(n.sales_date,'MM')) as MONTH,
        GENDER, 
        COUNT(DISTINCT n.user_id) over (partition by TO_CHAR(n.sales_date,'YYYY'), 
                                    TO_NUMBER(TO_CHAR(n.sales_date,'MM')), gender) as USERS
FROM ONLINE_SALE n, USER_INFO u
WHERE n.user_id = u.user_id and gender IS NOT NULL
ORDER BY YEAR, MONTH, GENDER