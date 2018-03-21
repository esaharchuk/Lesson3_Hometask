package by.htp.lsn;

public class Task5 {
	// —оздайте программу, вычисл€ющую факториал натурального числа n. ƒл€
	// вычислени€ факториала используйте цикл while (‘акториал натурального
	// числа n определ€етс€ как произведение всех натуральных чисел от 1 до n
	// включительно).
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
