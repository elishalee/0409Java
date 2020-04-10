
public class sw1 {

	public static void main(String[] args) {
	
		final int CAT = 1;
		final int DOG = 2;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("선호하는 반려동물을 고르시오 1.고양이 2. 강아지");
		int animal = sc.nextInt();
		
		switch (animal) {
		case CAT :
			System.out.println("고양이");
			break;
		case DOG :
			System.out.println("강아지");
			break;
		default :
			System.out.println("잘못된 값입니다");
		    break;
		}
		sc.close();

	}

}
