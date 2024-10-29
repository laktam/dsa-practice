# Write your MySQL query statement below
select l1.num as ConsecutiveNums 
from logs l1
inner join logs l2
on l1.id = l2.id + 1 and l1.num = l2.num
inner join logs l3
on l2.id = l3.id + 1 and l2.num = l3.num
group by l1.num