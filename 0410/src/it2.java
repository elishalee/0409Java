
public class it2 {

	public static void main(String[] args) {
		//image1.png, image2.png, image3.png
		//을 번갈아가면서 3번씩 출력
		int idx = 0;
		while(idx < 9) {
			System.out.println("image"+ (idx%3+1) + ".png");
			idx = idx + 1;
		}
		
		

	}

}
