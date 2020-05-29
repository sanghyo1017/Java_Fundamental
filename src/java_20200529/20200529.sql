SELECT * from emp
#select + 칼럼명 -> from + 테이블명 => 입력한 칼럼명만 출력됨
SELECT empno, ename, job
FROM emp

#특정 칼럼만 내림차순 하고싶은 경우, order by + 칼럼명 + desc
#특정 칼럼만 오름차순 하고싶은 경우, order by + 칼럼명 + asc
#asc, desc 쓰지 않을 경우 기본값은 asc(오름차순)
SELECT empno, sal, deptn
FROM emp
ORDER BY  sal DESC;

#emp 테이블에서 사원번호, 급여, 입사일을 출력. 단, 급여가 적은 순서대로
SELECT empno, sal, hiredate
FROM emp
ORDER BY sal ASC;

#emp 테이블에서 직업, 급여를 출력. 단, 직업명으로 오름차순, 급여로 내림차순
SELECT job, sal
FROM emp
ORDER BY job ASC,sal DESC; #직업 먼저 오름차순한 것  중에   급여를 내림차순

#alias ; 칼럼에 별칭 븥이기
#별칭에 공백이 있을 경우 쌍따옴표를 붙인다.
#as는 붙여도 되고 안붙여도 되고
#emp 테이블에서 empno는 사원번호로, ename은 사원이름으로, 
#칼럼 정보를 바꿔서 출력하시오
SELECT empno AS 사원번호, ename AS 사원이름
FROM emp;
SELECT empno "사원 번호", ename "사원 이름"
FROM emp;

#emp 테이블에서 부서번호가 10번인 사원들의 부서번호와
#급여와 10프로 인상된 금액을 같이 출력
#부서번호가 몇번인~의 조건이 붙었으므로 where(조건절)을 사용한다.
SELECT deptno, sal, sal*1.1
FROM emp
WHERE deptno = 10;

#emp 테이블에서 부서번호가 10번인 사원들의 부서번호와
#급여와 급여+커미션을 출력
#null값으로 산술연산을 하면 무조건 null이 출력됨
#ifnull ; 값이 널이면 제로값으로 출력을 하라
SELECT deptno, sal, sal+ifnull(comm,0)
FROM emp
WHERE deptno = 10;

#emp 테이블에서 급여가 3000이상인 사원들의 모든 정보를 출력
# 모든 정보를 출력
SELECT * from emp
WHERE sal>=3000;

#emp 테이블에서 부서번호가 30번이 아닌 사람들의 이름과 부서번호를 출력
SELECT ename, deptno
FROM emp
WHERE deptno!=30;

#emp 테이블에서 부서번호가 10번이고 급여가 3000이상인 사원들의 급여를 출력
SELECT ename, sal
FROM emp
WHERE deptno=10 AND sal>=3000;

#emp 테이블에서 직업이 salesman이거나 manager인 사원의 
#사원번호와 부서번호를 출력
SELECT empno, deptno, job
FROM emp
WHERE job = 'salesman' OR job ='manager';

#위의 or연산을 and 연산으로 바꾸면 다음과 같다.
SELECT empno, deptno, job
FROM emp
WHERE job!='clerk' AND job!='president' AND job!='analyst';

#or연산은 이렇게 복잡함
SELECT empno,deptno, job
FROM emp
WHERE job = 'salesman'
UNION ALL
SELECT empno, deptno, job
FROM emp
WHERE job = 'manager'

#부서번호가 10번이거나 20번인 사원의 사원번호, 이름, 부서번호 출력하기
SELECT empno, ename, deptno
FROM emp
WHERE deptno ='10' OR deptno='20';
#위의 or 연산을 제외식으로  바꾸면
SELECT empno, ename, deptno
FROM emp
WHERE deptno !='30';

#급여가 1000과 2000사이인 사원들의 사원번호, 이름, 급여를 출력.
select empno, ename, sal
FROM emp
WHERE sal BETWEEN 1000 AND 2000;
#위 연산을 and 연산으로 바꿀 수 있음
SELECT empno, ename, sal
FROM emp
WHERE sal>=1000 AND sal<=2000;

#사원이름이 'ford'와 'scott' 사이의 사원들의 사원번호, 이름을 출력
#알파벳 사이의 값도 출력할 수 있음 (f와 s 사이의 알파벳 값에  해당)
SELECT empno, ename
FROM emp
WHERE ename BETWEEN 'ford' AND 'scott';
#위 연산을 and연산으로 바꿀 수 있음
#**select를 할 경우 아래처럼 무조건 정렬을 해야함!!!!!! 그냥 센스♥
SELECT empno, ename
FROM emp
WHERE ename>='ford' AND ename<='scott'
ORDER BY ename ASC;

