select * 
from player;

select * 
from team;

select * 
from player
where avg_score = 150;

select p.avg_score
from player p
where p.avg_score = 150;

select * 
from player
where avg_score <> 250;

select * 
from player
where avg_score between 100 and 200
order by player_name;

select t.team_name
from team t
join player p
on t.team_id = p.team_id 
where p.avg_score = 100;

select t.team_name 
from player p
join team t
on t.team_id = p.team_id 
where p.avg_score = 100;

select t.team_id, t.team_name, p.player_name party_people
from team t
left join player p
on p.team_id = t.team_id
order by t.team_id, p.player_name;

select t.team_id, t.team_name, p.player_name 
from player p
right join team t
on p.team_id = t.team_id
order by t.team_id, p.player_name;

select t.team_id, t.team_name, p.player_id, p.player_name 
from team t
full join player p
on p.team_id = t.team_id
order by t.team_id, p.player_name;

select t.team_id, t.team_name, p.player_name 
from player p
cross join team t
order by t.team_id, p.player_name;

---Aggregate functions
select count(*) 
from player  
where avg_score  = 500;

select p.team_id, count(*)
from player p 
group by p.team_id 
having count(*) > 1
order by p.team_id;

select p.player_id, count(*)
from player p 
group by p.player_id 
having count(*) > 1
order by p.player_id;

select max(avg_score) highest_score
from player;

select SUM(avg_score)
from player;

select team_id, sum(avg_score)
from player
group by team_id;


select avg(avg_score) 
from player;

---Non Aggregate/Scalar functions
---Math functions
select round(22.5); 
select round(1733.2626, 3); 
select abs(-333.87);
select log(2, 32); 
select mod(10, 4);
select pi(); 
select power(3, 4); 
select random(); 
select sqrt(125);
select div(51, 3); 
select ceil(-57.8);
select ceiling (57.8);
select trunc(353.88663); 

select *
from player 
where avg_score = 300/2;

select sum(avg_score) as total_score
from player 
where avg_score >= 200;

--String functions
select ascii('2');
select ascii('gf'); 
select bit_length ('noon');
select bit_length ('hello');
select char_length('noon');
select char_length('hello');
select char_length('hello there'); 
select concat('S', 'Q', 'L');
select concat('you', ' are', ' awesome'); 
select concat_ws(',', 'Last Name', 'First Name'); 
select left('paradise', 3); 
select right('motivation', 3);
select length('motivation');
select lower('MOTIVATION');
select ltrim(' see you soon'); 
select repeat('mynameisjulia', 3); 
select reverse('abcdefg'); 


---Date-time
select player_id, dob, date_trunc('hour', dob) truncated_date
from player
order by player_id 
;


update player
set dob = '2005-01-02 01:56:29'
where player_id = 2
;

select max(player_id)
from player
;

insert into player (
	player_id,
	player_name,
	team_id,
	avg_score,
	dob
)
values (
	8,
	'Peter',
	600,
	1000,
	'1999-05-22 05:06:07'
)
;


commit;

select *
from player p
order by player_id 
;

---Operators
select player_id, player_name
from player 
union
select team_id, team_name
from team
;

select birth_city as city
from player 
union
select team_city 
from team
order by city 
;


select birth_city as city
from player 
union all
select team_city 
from team
order by city 
;

--intersect--> returs the intersection of 2 or more datasets
select birth_city as city
from player 
intersect
select team_city 
from team
order by city 
;


---minus--->substracts the results of one query from another
---except--->returns all the rows in the first SELECT statement that are not returned by the second SELECT statement
---there is no difference in the EXCEPT clause and the MINUS class
---EXCEPT is available in the PostgreSQL database whine MINUS is not
select birth_city as city
from player 
except
select team_city 
from team
order by city 
;
















