package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] agrgs) {
		
		int salary;
		int saveMoney;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요: ");
		salary = sc.nextInt();
		
		saveMoney = salary * 12 * 10;
		System.out.println("10년동안 최대 저축액은 " + saveMoney + "원 입니다.");
		
		sc.close();
	}
	
}
