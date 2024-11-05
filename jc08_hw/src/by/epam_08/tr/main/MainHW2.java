package by.epam_08.tr.main;

import java.util.Scanner;

public class MainHW2 {

	public static <Scaner> void main(String[] args) {
		// Проверка массива на палиндром
		//Дан массив символов A длиной N. Определите, является ли этот массив палиндромом
		//(читается одинаково слева направо и справа налево).

		Scanner inpN = new Scanner(System.in);
		System.out.println("Введиет число");
		int num= inpN.nextInt();
		//сравниваем по половинкам
		int reverseNum=0, initialNum, remainder=0;
		initialNum = num;
		for(;num!=0;num/=10)
		{
			remainder= num %10;
			reverseNum = (reverseNum * 10) + remainder;
		}
		
		if (initialNum == reverseNum)
		{
		System.out.println("Да  число " + initialNum +" Палиндром." );
		}
		else 
		{
			System.out.println("Нет число " + initialNum +" не Палиндром." );
		}
	
	}
	

}
