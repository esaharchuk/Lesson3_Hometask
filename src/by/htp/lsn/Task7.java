package by.htp.lsn;

public class Task7 {

	public static void main(String[] args) {
		// Все элементы массива поделить на значение наибольшего элемента этого массива.

		int[] mas = new int[10];
		int max = mas[0];
		double z = 0;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) Math.floor(Math.random() * 9);

			System.out.print(mas[i] + "  ");

		}

		for (int i = 0; i < mas.length; i++) {

			if (max < mas[i]) {
				;
				max = mas[i];
			}
		}
		System.out.println("\n Maximum = " + max);

		for (int i = 0; i < mas.length; i++) {
			z = mas[i] / max;

			System.out.println(z);

		}
	}
}
