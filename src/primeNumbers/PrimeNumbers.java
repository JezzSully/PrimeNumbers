package primeNumbers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrimeNumbers {
	
	//Time taken for 3,000,000 = 4:55.
	
	public static void main(String[] args)
	{
		int maxNumber = 3000000;
		boolean isPrime = true;
		int countPrimes = 1;
		
		System.out.println("2");
		for(int i = 3; i < maxNumber; i = i + 2)
		{
			isPrime = true;
			for(int j = 3; j < i/2; j = j + 2)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				countPrimes++;
				System.out.println(i);
			}
		}
		System.out.println("There are " + countPrimes + " prime numbers below " + maxNumber);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
	}
}
