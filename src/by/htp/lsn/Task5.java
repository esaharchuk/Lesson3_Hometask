package by.htp.lsn;

public class Task5 {
	// �������� ���������, ����������� ��������� ������������ ����� n. ���
	// ���������� ���������� ����������� ���� while (��������� ������������
	// ����� n ������������ ��� ������������ ���� ����������� ����� �� 1 �� n
	// ������������).
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f = 1;
		int i = 1;

		while (i <= 4) {
			f = f * i;
			i++;
		}

		System.out.println(f);

	}
}
