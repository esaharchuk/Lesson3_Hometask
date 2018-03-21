package by.htp.lsn;

public class Task6 {

	public static void main(String[] args) {
		// 2. Задайте натуральное число. Найдите сумму четных цифр, входящих в его
		// состав.
		int n = 1216;
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			if (digit % 2 == 0) {
				sum = sum + digit;
			}
			n /= 10;

		}

		System.out.print(sum);

	}
}