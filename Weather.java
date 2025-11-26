package java1;

import java.util.Scanner;

public class Weather {
	public static void main (StringExample[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Today's temperature is: " );
		int temperature = scanner.nextInt();		
		System.out.println( + temperature );
		
		if(temperature <= 40) {
			System.out.println("Today's temperature is freezing cold!");
		}
		else if (temperature > 40  && temperature <= 70) {
			System.out.println("Today's temperature is very comfortable!");
		}
		else {
			System.out.println("Today's weather feels very hot!");		
		}
		
		
	}
}
