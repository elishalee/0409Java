
public class it6 {

	public static void main(String[] args) {
		
		int [] ar = {30, 40, 2, 17, 76, 65};
		int idx = 0;
		int sum = 0;
		do {
			sum = sum + ar[idx];
			idx = idx + 1;
		}while (idx < 6);
		
		System.out.println("합계 : " + sum);
		
		double avg = sum / 6.0;
		System.out.println("평균 : " + avg);
		avg = avg * 10 + 0.5; //반올림할 자리를 소수 첫째자리로 보내고 + 0.5 
		avg = (int)avg; //정수로 변환해서 소수를 버림
		avg = avg / 10;
		System.out.println("평균 : " + avg);
		
		
	}

}
