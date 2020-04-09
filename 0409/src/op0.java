public class op0 {
	

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int result = a > b ? a : b;
		System.out.println("결과 : " + result);
		
		//=====================================
		
		String w1 = "콜라";
		String w2 = "사이다";
		//2개의 내용물을 swap
		//빈 컵을 만들고 콜라를 대입 
		String temp = w1;
		//콜라가 들어있던 컵에 사이다를 대입 
		w1 = w2;
		//사이다가 들어있던 컵에 콜라를 대입 
		w2 = temp;
		
		System.out.println("w1 : " + w1);
		System.out.println("w2 : " + w2);
		
		//=====================================
		
		//키보드 입력 객체 만들기 
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("나이 입력: ");
	    int age = sc.nextInt();
	    sc.nextLine();
		System.out.println("이름 입력: ");
	    String name = sc.nextLine();
	    System.out.println(name + " : " + age);
	
	    sc.close();
	    
		//=====================================
	    
		java.util.Scanner sc2 = new java.util.Scanner(System.in);
		System.out.println("점수 입력: ");
	    int score = sc2.nextInt();
	    
	    if (60 <= score) {
	    	System.out.println("합격");
	    }
	    
	    System.out.println("종료");
	    
	    if (59 >= score) {
	    	System.out.println("종료");
	    }
	    
	    sc2.close();
	    
		    
	    
	}

}
