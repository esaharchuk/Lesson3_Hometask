package by.htp.lsn;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Вывести на экран все четные цифры от 1 до 100
		int x[] = new int[100];
		int a = 1;
		for (int i = 0; i <= 99; i++) {
			x[i] = a;
			a++;

			if (x[i] % 2 == 0) {
				System.out.print(x[i] + " ");
			}
		}

	}
}
