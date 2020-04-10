
public class it7 {

	public static void main(String[] args) {
		// 1.합계 구하기 
		int [] ar = {700, 600, 500, 430};
		
		int idx = 0;
		int sum = 0;
		//반복문 만들기 : 0 - 3까지 진행 
		do {
		//ar의 데이터를 순서대로 sum에 추가 
		sum = sum + ar[idx];
		idx = idx + 1;
		}while (idx < 4);
		System.out.println("합계 : " + sum);
		
		// 2. 평균 구하기 - 합계 / 데이터 개수 
		int avg = sum / 4;
		System.out.println("평균 : " + avg); 
		
		// 3. 반올림 구하기
		// 1) 반올림할 위치를 소수 첫째 자리로 이동
		double imsi = avg / 100.0;
		// 2) 0.5를 버려서 소수를 버림
		imsi = (int)(imsi + 0.5);
		// 3) 원래 자리로 되돌리는 연산을 수행
		avg = (int)imsi * 100;
		System.out.println("답 : " + avg);
		

	}

}
