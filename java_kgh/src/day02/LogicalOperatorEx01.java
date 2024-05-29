package day02;

public class LogicalOperatorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//논리 연산자 예제 
		
		// 성적이 b 학점인지 확인하는 예제
		
		int score = 80;
		boolean isB;
		/*score 가 80점 이상이고, score 가 90점 미만이다
		* score가 80점 이상이고, score가 90점 미만이다
		* score가 80보다 크거나 같고  score가 90보다 작다
		* score가 80보다 크거나 같다 && score가 90보다 작다
		*  score >= 80 && score < 90;
			
			&& 연산자 진리표
		*	A	B	A&&B
		*	T	T	T
		*	T	F	F
		*	F	F	F	
		*	F	T	F
		*	|| 연산자 진리표
		*	A	B	A||B
		*	T	T	T
		*	T	F	T
		*	F	F	F	
		*	F	T	T
		*	
		*
		*	! 연산자 진리표
			A	!A
			T	F
			F	T
			
		
		*/
		
		isB= score >= 80 && score < 90;
		System.out.println(score+ "점은 B 학점인가요?"+ isB);
		
		
	/* 정보처리 기사 필기시험을 보는데 4과목 중 하나라도 과락이 있으면 탈락이다
	과락은 과목 점수가 40 미만인 경우이다 
	각 과목의 성적이 다음과 같을 떄 확인하는 코드 작성
		*/
		
		int sub1= 60, sub2= 100, sub3= 30,sub4 = 80;
		//과목 1 성적이 40 미만이거나 과목 2 성적이 40 미만이거나 과목 3 성적이 40 미만이거나 과목 4 성적이 40 미만이다
		// sub1 이 40보다 작다 || sub2 40보다 작다 || sub3 40보다 작다 sub4 40보다 작다
		// sub1<40||sub2<40||suv3<40||sub4<40
		//
		
		
		boolean isFail = sub1<40||sub2<40||sub3<40||sub4<40;
		System.out.println("과락이 있습니까?" +"   "+ isFail);
		
		
		//나이가 주어지면 미성년자인지  판별
		//나이가 19 이상이 아니다 
		//!(나이가 19세 이상이다)
		// 나이가 19보다 크거나 같다
		// !(age >= 19)
		
		
		int age= 20;
		boolean isMinor =!(age >= 19);
		System.out.println("미성년자입니까?"+ isMinor);
		
		
		int low = 40;
		boolean gg = (low<30);
		System.out.println(gg);
		
		
		
		
		
	}

}
