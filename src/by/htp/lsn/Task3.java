package by.htp.lsn;

//¬ывести на †экран все четные цифры от 1 до 100 не использу€ остаток от
//делени€ (использу€ цикл for)
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = new int[100];
		int a = 2;
		for (int i = 0; i <= 49; i++) {
			x[i] = a++;
			a++;

			System.out.print(x[i] + " ");

		}

	}
}