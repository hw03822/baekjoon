-- SELECT r.member_id, p.member_name, 
--         RANK() over (order by count(r.member_id) desc) as cnt
-- FROM REST_REVIEW r left join MEMBER_PROFILE p on r.member_id = p.member_id
-- GROUP BY r.member_id, p.member_name
-- ORDER BY cnt


SELECT rp.member_name, r.review_text, TO_CHAR(r.review_date, 'YYYY-MM-DD') as review_date
FROM (
    SELECT r.member_id, p.member_name, 
        RANK() over (order by count(r.member_id) desc) as cnt
    FROM REST_REVIEW r left join MEMBER_PROFILE p on r.member_id = p.member_id
    GROUP BY r.member_id, p.member_name
    ORDER BY cnt
    ) rp left join REST_REVIEW r on rp.member_id = r.member_id
WHERE cnt = 1
ORDER BY review_date, review_text
