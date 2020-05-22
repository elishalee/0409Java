import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class StringDownload {

	public static void main(String[] args) {
		try {
			// �ٿ�ε� ���� url ����
			String addr = "https://www.naver.com/";
			URL url = new URL(addr);

			// ����
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// ��Ʈ�� �����
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			//�� ������ �б�
			while(true) {
				String line = br.readLine();
				if(line==null) {
					break;
				}
				System.out.println(line);
				
			}

		} catch (Exception e) {

		}
	}

}
