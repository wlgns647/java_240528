# insert
# 한 행( 레코드)의 데이터를 추가할 때 사용
# 문법
# insert into 테이블명(속성1,....,속성n) value(값1,...,값n);
# value 는 한번에 한 행을 추가할 때 사용
# 속성의 개수가 값으 개수와 같아야함
insert into student.student(studentNum, grade, class, num, name)
value(null, 1, 1, 1, '홍길동');

# insert into 테이블명(속성1,....,속성n) values(값1,...,값n),(값1,...,값n)
# values는 한번에 한개 이상의 행을 추가할 때 사용.
# 속성의 개수가 값의 개수와 같아야함
insert into student.student(grade, class, num, name)
value(1, 1, 2, '임꺽정'), (1,1,3, '고길동');


# insert into 테이블명 value (값1,...,값n);
# 테이블명 옆에 속성명을 생략한 경우 table 생성시 추가했던 속성 순서대로 값들을 넣어주어야 함
# 전체 속성 개수만큼 값들을 넣어줘야함.
insert into student,student value(null, 1, 1, 4, enf

# update
# 특정 행들의 값들을 변경할 때 사용
# update 테이블명 set 속성명1 = 값1, ..., 속성명n = 값n where 조건
# = : 같다, ! = : 다르다 <> : 다르다
# is null : null이면, is not null : null이 아니면 
# and : ~ 하고, or : ~이거나
# and 와 or 의 우선순위가 다름. and가 높음.
# 날짜는 'yyyy-mm-dd hh:ss:mm' 형태의 문자열과 비교가능 =, >=, <=, !=를 활용할 수 있다 
update student set name = '또치' where student.studentNum = 2;

# 워크 벤치에서는 안전하게 수정/삭제할 수 있게 하기 위해 기본키가 아닌 조건으로 
# 수정/삭제하려고 하면 수정/삭제를 하지 못하도록 막음 
# 해결방법: Edit > Preferences... > 
UPDATE student
set 
	name = '마이콜'
WHERE
	student.grade = 1 and student.class=1 and student.num = 2;
    














