package by.epam_08.tr.main;

public class MainHw4 {

	public static void main(String[] args) {
		// Поиск второго максимального элемента
		// Дан массив целых чисел A длиной N. Найдите второй по величине элемент массива
		// без использования встроенных функций сортировки.
		int[] masa = new int[] { 101, 5, 0, 32, 14, 50 };
		int maxa = Integer.MIN_VALUE;
		int maxb = Integer.MIN_VALUE;

		System.out.println("Наш  массив");
		for (int i = 0; i < masa.length; i++) {
			System.out.printf("[%4d] ", masa[i]);
		}
		System.out.println();

		// Поиск второго по величине элемента
		for (int i = 0; i < masa.length; i++) {
			if (masa[i] > maxa) {
				maxb = maxa;
				maxa = masa[i];
			} else if (masa[i] > maxb && masa[i] != maxa) {
				maxb = masa[i];
			}
		}

		System.out.println("Второй по величине элемент: " + maxb);

	}

}
