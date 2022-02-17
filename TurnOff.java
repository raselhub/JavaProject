package com.rasel;

import java.util.Scanner;
import java.io.IOException;


public class TurnOff {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Time in seconds:  ");
		Double timeInSeconds = scanner.nextDouble();
		Runtime runtime = Runtime.getRuntime();
		
		Process p = runtime.exec("turnoff -s -t" + timeInSeconds);
		System.exit(1);
		

	}

}
