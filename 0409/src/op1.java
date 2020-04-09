

public class op1 {

	public static void main(String[] args) {
		java.util.Scanner sc2 = new java.util.Scanner(System.in);
		System.out.println("점수 입력: ");
		int score = sc2.nextInt();

		if (60 <= score) {
			System.out.println("합격");
		}else { 
			System.out.println("불합격");
		}
		
		System.out.println("종료");

		sc2.close();
				
		
	}

}
