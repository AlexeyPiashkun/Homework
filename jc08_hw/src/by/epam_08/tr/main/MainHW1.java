package by.epam_08.tr.main;

public class MainHW1 {

	public static void main(String args[]) {
		// Циклический сдвиг элементов массива
		//Дан одномерный целочисленный массив A длиной N и число K. Реализуйте алгоритм
		//циклического сдвига элементов массива на K позиций вправо. Элементы, выходящие
		//за пределы массива, должны перемещаться в начало.

		int k = 2;		
		int [] mas = new int []{1, 2, 3, 4, 5};	
		
		// вывод массива
		System.out.println("Наш  массив");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d] ", mas[i]);
		}
		System.out.println();
		
		
		// Сдвиг
		int temp = mas[0];
		for (int i = 0; i < mas.length - k; i++) {
			mas[i] = mas[i + 1];
		}
		mas[mas.length - k] = temp;
		
		//Вывод результата
		System.out.println("Сдвиг массива на К");
		for(int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}

		
		
		 

		
		
		
	
	}


	}

