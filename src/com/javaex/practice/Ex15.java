package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] agrgs) {
		
		double km;
		double mile;
		final double RATE = 1.609;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("마일을 입력하세요: ");
		mile = sc.nextDouble();
		km = mile*RATE;
		
		System.out.println(mile + "마일은 " + km + "킬로미터 입니다." );
		
		sc.close();
	}
	
}
