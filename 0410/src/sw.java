
public class sw {

	public static void main(String[] args) {
		
	final int KOREAN = 1;
	final int JAPANESE = 2;
	final int CHINESE = 3;
	final int WESTERN = 4;
	
		
		java.util.Scanner me = new java.util.Scanner(System.in);
		System.out.println("메뉴 번호를 고르시오 1. 한식 2. 일식 3. 중식 4. 양식");
		int menu = me.nextInt();
		
		switch (menu) {
		case KOREAN : 
			System.out.println("한식");
			break;
		case JAPANESE :
			System.out.println("일식");
		    break;
		case CHINESE :
			System.out.println("중식");
			break;
		case WESTERN :
			System.out.println("양식");
		    break;
		default : 
			System.out.println("잘못된 값입니다");
		    break;
		}
	    me.close();

	    
	    

	}

}
