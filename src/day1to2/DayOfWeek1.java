package day1to2;

import java.util.Scanner;


public class DayOfWeek1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String week[]= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		System.out.println("Enter the day number");
		int x=sc.nextInt();
		System.out.println("Day of the week is "+week[x-1]);
		sc.close();
	}

}
