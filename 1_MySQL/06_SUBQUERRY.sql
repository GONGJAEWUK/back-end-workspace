/*
   서브쿼리(SUBQUERY), 중첩쿼리
   - 하나의 SQL문 안에 포함된 또 다른 SQL문
   - 서브쿼리를 수행한 결과값이 몇 행 몇 열이냐에 따라 분류
   - 서브쿼리 종류에 따라 서브쿼리와 사용하는 연산자가 달라짐
   
   1. 단일행 서브쿼리(SINGLE ROW SUBQUERY)
   
   - 서브쿼리의 조회 결과값의 개수가 오로지 1개일 때 (한 행 한 열)
   - 일반 비교연산자 사용 가능 : =,!=,<>, >, <, >=, <=, ...
   

*/

-- 노옹철 사원과 같은 부서원들을 조회
-- 1) 노옹철 사원의 부서코드 조회

SELECT dept_code
FROM employee
WHERE emp_name IN('노옹철');-- D9

-- 2) 부서코드가 'D9' 인 사원들 조회

SELECT *
FROM employee
WHERE dept_code = 'D9';

-- 3) 위의 2단계를 하나의 쿼리문으로! 

SELECT * 
FROM employee
WHERE dept_code = (SELECT dept_code
				    FROM employee
                    WHERE emp_name = '노옹철');
                    
-- 전 직원의 평균 급여보다 더 많은 급여를 받는 사원들의 사번, 사원명, 직급코드, 급여 조회

SELECT emp_id,emp_name,dept_code,salary
FROM employee
WHERE salary > (SELECT avg(salary)
				FROM employee);
                

-- 전지연 사원이 속해있는 부서원들의 사번, 직원명, 전화번호, 직급명, 부서명, 입사일 조회
-- 단, 전지연 사원은 제외
-- 전지연 사원이 속해있는 부서코드 조회
SELECT emp_id,emp_name,dept_title,phone,job_name,hire_date
FROM employee
	 JOIN job USING(job_code)
     JOIN department ON(dept_id = dept_code)
WHERE dept_code = (
SELECT dept_code
FROM employee  
WHERE emp_name = '전지연') AND emp_name != '전지연';
     

-- 부서별 급여의 합이 가장 큰 부서의 부서 코드, 급여의 합 조회

-- 서브 쿼리 쓰지 않았을 때 조회하는 방법
SELECT dept_code,sum(salary)
FROM employee
GROUP BY dept_code
ORDER BY 2 DESC
LIMIT 1;

-- 서브 쿼리 사용 
-- (1) 부서의 합이 가장 큰 값
-- (2) 테이블을 만들어서 max 사용

SELECT max(sum_sal)
FROM (SELECT dept_code,sum(salary) sum_sal
        FROM employee
          GROUP BY dept_code) dept_sum; -- 17700000
          

SELECT dept_code,sum(salary)
FROM employee
GROUP BY dept_code
HAVING sum(salary) = (SELECT max(sum_sal)
                       FROM (SELECT dept_code,sum(salary) sum_sal
                             FROM employee
                             GROUP BY dept_code) dept_sum);