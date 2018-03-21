package by.htp.lsn;

public class Task1 {
	// Модифицировать пример из учебника следующим образом: цикл for
	// проходит по элементам от 300 до 197  и каждый 3 элемент выводит на
	// экран.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[105];
		int a = 300;
		for (int i = 0; i <= 103; i++) {
			x[i] = a;
			a--;

			System.out.println(x[i] + " ");
			{

			}

			System.out.println(x[i] += 2);
		}

	}

}
