
public class sw2 {

	public static void main(String[] args) {
		final String [] RED = {"빨강","빨간색"};
		final String [] GREEN = {"초록,"초록색"};
		
		java.util.Scanner co = new java.util.Scanner(System.in);
		System.out.println("잘 익은 사과의 색상을 말하시오");
		String color = co.nextLine();

	   if(color.contentEquals(RED[0]) || color.contentEquals(RED[1])){
		   System.out.println("정답");
	   }else if (color.contentEquals(GREEN[0]) || color.contentEquals(GREEN[1])){
		   System.out.println("초록색은 아오리 사과입니다");
	   }
	  co.close();
	  
	}

}
