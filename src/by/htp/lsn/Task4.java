package by.htp.lsn;

public class Task4 {
	// Вывести на экран числа от 10 до -10
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = new int[21];
		int a = 10;
		for (int i = 0; i < 21; i++) {
			x[i] = a;
			a--;

			System.out.print(x[i] + " ");

		}
	}
}
