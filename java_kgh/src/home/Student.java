package home;

import day10.VocabularyEx01.Word;

ublic class Start {
	public static void printTwotimeA() {

		System.out.println("안녕하세요");
		System.out.println("=");
		System.out.println("=");
	}
	public static void main(String[] args) {
		
		printTwotimeA();
	}
}

		
		
		

		
		
		
public static void surchWord(Word[] list, int wordCount) {
	//검색할 단어를 입력
	System.out.print("단어 : ");
	String word = scan.next();
	int count = 0;
	//단어 리스트에 수정할 단어와 일치하는 단어들을 번호와 함께 출력
	for(int i = 0; i < wordCount; i++) {
		if(list[i].getWord().equals(word)) {
			System.out.print(i+1+".");
			list[i].print();// 여기서 list[i]의 정보를 출력해야함
			//
		}
	}
	if(count == 0) {
		System.out.println("없는 단어입니다 .");
		return;
	}
}
	public static void deleteWord(Word[] list, int wordCount) {
		//검색할 단어를 입력
		System.out.print("단어 : ");
		String word = scan.next();
		int count = 0;
		for(int i = 0; i < wordCount; i++) {
			if(list[i].getWord().equals(word)) {
				System.out.print(i+1+".");
				list[i].print(); 
				System.out.print(list[i]+"를 삭제하시겠습니까?");
				
		}
	}
		if(count == 0) {
			System.out.println("삭제할 단어를 잘못 입력했습니다  .");
			return;
		}
