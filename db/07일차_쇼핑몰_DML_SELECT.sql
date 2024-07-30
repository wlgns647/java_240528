# 분류별 등록된 제품수를 조회하는 쿼리 
SELECT 
    CA_NAME 분류명, COUNT(PR_CODE) 제품수
FROM
    PRODUCT
RIGHT JOIN
	CATEGORY ON CA_NUM = PR_CA_NUM
GROUP BY CA_NUM;

# 옷으로 등록된 제품들을 조회하는 쿼리
select * 
fROM PRODUCT 
JOIN CATEGORY 
ON PR_CA_NUM = CA_NUM 
WHERE CA_NAME = '옷';

# '시원한' 이 들어간 제품을 검색>제목에 '시원한'이 포함된 제품을 조회하는 쿼리
SELECT * FROM PRODUCT WHERE PR_NAME LIKE CONCAT('% ','시원한','%');

# 누적 판매량이 가장 많은 제품들을 조회하는 쿼리
SELECT 
	DENSE_RANK() OVER(ORDER BY UM(BU_AMOUNT) DESC) 판매순위,PRODUCT.*, SUM(BU_AMOUNT) 판매량
FROM
	PRODUCT
		LEFT JOIN
        (SELECT * FROM BUY WHERE BU_STATE IN('구매','구매확정')) B ON BU_PR_CODE = PR_CODE
GROUP BY PR_CODE;

# 옷 제품들 중에서 가격이 높은 순으로 제품을 조회하는 쿼리
SELECT product.*
FROM product JOIN CATEGORY ON PR_CA_NUM = CA_NUM
WHERE 
	CA_NAME = '옷'
ORDER BY PR_PRICE DESC;

# ABC123 회원이 구매목록을 조회하는 쿼리 
SELECT 
	DISTINCT BU_PR_CODE 
FROM
	BUY 
WHERE
	BU_ME_ID = 'ABC123' 
		AND BU_STATE IN('구매','구매확정');
        
# ABC123 회원이 누적 구매금액을 조회하는 쿼리
SELECT 
	BU_ME_ID, SUM(PR_PRICE* BU_AMOUNT) 누적구매금액
FROM
	BUY 
		JOIN
        PRODUCT ON PR_CODE = BU_PR_CODE
WHERE BU_STATE IN('구매','구매확정') AND BU_ME_ID = 'ABC123'
group by BU_ME_ID;

# 회원별 누적 금액을 조회하는 쿼리
SELECT 
	ME_ID, IFNULL(FORMAT(SUM(PR_PRICE* BU_AMOUNT),0),0) 누적구매금액
FROM
	MEMBER 
		LEFT JOIN
	(SELECT * FROM BUY WHERE BU_STATE IN ('구매','구매확정'))B ON ME_ID = BU_ME_ID
		left JOIN
        PRODUCT ON PR_CODE = BU_PR_CODE
group by ME_ID;

# 1번 게시글을 신고해서 데이터가 들어가 있고 , 신고 게시글이나 댓글을 확인하려고 했을 떄
# 1 abc123 욕설 게시글 내용에 욕설이 있습니다 신고중 post1
