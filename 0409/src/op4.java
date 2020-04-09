
public class op4 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("나이 입력: ");
		int age = sc.nextInt();
		if (60 <= age){
			System.out.println("노년");
		}else if(40 <= age){
			System.out.println("장년");
		}else if(20 <= age){
			System.out.println("청년");
		}else if(20 > age) {
		System.out.println("청소년");
		}
		sc.close();
		
		
	}

}
