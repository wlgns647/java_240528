# 회원 상태를 추가 : 기간 정지, 영구 정지, 사용
INSERT INTO MEMBER_STATE VALUES
('기간 정지'),('영구 정지'),('사용');

# 신고 타입을 추가
INSERT INTO REPORT_TYPE VALUES
('욕설'),('허위사실유포'),('광고'),('음란'),('커뮤니티에 맞지 않음'),('기타');

# '공지' 커뮤니티를 등록
INSERT INTO COMMUNITY VALUES
(NULL, '공지');

# 회원가입 :
# id : abc123, pw : abc123, email : abc123@naver.com
# id : qwe123, pw : qwe123, email : qwe123@naver.com
# id : def123, pw : def123, email : def123@naver.com
INSERT INTO MEMBER(ME_ID, ME_PW, ME_EMAIL, ME_MS_NAME) VALUE
('abc123','abc123','abc123@naver.com', '사용');
INSERT INTO MEMBER(ME_ID, ME_PW, ME_EMAIL, ME_MS_NAME) VALUE
('qwe123','qwe123','qwe123@naver.com', '사용');
INSERT INTO MEMBER(ME_ID, ME_PW, ME_EMAIL, ME_MS_NAME) VALUE
('def123','def123','def123@naver.com', '사용');
# 관리자 :
# id : admin123, pw : admin123, email : admin123@naver.com
INSERT INTO MEMBER(ME_ID, ME_PW, ME_EMAIL, ME_AUTHORITY, ME_MS_NAME) VALUE
('admin123','admin123','admin123@naver.com', 'ADMIN', '사용');

# 관리자가 '축구', '야구', '배구', '올림픽' 커뮤니티를 추가했을 때 필요한 쿼리
INSERT INTO COMMUNITY VALUES
(NULL, '축구'),(NULL, '야구'),(NULL, '배구'),(NULL, '올림픽');

# abc123회원이 축구 커뮤니티에 게시글 2개 작성했습니다.(제목과 내용은 알아서)
INSERT INTO POST(PO_TITLE, PO_CONTENT, PO_ME_ID, PO_CO_NUM)
SELECT '축구 커뮤니티 활성화방안', '이하 생략', 'abc123', CO_NUM
FROM
   COMMUNITY
WHERE
   CO_NAME = '축구';
    
INSERT INTO POST(PO_TITLE, PO_CONTENT, PO_ME_ID, PO_CO_NUM)
SELECT '축구는 재밌다', '재밌다', 'abc123', CO_NUM
FROM
   COMMUNITY
WHERE
   CO_NAME = '축구';
    
# abc123회원이 야구 커뮤니티에 게시글 1개 작성했습니다.(제목과 내용은 알아서)
INSERT INTO POST(PO_TITLE, PO_CONTENT, PO_ME_ID, PO_CO_NUM)
SELECT '올해 우승은?', '어느 팀이 할까요?', 'abc123', CO_NUM
FROM
   COMMUNITY
WHERE
   CO_NAME = '야구';
    
# abc123회원이 배구 커뮤니티에 게시글 1개 작성했습니다.(제목과 내용은 알아서)
INSERT INTO POST(PO_TITLE, PO_CONTENT, PO_ME_ID, PO_CO_NUM)
SELECT '올해 우승은?', '어느 팀이 할까요?', 'abc123', CO_NUM
FROM
   COMMUNITY
WHERE
   CO_NAME = '배구';
    
# abc123회원이 올림픽 커뮤니티에 게시글 3개 작성했습니다.(제목과 내용은 알아서)
INSERT INTO POST(PO_TITLE, PO_CONTENT, PO_ME_ID, PO_CO_NUM)
SELECT '양궁 남자 단체 우승!', '축하합니다.', 'abc123', CO_NUM
FROM
   COMMUNITY
WHERE
   CO_NAME = '올림픽';
    
INSERT INTO POST(PO_TITLE, PO_CONTENT, PO_ME_ID, PO_CO_NUM)
SELECT '양궁 여자 단체 우승!', '축하합니다.', 'abc123', CO_NUM
FROM
   COMMUNITY
WHERE
   CO_NAME = '올림픽';
    
INSERT INTO POST(PO_TITLE, PO_CONTENT, PO_ME_ID, PO_CO_NUM)
SELECT '매달은 몇개?', '대한민국 화이팅', 'abc123', CO_NUM
FROM
   COMMUNITY
WHERE
   CO_NAME = '올림픽';
    
# qwe123회원이 축구 커뮤니티에 게시글 2개 작성했습니다.(제목과 내용은 알아서)
INSERT INTO POST(PO_TITLE, PO_CONTENT, PO_ME_ID, PO_CO_NUM)
SELECT '올해 우승은?', '어느 팀이 할까요?', 'qwe123', CO_NUM
FROM
   COMMUNITY
WHERE
   CO_NAME = '축구';
    
INSERT INTO POST(PO_TITLE, PO_CONTENT, PO_ME_ID, PO_CO_NUM)
SELECT 'K리그좀 잘 부탁해요', '잘 부탁해요', 'qwe123', CO_NUM
FROM
   COMMUNITY
WHERE
   CO_NAME = '축구';
    
# qwe123회원이 올림픽 커뮤니티에 게시글 1개 작성했습니다.(제목과 내용은 알아서)
INSERT INTO POST(PO_TITLE, PO_CONTENT, PO_ME_ID, PO_CO_NUM)
SELECT '대한민국 선수들 화이팅!', '화이팅!', 'qwe123', CO_NUM
FROM
   COMMUNITY
WHERE
   CO_NAME = '올림픽';
    
# qwe123 회원이 1번 게시글을 클릭해서 상세를 확인했을 때 쿼리
UPDATE POST SET PO_VIEW = 1
# 1번 게시글에 qwe123 회원이 추천을 눌렀을 때 쿼리

# 1번 게시글에 qwe123 회원이 추천을 눌렀을 때 쿼리