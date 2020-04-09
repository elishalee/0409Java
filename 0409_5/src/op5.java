
public class op5 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("점수 입력(0~100): ");
		int score = sc.nextInt();
		if (score >= 80 && score <= 100){
			System.out.println("우수");
		}else if(score >= 60 && score <= 79){
			System.out.println("보통");
		}else if(score >= 0 && score <= 59){
			System.out.println("노력");
		}else {
		System.out.println("잘못된 점수");
		}
		
		sc.close();
		

	}

}
