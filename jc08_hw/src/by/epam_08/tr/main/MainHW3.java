package by.epam_08.tr.main;

import java.util.Arrays;

public class MainHW3 {

	public static void main(String[] args) {
		// 3. Объединение и сортировка двух массивов
		// Даны два отсортированных по возрастанию массива целых чисел A длиной N и B
		// длиной M. Объедините эти массивы в один отсортированный по возрастанию массив
		// C длиной N + M.

		int[] arr = new int[] { -21, 20, 3, 45, -5 };
		int[] arr2 = new int[] { 11, -2, 238, -44, 5 };

		int[] arr3 = new int[arr.length + arr2.length];
//копируем массивы
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		System.arraycopy(arr2, 0, arr3, arr.length, arr2.length);

		System.out.println(Arrays.toString(arr3));
//пузырёк
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;

			for (int i = 0; i < arr3.length - 1; i++) {
				if (arr3[i] > arr3[i + 1]) {
					temp = arr3[i];
					arr3[i] = arr3[i + 1];
					arr3[i + 1] = temp;
					sorted = false;
				}

			}

		}

		System.out.println("Отсортированный массив:\t\t ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("%4d ", arr3[i]);
		}
		System.out.println();

	}
}
