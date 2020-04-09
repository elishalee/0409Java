
public class op3 {

	public static void main(String[] args) {
		  java.util.Scanner kr = new java.util.Scanner(System.in);
		    System.out.println("아이디 : ");
		    String ID = kr.nextLine();
		    System.out.println("비밀번호 : ");
		    String PW = kr.nextLine();
		    
		    if (ID.equals("south") && PW.equals("korea")) {
		    	System.out.println("로그인 성공");
		    }else { 
		    	System.out.println("잘못된 비밀번호");
		    }
		    kr.close();
			

	}

}
