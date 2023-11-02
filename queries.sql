--Part 1

-- int id (primary key), varchar(255) employer, varchar(255) name, varchar(255) skills

--Part 2

SELECT name FROM employer WHERE location = "St. Louis City";

--Part 3

DROP TABLE job;

--Part 4

SELECT *
FROM skill
INNER JOIN job_skills on skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;