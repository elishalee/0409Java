
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.prefs.CsvPreference;

public class CSVRead {

	public static void main(String[] args) {
		// csv ���� �б� ��ü �����
		try (CsvBeanReader reader = new CsvBeanReader(
				new BufferedReader(new InputStreamReader(
						new FileInputStream("C:\\Users\\30406\\Downloads\\2018�� ������ û�ҳ� 5����� ��Ȳ.csv"))),
				CsvPreference.STANDARD_PREFERENCE)) {

			// ���� �б� ��ü�� �����Ǿ����� Ȯ��
			// System.out.println(reader);

			// ù��° ���� ������� ���θ� ����
			// ù��° ���� ���� ����
			reader.getHeader(true);

			// DTO Ŭ������ �������� ������� ���ڿ� �迭�� ����
			// �� �κ��� ������ �� ���� �����͸� �о��� ��
			// ������ ����
			String[] headers = { "classfication", "murder", "steal", "rape", "violence" };

			// �������� ����
			CellProcessor[] processors = new CellProcessor[] { new Optional(), new ParseInt(new Optional()),
					new ParseInt(new Optional()), new ParseInt(new Optional()), new ParseInt(new Optional()), };

			// ���� �����͸� ������ DTO�� List�� ����
			List<Crime> list = new ArrayList<Crime>();

			// �����͸� �о ����
			while (true) {
				Crime crime = reader.read(Crime.class, headers, processors);
				// ���̻� ���� ���ϸ� ����
				if (crime == null) {
					break;
				}
				// ���� ��쿡�� list�� �߰�
				list.add(crime);
			}
			
			//������ ���
			for(Crime crime : list) {
				System.out.println(crime.getClassfication() + ":" + crime.getMurder());
			}

		} catch (Exception e) {
			System.out.println("csv �б� ����");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
