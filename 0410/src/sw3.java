
public class sw3 {

	public static void main(String[] args) {
		final String RED = "빨강";

		final String GREEN = "초록";



		java.util.Scanner co = new java.util.Scanner(System.in);

		System.out.println("잘 익은 사과의 색상을 말하시오");

		String color = co.nextLine();



		switch (color) {

		case RED :

		System.out.println("정답");

		break;

		case GREEN :

		System.out.println("초록색 사과는 아오리 사과입니다");

		break;



		default :

		System.out.println("잘못된 값입니다");

		    break;

		}

		    co.close();

	}

}
