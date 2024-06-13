package day12;

public class StringBufferEx01 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer ("Hello world");
		
		sb.append("!");
		System.out.println(sb);

		sb.insert(0, "\"");
		sb.append("\"");
		System.out.println(sb);

		//delete (시작번지 ,끝번지)
		sb.delete(7, sb.length()-1);
		System.out.println(sb);
		
		
		
	}

}