#like1
#사원 이름이 j로 시작하는 사원의
#사원 이름과 부서번호 출력하기
SELECT ename, deptno
FROM emp
WHERE emame LIKE 'j%';

#like2
#사원 이름에서 'j'를 포함하는 사원의
#사원이름과 부서번호를 출력
SELECT ename, deptno
FROM emp
WHERE emame LIKE '%j';

#like3
#사원이름의 두번째 글자가 'A'인 사원의 이름, 급여, 입사일을 출력하기
SELECT ename, sal, hiredate
FROM emp
WHERE ename LIKE '_A%';

#like4
#사원 이름이 'ES'로 끝나는 사원의 이름, 급여, 입사일 출력하기
SELECT ename, sal, hiredate
FROM emp
WHERE ename LIKE '%ES';

#like5
#입사년도가 81년인 사원들의 입사일과 사원번호 출력하기
SELECT hiredate, empno
FROM emp
WHERE hiredate LIKE '1981%';

SELECT ename, deptno
FROM emp
WHERE deptno = '10'

SELECT ename, comm
FROM emp
WHERE comm = NULL;

#커미션이 null이 아닌 사원의 사원이름과 커미션을 출력
SELECT ename, comm
FROM emp
WHERE comm is NULL;

#연결연산자 concat
#=>단순히 문자열을 연결해서 하나의 문자열로 리턴한다.
SELECT CONCAT(ename,'의 직업은',job,'입니다.')
FROM emp;

#단일행함수 => 문자함수
#1)아스키코드
SELECT CHAR(97);

#2)concat(칼럼명,'붙일문자') => 문자열 연결함수
SELECT CONCAT(ename,'님') NAME
from emp;

#3)소문자로 바꾸기
SELECT LOWER(ename)
FROM emp;

#4)대문자로 바꾸기
SELECT UPPER(ename)
FROM emp;

#5)lpad('문자열', 전체자릿, '남는자리를 채울 문자')
SELECT LPAD('hi',10,'*')#leftPad
#->총 열자리 중 뒷자리에 문자'hi'를 넣고 남는 앞자리에*을 채운다.

#6)length
#한글의 경우, 음절은 3byte, 공백은 1byte
SELECT ename, LENGTH(ename)
FROM emp;
SELECT LENGTH('스미쓰');

SELECT ename, LEFT(ename,3)
FROM emp;

SELECT ename, RPAD(LEFT(ename,3),LENGTH(ename),'*')
from emp;

SELECT ename, RIGHT(ename,3)
FROM emp;

SELECT ename LPAD(RIGHT(ename,3),LENGTH(ename),'*')
FROM emp;

#substring ; (ename,n,m) ename을 n번째자리부터  m자리 출력
SELECT ename, SUBSTRING(ename,3,3)
FROM emp;

SELECT FORMAT(123456.34355,2);

SELECT ename, ifnull(comm,0)
FROM emp;

SELECT ABS(-50000000);

SELECT CEIL(4.06789);

SELECT FLOOR(4.7695);

SELECT ROUND(3.23451,2);

SELECT MOD(163,25);

SELECT truncate(123123.123567,3);

#날짜만
SELECT CURDATE();

#시간만
SELECT CURTIME();

#날짜 + 시간
SELECT NOW();

select ADDDATE(NOW(),INTERVAL 4 hour);

SELECT NOW(), ADDDATE(NOW(), INTERVAL 2 day);

CREATE TABLE test(
id VARCHAR(50) PRIMARY KEY,
sdate DATETIME,
edate DATETIME
);

INSERT INTO test(id,sdate,edate)
VALUES('sh12',NOW(),ADDDATE(NOW(), INTERVAL 2 DAY));

INSERT INTO test(id,sdate,edate)
VALUES('sh34',NOW(),ADDDATE(NOW(), INTERVAL 20 DAY));

INSERT INTO test(id,sdate,edate)
VALUES('sh56',NOW(),ADDDATE(NOW(), INTERVAL 40 DAY));

INSERT INTO test(id,sdate,edate)
VALUES('sh78',NOW(),ADDDATE(NOW(), INTERVAL 40 hour));

SELECT id, sdate, edate
FROM test;

#시간을 전으로 돌리는 것
SELECT NOW(), SUBDATE(NOW(), INTERVAL 2 HOUR);

#두 날짜의 차이
SELECT DATEDIFF('2020-05-29','1996-10-17');

SELECT id, DATEDIFF(edate, sdate) diff
FROM test;

SELECT id, TIMESTAMPDIFF(minute, sdate, edate)
FROM test;

SELECT id, DATE_FORMAT(sdate, '%Y/%m/%d') sdate
DATE_FORMAT(edate, '%Y.%m.%d %h:%i:%s') edate , edate
FROM test;

